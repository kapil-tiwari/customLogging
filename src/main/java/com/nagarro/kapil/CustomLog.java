package com.nagarro.kapil;

import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.apache.logging.log4j.message.ObjectMessage;
import org.apache.logging.log4j.message.StringMapMessage;

import com.nagarro.enums.Event;
import com.nagarro.enums.UserAction;


public class CustomLog {

	 //private static final Logger log = LogManager.getLogger(CustomLog.class);
     private static final CustomLogger logger =  CustomLogger.getLogger(CustomLog.class);
	
     public static void main(String[] args) {
		
		User user = new User(1, "Kapil", 24);
		logger.audit(Event.SLAVE_DELETE, UserAction.USER_SAVE, "My message"); // Using ThreadContext
		
		/*
		 * logger.audit(new StringMapMessage() // Using StringMapMessage
		 * .with("event","ROHAN") .with("action", "SAve&Continue"));
		 * 
		 * logger.audit(new ObjectMessage(user)); // Using custom Object
		 */		
		
	}

}
