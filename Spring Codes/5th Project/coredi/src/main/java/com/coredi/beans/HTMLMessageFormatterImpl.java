package com.coredi.beans;

public class HTMLMessageFormatterImpl implements IMessageFormatter {

	@Override
	public String formatMessage(String message) {
		// TODO Auto-generated method stub
		return "<html><body>" + message + "</html></body>";
	}

}
