package batchPagos.huaweiLayout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

import batchPagos.pojos.Invoice;
import batchPagos.pojos.LayoutEntrada;
import batchPagos.pojos.LayoutHuawei;
import batchPagos.util.Fichero;
import batchPagos.webService.CbsCliente;

public class CsvUtil {
	private final static Logger log = Logger.getLogger(CsvUtil.class);
	private CbsCliente cbsClient = new CbsCliente();

	public List<LayoutEntrada> generarListaLayoutEntrada(File file) {
		List<LayoutEntrada> listEntrada = new ArrayList<LayoutEntrada>();
		try {
			FileReader filereader = new FileReader(file);
			CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
			List<String[]> allData = csvReader.readAll();
			log.info("[INFO] Numero de registros ----> " + allData.size());
			// print Data
			for (String[] row : allData) {
				if (!row.equals(null)) {
					if (!row[0].equals("")) {
						LayoutEntrada layout = new LayoutEntrada();
						layout.setCuenta(row[0]);
						layout.setRegion(row[1]);
						layout.setComentario(row[2]);
						listEntrada.add(layout);
					}
				}
			}
			filereader.close();
		} catch (Exception e) {
			log.info("[ERROR] ", e);
		}
		return listEntrada;
	}

	public List<LayoutHuawei> generarListaLayoutHuawei(List<LayoutEntrada> listaEntrada, boolean produccion) {
		List<LayoutHuawei> listLayoutHuawei = new ArrayList<LayoutHuawei>();
		List<Invoice> facturas = new ArrayList<Invoice>();
		try {
			log.info("[INFO] Generamos Layout HW ----> ");
			for (LayoutEntrada layoutEntrada : listaEntrada) {
				log.info("[INFO] Cuenta " + listLayoutHuawei.size() + " de " + listaEntrada.size());
				log.info("[INFO] Cuenta ----> " + layoutEntrada.getCuenta());
				facturas = cbsClient.QueryInvoice(layoutEntrada.getCuenta(),produccion);
				log.info("[INFO] Facturas obtenidas ----> " + facturas.size());
				for (Invoice factura : facturas) {
					log.info("Factura "+(listLayoutHuawei.size()+1)+ " de " + listaEntrada.size());
					LayoutHuawei layoutHuawei = new LayoutHuawei();
					layoutHuawei.setAcountCode(layoutEntrada.getCuenta());
					layoutHuawei.setRegion(layoutEntrada.getRegion());
					layoutHuawei.setReasonCode("AC_AJCRASE");
					layoutHuawei.setAdjustType("CR");
					layoutHuawei.setOpType(1);
					layoutHuawei.setAmount(Double.parseDouble(factura.getImporteLayoutHuawei()));
					layoutHuawei.setAmountFormat(factura.getImporteLayoutHuaweiString());
//					layoutHuawei.setAmount(100L); //1 Peso
					layoutHuawei.setRemark(layoutEntrada.getComentario());
					layoutHuawei.setBillCycleID(factura.getCiclo());
					layoutHuawei.setInvoiceNo(factura.getInvoiceNo());
					layoutHuawei.setInvoiceId(factura.getInvoiceId());
					layoutHuawei.setInvoiceDate(factura.getFechaFactura());
					layoutHuawei.setRegion(layoutEntrada.getRegion());
					if (facturas.size()>1) {
						layoutHuawei.setInvoices(true);
					}else {
						layoutHuawei.setInvoices(false);
					}
					listLayoutHuawei.add(layoutHuawei);
				}
			}
		} catch (Exception e) {
			log.info("[ERROR] ", e);
		}
		return listLayoutHuawei;
	}

	public File generarLayoutHuawei(String path, String name, List<LayoutHuawei> listaLayoutHuawei) {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		File file = new File(path +"AJUSTES_"+name.replace(".csv", "") + "_" + timeStamp + ".csv");
		try {
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);
			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile, ',', CSVWriter.NO_QUOTE_CHARACTER);
			// adding header to csv
//			String[] header = { "Account", "Service Number", "Reason Code", "Adjust Type", "Op Type", "Open Amount",
//								"Ext Trans Id" , "Bill Cycle ID" , "Acct Balance", "Balance Type", "Eff Date", "Exp Date",
//								"Notify Flag", "Due Date", "Remark"
//								, "Invoice No", "Invoice ID", "Invoice Date", "Region", "Amount format"
//								};
//			 writer.writeNext(header);
			// add data to csv
			for (LayoutHuawei layoutHuawei : listaLayoutHuawei) {
				if (layoutHuawei.getInvoices()) {
					continue;
				}
//				String monto = layoutHuawei.getAmount()
				String[] data = { layoutHuawei.getAcountCode(), // 1
						layoutHuawei.getServiceNumber(), // 2
						layoutHuawei.getReasonCode(), // 3
						layoutHuawei.getAdjustType(), // 4
						String.valueOf(layoutHuawei.getOpType()), // 5  10.0
						String.valueOf(layoutHuawei.getAmount()).contains(".")?String.valueOf(layoutHuawei.getAmount()).substring(0,String.valueOf(layoutHuawei.getAmount()).length()-2):String.valueOf(layoutHuawei.getAmount()), // 6
						layoutHuawei.getExtTransID(), // 7
						null, // 8
						layoutHuawei.getAcctBalanceID(), // 9
						layoutHuawei.getBalanceType(), // 10
						layoutHuawei.getEffDate(), // 11
						layoutHuawei.getExpDate(), // 12
						layoutHuawei.getNotifyFlag(), // 13
						layoutHuawei.getDueDate(), // 14
						layoutHuawei.getRemark() // 15
						,
						};
				writer.writeNext(data);
			}
			// closing writer connection
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}
	
	public File generarLayoutHuaweiDuplicates(String path, String name, List<LayoutHuawei> listaLayoutHuawei) {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		File file = new File(path +"AJUSTES_DUPLICADOS"+name.replace(".csv", "") + "_" + timeStamp + ".csv");
		try {
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);
			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile, ',', CSVWriter.NO_QUOTE_CHARACTER);
			// adding header to csv
//			String[] header = { "Account", "Service Number", "Reason Code", "Adjust Type", "Op Type", "Open Amount",
//								"Ext Trans Id" , "Bill Cycle ID" , "Acct Balance", "Balance Type", "Eff Date", "Exp Date",
//								"Notify Flag", "Due Date", "Remark"
//								, "Invoice No", "Invoice ID", "Invoice Date", "Region", "Amount format"
//								};
//			 writer.writeNext(header);
			// add data to csv
			for (LayoutHuawei layoutHuawei : listaLayoutHuawei) {
				if (!layoutHuawei.getInvoices()) {
					continue;
				}
				String[] data = { layoutHuawei.getAcountCode(), // 1
						layoutHuawei.getServiceNumber(), // 2
						layoutHuawei.getReasonCode(), // 3
						layoutHuawei.getAdjustType(), // 4
						String.valueOf(layoutHuawei.getOpType()), // 5
						String.valueOf(layoutHuawei.getAmount()), // 6
						layoutHuawei.getExtTransID(), // 7
						layoutHuawei.getBillCycleID(), // 8
						layoutHuawei.getAcctBalanceID(), // 9
						layoutHuawei.getBalanceType(), // 10
						layoutHuawei.getEffDate(), // 11
						layoutHuawei.getExpDate(), // 12
						layoutHuawei.getNotifyFlag(), // 13
						layoutHuawei.getDueDate(), // 14
						layoutHuawei.getRemark() // 15
//						,layoutHuawei.getInvoiceNo(),
//						layoutHuawei.getInvoiceId().toString(),
//						format.format(layoutHuawei.getInvoiceDate()),
//						layoutHuawei.getRegion(),
						,String.valueOf(layoutHuawei.getAmountFormat()),
						};
				writer.writeNext(data);
			}
			// closing writer connection
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}

	public File generarReporte(String path, String name, List<LayoutHuawei> listaLayoutHuawei) {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		File file = new File(path + "Reporte_" + name.replace(".csv", "") + ".csv");
		try {
			Double R01 = 0.0, R02 = 0.0, R03 = 0.0, R04 = 0.0, R05 = 0.0, R06 = 0.0, R07 = 0.0, R08 = 0.0, R09 = 0.0,
			Total = 0.0;
			Map<String, String> cuentasR1 = new HashMap<String, String>(), cuentasR2 = new HashMap<String, String>(), cuentasR3 = new HashMap<String, String>(), 
			cuentasR4 = new HashMap<String, String>(), cuentasR5 = new HashMap<String, String>(),cuentasR6 = new HashMap<String, String>(), 
			cuentasR7 = new HashMap<String, String>(), cuentasR8 = new HashMap<String, String>(), cuentasR9 = new HashMap<String, String>(),
					cuentasTotales = new HashMap<String, String>();
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);
			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile);
			// adding header to csv
			String[] tittle = { "Reporte de ajustes por region" };
			writer.writeNext(tittle);
			String[] header = { "Región", "Total" , "Numero de Cuentas"};
			writer.writeNext(header);
			// add data to csv
			for (LayoutHuawei layoutHuawei : listaLayoutHuawei) {
				Double monto = layoutHuawei.getAmount()/100;
				if (layoutHuawei.getRegion().trim().equals("R01") || layoutHuawei.getRegion().trim().contains("1")) {
					R01 += monto;
					Total += monto;
					cuentasR1.put(layoutHuawei.getAcountCode(), layoutHuawei.getAcountCode());
				} else if (layoutHuawei.getRegion().trim().equals("R02")
						|| layoutHuawei.getRegion().trim().contains("2")) {
					R02 += monto;
					Total += monto;
					cuentasR2.put(layoutHuawei.getAcountCode(), layoutHuawei.getAcountCode());
				} else if (layoutHuawei.getRegion().trim().equals("R03")
						|| layoutHuawei.getRegion().trim().contains("3")) {
					R03 += monto;
					Total += monto;
					cuentasR3.put(layoutHuawei.getAcountCode(), layoutHuawei.getAcountCode());
				} else if (layoutHuawei.getRegion().trim().equals("R04")
						|| layoutHuawei.getRegion().trim().contains("4")) {
					R04 += monto;
					Total += monto;
					cuentasR4.put(layoutHuawei.getAcountCode(), layoutHuawei.getAcountCode());
				} else if (layoutHuawei.getRegion().trim().equals("R05")
						|| layoutHuawei.getRegion().trim().contains("5")) {
					R05 += monto;
					Total += monto;
					cuentasR5.put(layoutHuawei.getAcountCode(), layoutHuawei.getAcountCode());
				} else if (layoutHuawei.getRegion().trim().equals("R06")
						|| layoutHuawei.getRegion().trim().contains("6")) {
					R06 += monto;
					Total += monto;
					cuentasR6.put(layoutHuawei.getAcountCode(), layoutHuawei.getAcountCode());
				} else if (layoutHuawei.getRegion().trim().equals("R07")
						|| layoutHuawei.getRegion().trim().contains("7")) {
					R07 += monto;
					Total += monto;
					cuentasR7.put(layoutHuawei.getAcountCode(), layoutHuawei.getAcountCode());
				} else if (layoutHuawei.getRegion().trim().equals("R08")
						|| layoutHuawei.getRegion().trim().contains("8")) {
					R08 += monto;
					Total += monto;
					cuentasR8.put(layoutHuawei.getAcountCode(), layoutHuawei.getAcountCode());
				} else if (layoutHuawei.getRegion().trim().equals("R09")
						|| layoutHuawei.getRegion().trim().contains("9")) {
					R09 += monto;
					Total += monto;
					cuentasR9.put(layoutHuawei.getAcountCode(), layoutHuawei.getAcountCode());
				} else {
					log.info("Ninguna region coincide");
				}
				cuentasTotales.put(layoutHuawei.getAcountCode(), layoutHuawei.getAcountCode());
			}
			//{0 = region , 1 = valor , 2 = cuentas}
			String[] region01 = { "R01", "$" + formatNumber(R01) , String.valueOf(cuentasR1.size())};
			writer.writeNext(region01);
			String[] region02 = { "R02", "$" + formatNumber(R02) , String.valueOf(cuentasR2.size())};
			writer.writeNext(region02);
			String[] region03 = { "R03", "$" + formatNumber(R03) , String.valueOf(cuentasR3.size())};
			writer.writeNext(region03);
			String[] region04 = { "R04", "$" + formatNumber(R04) , String.valueOf(cuentasR4.size())};
			writer.writeNext(region04);
			String[] region05 = { "R05", "$" + formatNumber(R05) , String.valueOf(cuentasR5.size())};
			writer.writeNext(region05);
			String[] region06 = { "R06", "$" + formatNumber(R06) , String.valueOf(cuentasR6.size())};
			writer.writeNext(region06);
			String[] region07 = { "R07", "$" + formatNumber(R07) , String.valueOf(cuentasR7.size())};
			writer.writeNext(region07);
			String[] region08 = { "R08", "$" + formatNumber(R08) , String.valueOf(cuentasR8.size())};
			writer.writeNext(region08);
			String[] region09 = { "R09", "$" + formatNumber(R09) , String.valueOf(cuentasR9.size())};
			writer.writeNext(region09);
			String[] total = { "Total", "$" + formatNumber(Total), String.valueOf(cuentasTotales.size())};
			writer.writeNext(total);
			// closing writer connection
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}
	
	public double formatNumber(double monto) {
//		String montoString = String.valueOf(monto);
//		if(monto == 0) {
//			return "0";
//		}
//		return montoString.substring(0,montoString.length()-2)+"."+montoString.substring(montoString.length()-2,montoString.length());
		return monto;
	}

}
