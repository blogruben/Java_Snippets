package org.ruben.java.log;

import org.apache.log4j.Logger;

public class AppLogEnError{
	
	final static Logger logger = Logger.getLogger(AppLogEnError.class);
	
	public static void main(String[] args) {
	
		AppLogEnError app = new AppLogEnError();
		
		if(logger.isDebugEnabled()){
			logger.debug("Hola mundo (debug)");
		}
		
		if(logger.isInfoEnabled()){
			logger.info("Hola mundo (info)");
		}
		
		logger.warn("Hola mundo (warn)");
		logger.error("Hola mundo (error)");
		logger.fatal("Hola mundo (fatal)");

		
	}
	

	
	
}