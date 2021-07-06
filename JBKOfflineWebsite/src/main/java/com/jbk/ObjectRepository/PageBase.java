package com.jbk.ObjectRepository;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PageBase {
	
	public static Logger log;
	
	public Logger pagelogs() {
		log = Logger.getLogger(this.getClass());
//		String path = (System.getProperty(("user.dir") + "/Log4jPage.properties"));
//		PropertyConfigurator.configure(path);
		PropertyConfigurator.configure("C:\\Users\\PC\\git\\repository\\JBKOfflineWebsite\\src\\main\\resources\\Log4jPage.properties");
		return log;

	}
	
}
