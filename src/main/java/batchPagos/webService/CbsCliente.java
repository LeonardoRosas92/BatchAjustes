package batchPagos.webService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import batchPagos.arServices.ArServices;
import batchPagos.arServices.ArServicesHttpService;
import batchPagos.arServices.GeneralException;
import batchPagos.arServices.QueryInvoicePetType;
import batchPagos.arServices.QueryInvoiceRespType;
import batchPagos.controlData.ControlDataRequestHeaderType;
import batchPagos.controlData.ControlDataResponseHeaderType;
import batchPagos.controlData.DetailResponseType;
import batchPagos.pojos.Invoice;
import batchPagos.util.EnviarFTP;
import batchPagos.util.HeaderHandlerResolver;
import batchPagos.util.WsUtil;

public class CbsCliente {
	private final static Logger log = Logger.getLogger(CbsCliente.class);
	public List<Invoice> QueryInvoice(String account, boolean produccion) throws DatatypeConfigurationException, GeneralException {
		List<Invoice> invoices = new ArrayList<Invoice>();
		try {
			ArServicesHttpService arServicesHttpService = new ArServicesHttpService();
			HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
			arServicesHttpService.setHandlerResolver(handlerResolver);
			ArServices arServices = arServicesHttpService.getArServicesHttpPort();
			WsUtil util = new WsUtil();
			QueryInvoicePetType queryInvoicePetType = util.getQueryInvoiceRequest(account);
			ControlDataRequestHeaderType controlData = util.getControlDataRequestHeader("queryInvoice",produccion);
			Holder<ControlDataResponseHeaderType> responseControlData = new Holder<ControlDataResponseHeaderType>();
			Holder<DetailResponseType> detailResponse = new Holder<DetailResponseType>();
			Holder<QueryInvoiceRespType> invoice = new Holder<QueryInvoiceRespType>();
			CbsResponse<QueryInvoiceRespType> cbsResponse = new CbsResponse<QueryInvoiceRespType>(responseControlData,
					detailResponse, invoice);
			arServices.queryInvoice(controlData, queryInvoicePetType, responseControlData, detailResponse, invoice);
			invoices = util.processQueryInvoice(cbsResponse);
		} catch (Exception e) {
			log.error("[ERROR] ", e);
		}
		return invoices;
	}
}
