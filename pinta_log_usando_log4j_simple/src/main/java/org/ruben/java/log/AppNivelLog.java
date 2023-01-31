package org.ruben.java.log;

import org.apache.log4j.Logger;

public class AppNivelLog{
	
	final static Logger logger = Logger.getLogger(AppNivelLog.class);
	
	public static void main(String[] args) {
	
		AppNivelLog app = new AppNivelLog();
		try{
			app.dividir();
		}catch(ArithmeticException ex){
			logger.error("Ha fallado la division: ", ex);
		}
	}
	
	private void dividir(){
		int i = 10 /0;
	}
	
	
}