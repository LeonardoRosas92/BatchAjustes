package batchPagos.util;

import java.io.File;

import org.apache.log4j.Logger;

import batchPagos.main;

public class Fichero {
	private final static Logger log = Logger.getLogger(Fichero.class);
	
	public String generarPath(String prop) {
		String finalPath = System.getProperty("user.dir")+prop;
		log.info("PATH Generado: "+finalPath);
		return finalPath;
	}
	public boolean verificarFichero(String url){
		File f = new File(url);
		if(f.exists()){
			log.info("[INFO]: La carpeta de entrada es correcta");
			return true;
		}else{
			log.info("[INFO]: La carpeta de entrada es incorrecta");
			return false;
		}
	}
	
	public boolean eliminarFichero(String url){
		log.info(url);
		File f = new File(url);
		if(f.delete()){
			log.info("[INFO]: Arhivo de entrada eliminado");
			return true;
		}else{
			log.info("[ERROR]: No se elimino el archivo");
			return false;
		}
	}
	
	public File[] obtenerArchivos(String url) {
		File f = new File(url);
		File[] ficheros = f.listFiles();
		return ficheros; 
	}
}
