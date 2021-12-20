package com.sdp.test;

import com.sdp.beans.IMessageFormatter;
import com.sdp.beans.MessageWriter;
import com.sdp.beans.PDFMessageFormatterImpl;

public class SDPTest {
	public static void main(String[] args) {
		MessageWriter messageWriter = new MessageWriter();
		IMessageFormatter messageFormatter = new PDFMessageFormatterImpl();
		messageWriter.setMessageFormatter(messageFormatter);
		
		messageWriter.writeMessage("Welcome to Strategy Design Pattern");
	}
}
