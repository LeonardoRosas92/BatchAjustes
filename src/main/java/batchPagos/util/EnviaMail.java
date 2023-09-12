package batchPagos.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;

import org.apache.log4j.Logger;

//import mx.com.telcel.di.sds.gds.dsf.penalizacion.utils.Constantes;

import com.telcel.mail.MailProperties;

import batchPagos.main;
import batchPagos.pojos.LayoutEntrada;
import batchPagos.pojos.LayoutHuawei;

public class EnviaMail {
	private final static Logger log = Logger.getLogger(EnviaMail.class);
	/* Constantes */

	/** Variables */
	private Properties props = new Properties();
	private String from, content, to, subject = "";

	/*
	 * Establece el <I>'content'</I> del mensaje para el envio de correo.
	 * 
	 * @param content Recibe una cadena con el contenido del mensaje de correo.
	 */
	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	/*
	 * Establece al <I>'REMITENTE'</I> del correo.
	 * 
	 * @param from Recibe una cadena con el remitente del correo.
	 */
	public void setFrom(String from) throws OtherDomainException {
		if (from.indexOf('@') == -1  || from.substring(from.indexOf('@')).equals("@telcel.com") || !from.substring(from.indexOf('@')).equals("@mail.telcel.com")) { 
			throw new OtherDomainException();
		}
		this.from = from;
	}

	public String getFrom() {
		return from;
	}

	/**
	 * Establece el <I>'ASUNTO'</I> del mensaje que se va a enviar.
	 * 
	 * @param subject Recibe una cadena con el asunto del mensaje que se va a
	 *                enviar.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	/*
	 * Establece la(s) <I>'DIRECCION(ES)'</I> de correo a las cuales se desea enviar
	 * el mensaje.
	 * 
	 * @author (MODIFICACION) JCMJ Se modifica la funcionalidad
	 * 
	 * @param to Recibe una cadena con la(s) direccion(es) del correo separadas por
	 * "," en caso de ser mas de una direccion.<BR> <I>ejemplo:</I>
	 * "direccion1@mail.telcel.com<B>,</B>direccion2@mail.telcel.com<B>,</B>...<B>,</B>direccionN@mail.telcel.com"
	 */
	public void setTo(String to) throws MoreOneRcptException {
		this.to = to;
	}

	public String getTo() {
		return to;
	}

	/*
	 * Constructor
	 * 
	 * @param host smtp.telcel.com
	 * 
	 * @param user user de correo
	 * 
	 * @param password password del usuario
	 */
	public EnviaMail(String user, String password) {
		props = new Properties();

		/**
		 * Aqui debe cargarse desde el archivo el dato del host para enviar el correo
		 **/
		/** y paserlo a la variable host **/
		MailProperties mailProperties = new MailProperties(true);
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.smtp.host", mailProperties.getHost());
		props.setProperty("mail.user", user);
		props.setProperty("mail.password", password);
	}

	/**
	 * Envia un correo multipart
	 * 
	 * @throws MessagingException
	 * @throws AddressException
	 */
	public void sendMultipartAdjunto(MimeMultipart multiPart) throws MessagingException {
		Session mailSession = Session.getInstance(this.props, null);
		mailSession.setDebug(true);
		Transport transport = mailSession.getTransport();
		MimeMessage message = new MimeMessage(mailSession);
//		message.addHeader("Disposition-Notification-To","umendoza@everis.com")
		message.setSubject(this.getSubject());
		message.setFrom(new InternetAddress(this.getFrom()));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.getTo(), false));
		// put everything together
		message.setContent(multiPart);
		transport.connect();

		transport.sendMessage(message, message.getAllRecipients());

		transport.close();
	}

	public boolean enviaCorreo(List<File> archivos, List<LayoutHuawei> listaLayoutHuawei, String ciclo, String remitente, String destinatario) {
		log.info("Generamos correo...");
		boolean resultado = false;
		try {
		Double R01 = 0.0, R02 = 0.0, R03 = 0.0, R04 = 0.0, R05 = 0.0, R06 = 0.0, R07 = 0.0, R08 = 0.0, R09 = 0.0,
		Total = 0.0;
		Map<String, String> cuentasR1 = new HashMap<String, String>(), cuentasR2 = new HashMap<String, String>(), cuentasR3 = new HashMap<String, String>(), 
				cuentasR4 = new HashMap<String, String>(), cuentasR5 = new HashMap<String, String>(),cuentasR6 = new HashMap<String, String>(), 
				cuentasR7 = new HashMap<String, String>(), cuentasR8 = new HashMap<String, String>(), cuentasR9 = new HashMap<String, String>(),
				cuentasTotales = new HashMap<String, String>();
		List<LayoutHuawei> duplicadas = new ArrayList<LayoutHuawei>();
		Map<String, String> mapPersonas = new HashMap<String, String>();
		for (LayoutHuawei layoutHuawei : listaLayoutHuawei) {
			if (layoutHuawei.getInvoices()) {
				duplicadas.add(layoutHuawei);
				mapPersonas.put(layoutHuawei.getAcountCode(), layoutHuawei.getAcountCode());
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
		String[] region01 = { "R01", String.format("%,.2f", R01) , String.valueOf(cuentasR1.size())};
		String[] region02 = { "R02", String.format("%,.2f", R02) , String.valueOf(cuentasR2.size())};
		String[] region03 = { "R03", String.format("%,.2f", R03) , String.valueOf(cuentasR3.size())};
		String[] region04 = { "R04", String.format("%,.2f", R04) , String.valueOf(cuentasR4.size())};
		String[] region05 = { "R05", String.format("%,.2f", R05) , String.valueOf(cuentasR5.size())};
		String[] region06 = { "R06", String.format("%,.2f", R06) , String.valueOf(cuentasR6.size())};
		String[] region07 = { "R07", String.format("%,.2f", R07) , String.valueOf(cuentasR7.size())};
		String[] region08 = { "R08", String.format("%,.2f", R08) , String.valueOf(cuentasR8.size())};
		String[] region09 = { "R09", String.format("%,.2f", R09) , String.valueOf(cuentasR9.size())};
		String[] total = { "Total", String.format("%,.2f", Total) , String.valueOf(cuentasTotales.size())};
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
		

			String asunto = "[BATCH][AJUSTES]["+ciclo+"]: APLICACION AJUSTES DE CREDITO CUENTAS ASIGNADAS TELCEL";
			
			// Se compone la parte del texto
			File layout = archivos.get(0);
			File layoutDuplicadas = archivos.get(1);
			BodyPart texto = new MimeBodyPart();
			String mensaje = "";
			mensaje = "<div>" + "  <p><h1>Hola buen dia.</h1></p>"
					+ "  <p>Se informa que el proceso de aplicacion de ajustes de crédito se ejecuto de manera correcta.</p>"
					+ "  <p>Se realizo la aplicacion de ajustes de crédito a un total de "+cuentasTotales.size()+" cuentas.</p>"
					+ "  <p>No se le aplicara ajuste de crédito a un total de " + mapPersonas.size() + " cuentas debido que tiene mas de 1 factura abierta.</p>";
			if (cuentasTotales.size()>0) {
				mensaje+="  <p>Detalle de ajustes de crédito aplicados:</p>"
						+ "  <table style=\"width:50%;border-collapse: collapse; margin: auto\">\r\n" 
						+ "    <tr>"
						+ "      <th style=\"padding: 8px;border: 1px solid #dee2e6;text-align:center;\">Región</th>"
						+ "      <th style=\"padding: 8px;border: 1px solid #dee2e6;text-align:center;\">Total</th>"
						+ "      <th style=\"padding: 8px;border: 1px solid #dee2e6;text-align:center;\">Número de cuentas</th>"
						+ "    </tr>" ;
						
						
				for (String[] region : listaRegiones) {
					mensaje+=" <tr>" 
							+ "	<td style=\"padding: 8px;border: 1px solid #dee2e6;text-align:center;\">"+region[0]+"</td>" 
							+ "	<td style=\"padding: 8px;border: 1px solid #dee2e6;text-align:center;\">$"+region[1]+"</td>"
							+ "	<td style=\"padding: 8px;border: 1px solid #dee2e6;text-align:center;\">"+region[2]+"</td>"
							+ "</tr> ";
				}
				mensaje+="  </table>";
			}
			
			if (duplicadas.size()>0) {
				mensaje+="  <p>Las siguientes cuentas cuentan con mas de una factura abierta por lo que a estas no se les ha realizado ningun movimiento, favor de validar y aplicar de manera manual.</p>"
						+ "  <table style=\"width:50%;border-collapse: collapse; margin: auto\">\r\n" 
						+ "    <tr>"
						+ "      <th style=\"padding: 8px;border: 1px solid #dee2e6;text-align:center;\">Cuenta</th>"
						+ "      <th style=\"padding: 8px;border: 1px solid #dee2e6;text-align:center;\">Monto</th>"
						+ "      <th style=\"padding: 8px;border: 1px solid #dee2e6;text-align:center;\">Ciclo</th>"
						+ "    </tr>" ;
						
						
				for (LayoutHuawei layoutHuawei : duplicadas) {
					mensaje+=" <tr>" 
							+ "	<td style=\"padding: 8px;border: 1px solid #dee2e6;text-align:center;\">"+layoutHuawei.getAcountCode()+"</td>" 
							+ "	<td style=\"padding: 8px;border: 1px solid #dee2e6;text-align:center;\">$"+layoutHuawei.getAmountFormat()+"</td>"
							+ "	<td style=\"padding: 8px;border: 1px solid #dee2e6;text-align:center;\">"+layoutHuawei.getBillCycleID()+"</td>"
							+ "</tr> ";
				}
				mensaje+="  </table>";
			}
					
			mensaje+= " <p>Saludos!!!</p>" + "</div>";
//			texto.setText(" BODY DEL MENSAJE <b> salto de linea");
			texto.setContent(mensaje, "text/html");
			// Se compone el adjunto con el excel
			BodyPart adjunto = new MimeBodyPart();
			adjunto.setDataHandler(new DataHandler(new FileDataSource(layout.getAbsolutePath())));
			// Se indica el nombre con el que se renombrara el archivo en el correo
			adjunto.setFileName(layout.getName());
			BodyPart adjuntoDuplicadas = new MimeBodyPart();
			adjuntoDuplicadas.setDataHandler(new DataHandler(new FileDataSource(layoutDuplicadas.getAbsolutePath())));
			// Se indica el nombre con el que se renombrara el archivo en el correo
			adjuntoDuplicadas.setFileName(layoutDuplicadas.getName());
			//////////////////////////////////////////////////////////////////
			// Se crea una MultiParte para agrupar texto y datos adjuntos.
			MimeMultipart multiParte = new MimeMultipart();
			// Se agrega el texto del mensaje
			multiParte.addBodyPart(texto);
			// Se agrega el archivo adjunto
			multiParte.addBodyPart(adjunto);
			multiParte.addBodyPart(adjuntoDuplicadas);
			// log.info("Se enviar\u00E1 correo a los destinatarios: " +correo+ "
			// Asunto:"+asunto+" Archivo adjunto:"+nombreArchivo);
			// se invoca al metodo de envio de correos
			resultado = enviaCorreos(asunto, multiParte, remitente, destinatario);
		} catch (Exception e) {
			 log.info("ERROR",e);
		}
		return resultado;
	}


	private boolean enviaCorreos(String asunto, MimeMultipart multiPart, String remitente, String destinatario) {
		boolean resultado = false;
		try {
			// Se indica la direccion del remitente
			this.setFrom(remitente);
			// se agrega el asunto del mensaje
			this.setSubject(asunto);
			// Se indica la direccion del destinatario
			this.setTo(destinatario);
			this.sendMultipartAdjunto(multiPart);
			// log.info("Envio de correo exitoso");
			resultado = true;
		} catch (AddressException e) {
			log.info("ERROR",e);
		} catch (MessagingException e) {
			log.info("ERROR",e);
		} catch (Exception e) {
			log.info("ERROR",e);
		}
		return resultado;
	}
}



class MoreOneRcptException extends Exception {

	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Debe especificar solamente una cuenta de correo por cada Invocacion del Metodo 'setTo()'.";
	}
}

class OtherDomainException extends Exception {
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "El dominio de la cuenta de envio debe ser @mail.telcel.com o @telcel.com";
	}
}
