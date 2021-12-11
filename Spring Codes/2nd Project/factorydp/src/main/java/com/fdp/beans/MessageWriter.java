package com.fdp.beans;

import com.fdp.helper.IMessageFormatterFactory;

public class MessageWriter {
	
private IMessageFormatter messageFormatter;
	
	public void writeMessage(String message)
	{
		String cMessage=null;
		
		messageFormatter = IMessageFormatterFactory.createMessageFormatter("pdf");
		cMessage = messageFormatter.formatMessage(message);
		System.out.println(cMessage);
		
	}

}
