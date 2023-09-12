package batchPagos.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import com.opencsv.CSVWriter;

import batchPagos.pojos.LayoutHuawei;

public class ExcelReporte {
	private final static Logger log = Logger.getLogger(ExcelReporte.class);
	private SXSSFWorkbook wb;
	private Sheet sheet1;
	public File generarReporte(String path, String name, List<LayoutHuawei> listaLayoutHuawei) {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		File file = new File(path + "Reporte_" + name.replace(".csv", "") + ".xlsx");
		try {
			wb = new SXSSFWorkbook();				
			sheet1 = wb.createSheet("Reporte");
			this.setColumnWidth();
			Double R01 = 0.0, R02 = 0.0, R03 = 0.0, R04 = 0.0, R05 = 0.0, R06 = 0.0, R07 = 0.0, R08 = 0.0, R09 = 0.0,
			Total = 0.0;
			Map<String, String> cuentasR1 = new HashMap<String, String>(), cuentasR2 = new HashMap<String, String>(), cuentasR3 = new HashMap<String, String>(), 
			cuentasR4 = new HashMap<String, String>(), cuentasR5 = new HashMap<String, String>(),cuentasR6 = new HashMap<String, String>(), 
			cuentasR7 = new HashMap<String, String>(), cuentasR8 = new HashMap<String, String>(), cuentasR9 = new HashMap<String, String>(),
			cuentasTotales = new HashMap<String, String>();
			DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			Calendar calendario = Calendar.getInstance();
			Date fechaActual = calendario.getTime();
			String fecha = formatoFecha.format(fechaActual);
			for (LayoutHuawei layoutHuawei : listaLayoutHuawei) {
				if (layoutHuawei.getInvoices()) {
					continue;
				}
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
			String[] region01 = { "R01", R01.toString() , String.valueOf(cuentasR1.size())};
			String[] region02 = { "R02", R02.toString() , String.valueOf(cuentasR2.size())};
			String[] region03 = { "R03", R03.toString() , String.valueOf(cuentasR3.size())};
			String[] region04 = { "R04", R04.toString() , String.valueOf(cuentasR4.size())};
			String[] region05 = { "R05", R05.toString() , String.valueOf(cuentasR5.size())};
			String[] region06 = { "R06", R06.toString() , String.valueOf(cuentasR6.size())};
			String[] region07 = { "R07", R07.toString() , String.valueOf(cuentasR7.size())};
			String[] region08 = { "R08", R08.toString() , String.valueOf(cuentasR8.size())};
			String[] region09 = { "R09", R09.toString() , String.valueOf(cuentasR9.size())};
			String[] total = { "Total", Total.toString() , String.valueOf(cuentasTotales.size())};
			List<String[]> listaRegiones = new ArrayList<String[]>();
			listaRegiones.add(region01);
			listaRegiones.add(region02);
			listaRegiones.add(region03);
			listaRegiones.add(region04);
			listaRegiones.add(region05);
			listaRegiones.add(region06);
			listaRegiones.add(region07);
			listaRegiones.add(region08);
			listaRegiones.add(region09);
			listaRegiones.add(total);
			int celda = 0;
			//Row 0
			sheet1.addMergedRegion(new CellRangeAddress(0,0,0,2));
			Row row0 = sheet1.createRow(0);
			Cell cell = row0.createCell(0); 
			cell.setCellValue("REPORTE DE AJUSTES PRODUCTIVOS");
			cell.setCellStyle(this.headerStyle());
			//Row 1
			sheet1.addMergedRegion(new CellRangeAddress(1, 1, 0, 2));
			Row row1 = sheet1.createRow(1);
			Cell cell1 = row1.createCell(0);
			cell1.setCellValue("Fecha de aplicación: "+fecha);
			cell1.setCellStyle(this.tittleCenterStyle());
			//Row 2
			Row row2 = sheet1.createRow(2);
			Cell cell2_0 = row2.createCell(0); 
			cell2_0.setCellValue("Región");
			cell2_0.setCellStyle(this.tittleCenterStyle());
			Cell cell2_1 = row2.createCell(1); 
			cell2_1.setCellValue("Total");
			cell2_1.setCellStyle(this.tittleCenterStyle());
			Cell cell2_2 = row2.createCell(2); 
			cell2_2.setCellValue("Numero de cuentas");
			cell2_2.setCellStyle(this.tittleCenterStyle());
			//Regiones
			celda = 3;
			for (String[] region : listaRegiones) {
				Row row = sheet1.createRow(celda);
				Cell cell_0 = row.createCell(0); 
				cell_0.setCellValue(region[0]);
				cell_0.setCellStyle(this.tittleCenterStyle());
				Cell cell_1 = row.createCell(1); 
				cell_1.setCellValue(Double.parseDouble(region[1]));
				cell_1.setCellStyle(this.createBorderedStyleFormat());
				Cell cell_2 = row.createCell(2); 
				cell_2.setCellValue(Integer.valueOf(region[2]));
				cell_2.setCellStyle(this.createBorderedStyle());
				celda++;
			}
			FileOutputStream fileOut = new FileOutputStream(file);
			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			log.info("ERROR: ",e);
		}
		return file;
	}
	
	public File generarReporteDuplicadas(String path, String name, List<LayoutHuawei> listaLayoutHuawei) {
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		File file = new File(path + "Reporte_Duplicadas_" + name.replace(".csv", "") + ".xlsx");
		try {
			wb = new SXSSFWorkbook();				
			sheet1 = wb.createSheet("Reporte");
			this.setColumnWidth();
			Double R01 = 0.0, R02 = 0.0, R03 = 0.0, R04 = 0.0, R05 = 0.0, R06 = 0.0, R07 = 0.0, R08 = 0.0, R09 = 0.0,
			Total = 0.0;
			Map<String, String> cuentasR1 = new HashMap<String, String>(), cuentasR2 = new HashMap<String, String>(), cuentasR3 = new HashMap<String, String>(), 
			cuentasR4 = new HashMap<String, String>(), cuentasR5 = new HashMap<String, String>(),cuentasR6 = new HashMap<String, String>(), 
			cuentasR7 = new HashMap<String, String>(), cuentasR8 = new HashMap<String, String>(), cuentasR9 = new HashMap<String, String>(),
			cuentasTotales = new HashMap<String, String>();
			DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			Calendar calendario = Calendar.getInstance();
			Date fechaActual = calendario.getTime();
			String fecha = formatoFecha.format(fechaActual);
			for (LayoutHuawei layoutHuawei : listaLayoutHuawei) {
				if (!layoutHuawei.getInvoices()) {
					continue;
				}
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
			String[] region01 = { "R01", R01.toString() , String.valueOf(cuentasR1.size())};
			String[] region02 = { "R02", R02.toString() , String.valueOf(cuentasR2.size())};
			String[] region03 = { "R03", R03.toString() , String.valueOf(cuentasR3.size())};
			String[] region04 = { "R04", R04.toString() , String.valueOf(cuentasR4.size())};
			String[] region05 = { "R05", R05.toString() , String.valueOf(cuentasR5.size())};
			String[] region06 = { "R06", R06.toString() , String.valueOf(cuentasR6.size())};
			String[] region07 = { "R07", R07.toString() , String.valueOf(cuentasR7.size())};
			String[] region08 = { "R08", R08.toString() , String.valueOf(cuentasR8.size())};
			String[] region09 = { "R09", R09.toString() , String.valueOf(cuentasR9.size())};
			String[] total = { "Total", Total.toString() , String.valueOf(cuentasTotales.size())};
			List<String[]> listaRegiones = new ArrayList<String[]>();
			listaRegiones.add(region01);
			listaRegiones.add(region02);
			listaRegiones.add(region03);
			listaRegiones.add(region04);
			listaRegiones.add(region05);
			listaRegiones.add(region06);
			listaRegiones.add(region07);
			listaRegiones.add(region08);
			listaRegiones.add(region09);
			listaRegiones.add(total);
			int celda = 0;
			//Row 0
			sheet1.addMergedRegion(new CellRangeAddress(0,0,0,2));
			Row row0 = sheet1.createRow(0);
			Cell cell = row0.createCell(0); 
			cell.setCellValue("REPORTE DE AJUSTES PRODUCTIVOS");
			cell.setCellStyle(this.headerStyle());
			//Row 1
			sheet1.addMergedRegion(new CellRangeAddress(1, 1, 0, 2));
			Row row1 = sheet1.createRow(1);
			Cell cell1 = row1.createCell(0);
			cell1.setCellValue("Fecha de aplicación: "+fecha);
			cell1.setCellStyle(this.tittleCenterStyle());
			//Row 2
			Row row2 = sheet1.createRow(2);
			Cell cell2_0 = row2.createCell(0); 
			cell2_0.setCellValue("Región");
			cell2_0.setCellStyle(this.tittleCenterStyle());
			Cell cell2_1 = row2.createCell(1); 
			cell2_1.setCellValue("Total");
			cell2_1.setCellStyle(this.tittleCenterStyle());
			Cell cell2_2 = row2.createCell(2); 
			cell2_2.setCellValue("Numero de cuentas");
			cell2_2.setCellStyle(this.tittleCenterStyle());
			//Regiones
			celda = 3;
			for (String[] region : listaRegiones) {
				Row row = sheet1.createRow(celda);
				Cell cell_0 = row.createCell(0); 
				cell_0.setCellValue(region[0]);
				cell_0.setCellStyle(this.tittleCenterStyle());
				Cell cell_1 = row.createCell(1); 
				cell_1.setCellValue(Double.parseDouble(region[1]));
				cell_1.setCellStyle(this.createBorderedStyleFormat());
				Cell cell_2 = row.createCell(2); 
				cell_2.setCellValue(Integer.valueOf(region[2]));
				cell_2.setCellStyle(this.createBorderedStyle());
				celda++;
			}
			FileOutputStream fileOut = new FileOutputStream(file);
			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			log.info("ERROR: ",e);
		}
		return file;
	}
	
	public double formatNumber(double monto) {
		return monto;
	}
	
	private void setColumnWidth() {
//		HSSFSheet sheet = wb.getSheet(Constantes.NOMBRE_HOJA);
		sheet1.setColumnWidth(0, 3000);
		sheet1.setColumnWidth(1, 3000);
		sheet1.setColumnWidth(2, 5000);
	}
	
	public CellStyle headerStyle(){
		CellStyle style;
		Font headerFont = wb.createFont();
		headerFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
		headerFont.setFontHeightInPoints((short) 14);
		style = wb.createCellStyle();
		style.setAlignment(CellStyle.ALIGN_CENTER);
		style.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		style.setFont(headerFont);
		return style;
	}
	
	private CellStyle createBorderedStyle() {
		CellStyle borderedStyle = wb.createCellStyle();
		borderedStyle = this.borderStyle();
		return borderedStyle;
	}
	private CellStyle createBorderedStyleFormat() {
		CellStyle borderedStyle = wb.createCellStyle();
		borderedStyle = this.borderStyle();
		borderedStyle.setDataFormat((short) 7);
		return borderedStyle;
	}
	
	private CellStyle borderStyle() {
		CellStyle borderedStyle = wb.createCellStyle();
		borderedStyle.setBorderRight(CellStyle.BORDER_THIN);
		borderedStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
		borderedStyle.setBorderBottom(CellStyle.BORDER_THIN);
		borderedStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
		borderedStyle.setBorderLeft(CellStyle.BORDER_THIN);
		borderedStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
		borderedStyle.setBorderTop(CellStyle.BORDER_THIN);
		borderedStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
		return borderedStyle;
	}
	
	private CellStyle tittleCenterStyle() {
		Font headerFont = wb.createFont();
		headerFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
		CellStyle borderedStyle = wb.createCellStyle();
		borderedStyle = this.borderStyle();
		borderedStyle.setFont(headerFont);
		borderedStyle.setAlignment(CellStyle.ALIGN_CENTER);
		return borderedStyle;
	}
}
