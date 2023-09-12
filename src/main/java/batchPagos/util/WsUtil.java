package batchPagos.util;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

import batchPagos.main;
import batchPagos.arServices.AcctAccessCodePayType;
import batchPagos.arServices.AcctAccessCodeType;
import batchPagos.arServices.InvoiceInfoQueryInvoiceType;
import batchPagos.arServices.QueryInvoicePetType;
import batchPagos.arServices.QueryInvoiceRespType;
import batchPagos.controlData.BesAdditionalPropertyType;
import batchPagos.controlData.BesCbsOperatorInfoType;
import batchPagos.controlData.BesCbsOwnershipInfoType;
import batchPagos.controlData.BesCbsRequestHeaderType;
import batchPagos.controlData.BesCbsTimeFormatType;
import batchPagos.controlData.ControlDataRequestHeaderType;
import batchPagos.pojos.Invoice;
import batchPagos.webService.CbsResponse;

public class WsUtil {
	private final static Logger log = Logger.getLogger(main.class);
	public ControlDataRequestHeaderType getControlDataRequestHeader(String businessCode, boolean produccion)
			throws DatatypeConfigurationException {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		ControlDataRequestHeaderType controlData = new ControlDataRequestHeaderType();
		controlData.setVersion("5.5");
		controlData.setMessageUUID(UUID.randomUUID().toString());
		controlData.setRequestDate(xmlDate);
		if (produccion) {
//			Produccion
			controlData.setSendBy("prodTelcelBES01");
		}else {
//			Preproduccion
			controlData.setSendBy("preprodTelcelBES01");
		}
		controlData.setUser("bes10003");
		controlData.setIpClient("192.168.1.64");
		controlData.setIpServer("192.168.1.1");
		controlData.setBusinessCode(businessCode);
		BesAdditionalPropertyType besAdditionalPropertyType = new BesAdditionalPropertyType();
		besAdditionalPropertyType.setValue("1");
		besAdditionalPropertyType.setCode("1");
		List<BesAdditionalPropertyType> list = new ArrayList<BesAdditionalPropertyType>();
		list.add(besAdditionalPropertyType);
		// controlData.setAdditionalProperty(list);
		BesCbsRequestHeaderType besCbsRequestHeaderType = new BesCbsRequestHeaderType();
		BesCbsOwnershipInfoType besCbsOwnershipInfoType = new BesCbsOwnershipInfoType();
		besCbsOwnershipInfoType.setBEID("101");
		besCbsOwnershipInfoType.setBRID("101");
		BesCbsOperatorInfoType besCbsOperatorInfoType = new BesCbsOperatorInfoType();
		besCbsOperatorInfoType.setOperatorID("101");
		besCbsOperatorInfoType.setChannelID("1");
		BesCbsTimeFormatType besCbsTimeFormatType = new BesCbsTimeFormatType();
		besCbsTimeFormatType.setTimeType("2");
		besCbsTimeFormatType.setTimeZoneID("1083");
		besCbsRequestHeaderType.setAccessMode("3");
		besCbsRequestHeaderType.setMsgLanguageCode("2049");
		besCbsRequestHeaderType.setOwnershipInfo(besCbsOwnershipInfoType);
		besCbsRequestHeaderType.setOperatorInfo(besCbsOperatorInfoType);
		besCbsRequestHeaderType.setTimeFormat(besCbsTimeFormatType);
		controlData.setBesCbsRequestHeader(besCbsRequestHeaderType);
		return controlData;
	}

	public QueryInvoicePetType getQueryInvoiceRequest(String account) {
		QueryInvoicePetType queryInvoicePetType = new QueryInvoicePetType();
		AcctAccessCodePayType accessCodePayType = new AcctAccessCodePayType();
		AcctAccessCodeType accessCodeType = new AcctAccessCodeType();
		
//		queryInvoicePetType.setQueryAnacrFlag("Y");
		queryInvoicePetType.setOutstandingFlag("Y");
//		accessCodeType.setPrimaryIdentity(account);
		accessCodeType.setAccountCode(account);
		accessCodePayType.setAcctAccessCode(accessCodeType);
		queryInvoicePetType.setAcctAccessCode(accessCodePayType);
		
//		Long totalRowNum = 20L;
//		Long beginRowNum = 0L;
//		Long fetchRowNum = 20L;
	
//		queryInvoicePetType.setTotalRowNum(totalRowNum);
//		queryInvoicePetType.setBeginRowNum(beginRowNum);
//		queryInvoicePetType.setFetchRowNum(fetchRowNum);
		
		return queryInvoicePetType;
	}

	public List<Invoice> processQueryInvoice(CbsResponse<QueryInvoiceRespType> invoice) {
		List<Invoice> invoices = new ArrayList<Invoice>();
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyyMMdd");
		DateFormat dfDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		DecimalFormat formatea = new DecimalFormat("##.##");
		// Hashtable<Date, Invoice> invoicesMap = new Hashtable<Date, Invoice>();
		log.info("**********************************************************************************************");
		if(invoice.getResponsePayload().value != null){
			for (InvoiceInfoQueryInvoiceType invoiceList : invoice.getResponsePayload().value.getInvoiceInfo()) {
				Invoice sipabInvoice = new Invoice();
				try {
					sipabInvoice.setFechaFactura(dFormat.parse(invoiceList.getInvoiceDate().substring(0, 8)));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				String openAmount = String.valueOf(invoiceList.getOpenAmount());
				log.info("Open Amount " +  openAmount);
				if(openAmount.length() < 5) {
					sipabInvoice.setImporteLayoutHuawei("0");
					String ceros = "";
					for(int i = 0 ; i < 6-openAmount.length() ; i++ ) {
						ceros +="0";
					}
					sipabInvoice.setImporteLayoutHuaweiString("0."+ceros+openAmount);
				}else {
					sipabInvoice.setImporteLayoutHuawei(openAmount.substring(0,openAmount.length()-4));
					Double open = Double.valueOf(invoiceList.getOpenAmount())/1000000;
					sipabInvoice.setImporteLayoutHuaweiString(String.format("%.2f", open));
				}
				sipabInvoice.setCiclo(invoiceList.getBillCycleID());
				sipabInvoice.setCuenta(invoiceList.getAcctCode());
				sipabInvoice.setEstatus(invoiceList.getStatus());
				String invoiceAmount = String.valueOf(invoiceList.getInvoiceAmount());
				Double total = Double.parseDouble(invoiceAmount.substring(0,invoiceAmount.length()-6)+"."+invoiceAmount.substring(invoiceAmount.length()-6,invoiceAmount.length()));
				sipabInvoice.setImporte((total));
				sipabInvoice.setIva(invoiceList.getTaxAmount());
				sipabInvoice.setNumeroFactura(invoiceList.getInvoiceNo());
				sipabInvoice.setTotal(invoiceList.getInvoiceAmount());
				sipabInvoice.setAccountKey(invoiceList.getAcctKey());
				sipabInvoice.setInvoiceId(invoiceList.getInvoiceID());
				sipabInvoice.setInvoiceNo(invoiceList.getInvoiceNo());
				sipabInvoice.setTransType(invoiceList.getTransType());
				invoices.add(sipabInvoice);
			}
		}
		return invoices;
	}
}
