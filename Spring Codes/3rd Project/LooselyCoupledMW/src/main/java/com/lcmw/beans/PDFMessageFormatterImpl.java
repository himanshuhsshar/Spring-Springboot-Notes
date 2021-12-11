package com.lcmw.beans;

public final class PDFMessageFormatterImpl implements IMessageFormatter{
	
	@Override
	public final String formatMessage(String message) {
		// TODO Auto-generated method stub
		return "<pdf>"+message+"</pdf>";
	}

}
