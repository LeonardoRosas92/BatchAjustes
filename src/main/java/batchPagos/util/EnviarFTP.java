package batchPagos.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;

import batchPagos.main;

public class EnviarFTP {
	private final static Logger log = Logger.getLogger(EnviarFTP.class);

	public boolean enviarArchivo(File file) {
//		String USERNAME = "telcelsftp";
//		String PASSWORD = "Ts2019Ms";
//		String HOST = "10.59.54.30";
		String USERNAME = "telcelsftp";
		String PASSWORD = "Ts2019Ms";
		String HOST = "10.59.28.218";
		String FTP_PATH = "/home/mep/cdr/bibes/in/batchTrade/AR/adjustment";
		SFTPUtils sftpUtils = new SFTPUtils();
		sftpUtils.setHostName(HOST);
		sftpUtils.setHostPort("22");
		sftpUtils.setUserName(USERNAME);
		sftpUtils.setPassWord(PASSWORD);
		sftpUtils.setDestinationDir(FTP_PATH);
		String result = "";
		result = sftpUtils.uploadFileFTP(file.getAbsolutePath(),file.getName());
		System.out.println("Image upload: " + result);
		return true;
	}
}
