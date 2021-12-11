package com.clc.beans;

public class PDFMessageFormatterImpl implements IMessageFormatter{
	
	@Override
	public final String formatMessage(String message) {
		// TODO Auto-generated method stub
		return "<pdf>"+message+"</pdf>";
	}

}
