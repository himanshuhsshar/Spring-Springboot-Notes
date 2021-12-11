package com.clc.test;

import com.clc.beans.IMessageFormatter;
import com.clc.beans.MessageWriter;
import com.clc.helper.AppFactory;

public class CLCTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		MessageWriter messageWriter = (MessageWriter) AppFactory.createObject("messageWriter.class");
	    
	    IMessageFormatter MessageFormatter = (IMessageFormatter) AppFactory.createObject("messageFormatter.class");
	    
	    messageWriter.setMessageFormatter(MessageFormatter);
	  
	    messageWriter.writeMessage("Himanshu");

	}

}
