package com.sdp.beans;

public final class HTMLMessageFormatterImpl implements IMessageFormatter{

	@Override
	public final String formatMessage(String message) { // (alt + shift + s) - v
		// TODO Auto-generated method stub
		return "<html><body>"+message+"</body></html>";
	}

}
