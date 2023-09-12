package batchPagos;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import batchPagos.huaweiLayout.CsvUtil;
import batchPagos.pojos.LayoutEntrada;
import batchPagos.pojos.LayoutHuawei;
import batchPagos.util.EnviaMail;
import batchPagos.util.EnviarFTP;
import batchPagos.util.ExcelReporte;
import batchPagos.util.Fichero;
import batchPagos.util.Properties;

public class main {
	private final static Logger log = Logger.getLogger(main.class);

	public static void main(String[] args) {
		// LOG APLICADAS
		File log4jfile = new File(System.getProperty("user.dir") + "/properties/log4j.properties");
		PropertyConfigurator.configure(log4jfile.getAbsolutePath());
		EnviarFTP enviarFTP = new EnviarFTP();
		/* INICIA PROCESO BATCH */
		log.info("INICIA PROCESO BATCH AJUSTES DE CREDITO CICLO 25");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		Properties props = new Properties();
		Fichero fichero = new Fichero();
		java.util.Properties propiedades = new java.util.Properties();
		propiedades = props.getProps(System.getProperty("user.dir") + "/properties/config.properties");
		log.info("Path: " + propiedades.getProperty("pathArchivosEntrada"));
		Calendar calendario = new GregorianCalendar();
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		log.info("TIME " + hora);
		hora = calendario.get(Calendar.HOUR_OF_DAY);
		int min = calendario.get(Calendar.MINUTE);
		int sec = calendario.get(Calendar.SECOND);
		String ciclo = "";
		ciclo = LocalDate.now().plusMonths(-1L).format(formatter).toString().substring(0, 6).concat("25");
		log.info("*******************************************************");
		log.info("CICLO " + ciclo);
		log.info("TIME " + hora + ':' + min + ':' + sec);
		try {
			log.info("[INFO] Iniciamos busqueda");
			if (fichero.verificarFichero(fichero.generarPath(propiedades.getProperty("pathArchivosEntrada")))) {
				log.info("[INFO] Directorio encontrado");
				File[] ficheros = fichero
						.obtenerArchivos(fichero.generarPath(propiedades.getProperty("pathArchivosEntrada")));
				if (ficheros.length > 0) {
					log.info("[INFO] Archivos encontrados: " + ficheros.length);
					CsvUtil csvUtil = new CsvUtil();
					ExcelReporte excel = new ExcelReporte();
					for (File file : ficheros) {
						log.info("[INFO] Archivo: " + file.getName());
						String fileName = file.getName();
						List<LayoutEntrada> listaEntrada = new ArrayList<LayoutEntrada>();
						List<LayoutHuawei> listLayoutHuawei = new ArrayList<LayoutHuawei>();
						List<File> reportes = new ArrayList<File>();
						// Generamos lista de entrada
						listaEntrada = csvUtil.generarListaLayoutEntrada(file);
//							Eliminamos fichero
						fichero.eliminarFichero(file.getAbsolutePath());
						// Consultamos facturas por las facturas
						log.info("[INFO] Lista entrada: " + listaEntrada.size());
						boolean produccion = true;
						listLayoutHuawei = csvUtil.generarListaLayoutHuawei(listaEntrada, produccion);
						// Generamos cvs que se enviara a HW con los ajustes
						File layoutHuawei = csvUtil.generarLayoutHuawei(
								fichero.generarPath(propiedades.getProperty("pathArchivosSalida")), fileName,
								listLayoutHuawei);
						File layoutHuaweiDuplicates = csvUtil.generarLayoutHuaweiDuplicates(
								fichero.generarPath(propiedades.getProperty("pathArchivosSalida")), fileName,
								listLayoutHuawei);
						boolean resultadoArchivo = false;
//						resultadoArchivo = true;
//						Enviamos por ftp el archivo de ajustes
						resultadoArchivo = enviarFTP.enviarArchivo(layoutHuawei);
						if (resultadoArchivo) {
							reportes.add(layoutHuawei);
							reportes.add(layoutHuaweiDuplicates);
						}
						EnviaMail email = new EnviaMail("", ""); 
						email.enviaCorreo(reportes, listLayoutHuawei, ciclo, propiedades.getProperty("CORREO_REMITENTE"), propiedades.getProperty("CORREOS_DESTINATARIO"));
					}
				} else {
					log.info("[INFO] No hay archivos a procesar");
				}
			} else {
				log.info("[INFO] Directorio de entrada no Encontrado");
			}
		} catch (Exception e1) {
			log.info("[ERROR] ", e1);
			e1.printStackTrace();
		}
		log.info("END: Batch finalizado ");
	}
}
