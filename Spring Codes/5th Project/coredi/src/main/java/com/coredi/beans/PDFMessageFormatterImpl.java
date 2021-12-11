package com.coredi.beans;

public class PDFMessageFormatterImpl implements IMessageFormatter {

	@Override
	public String formatMessage(String message) {
		// TODO Auto-generated method stub
		return "<pdf>" + message + "</pdf>";
	}

}
