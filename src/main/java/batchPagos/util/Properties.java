package batchPagos.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.log4j.Logger;

public class Properties {
	private final static Logger log = Logger.getLogger(Properties.class);
	
	public java.util.Properties getProps(String path){
		java.util.Properties prop = new java.util.Properties();
		try{
			File file = new File(path);
			InputStream in = new FileInputStream(file);
			prop.load(in);
			in.close();
		}catch(Exception e)
		{
			log.info("¨Problema al acceder al arhivo de propiedades: " + e);
		}
		return prop;
	}
}
