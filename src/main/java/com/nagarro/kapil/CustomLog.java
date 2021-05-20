package com.nagarro.kapil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomLog {

	private static final Logger logger = LogManager.getLogger(CustomLog.class);

	public static void main(String[] args) {
		
		User user = new User(1, "Kapil", 24);
		logger.trace("Trace");
		logger.debug("Debug log");
		logger.info("User details : {}", user);
		logger.warn("We've just greeted the user!");

	}

}
