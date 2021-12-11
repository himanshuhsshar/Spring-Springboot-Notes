package com.lcmw.test;

import com.lcmw.beans.HTMLMessageFormatterImpl;
import com.lcmw.beans.IMessageFormatter;
import com.lcmw.beans.MessageWriter;
import com.lcmw.beans.PDFMessageFormatterImpl;

public class LCMWTest {
	
	public static void main(String[] args) {
	
	 MessageWriter messageWriter = new MessageWriter();
	 IMessageFormatter messageFormatter = new HTMLMessageFormatterImpl();
	    
	 messageWriter.setMessageFormatter(messageFormatter);    
	 messageWriter.writeMessage("Welcome to SDP");
	}

}
