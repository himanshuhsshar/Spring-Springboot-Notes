package com.fdp.helper;

import com.fdp.beans.HTMLMessageFormatterImpl;
import com.fdp.beans.IMessageFormatter;
import com.fdp.beans.PDFMessageFormatterImpl;

public class IMessageFormatterFactory {

	public static IMessageFormatter createMessageFormatter(String type) {
		IMessageFormatter messageFormatter = null;

		if (type.equals("html")) {
			messageFormatter = new HTMLMessageFormatterImpl();
		} else if (type.equals("pdf")) {
			messageFormatter = new PDFMessageFormatterImpl();
		}
		return messageFormatter;
	}

}
