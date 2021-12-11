package com.coredi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.coredi.beans.HTMLMessageFormatterImpl;
import com.coredi.beans.IMessageFormatter;
import com.coredi.beans.MessageWriter;
import com.coredi.beans.PDFMessageFormatterImpl;

public class CoreDITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/coredi/commons/application-context.xml"));
		
		MessageWriter messageWriter = beanFactory.getBean("messageWriter",MessageWriter.class);
		/*IMessageFormatter htmlMessageFormatter = beanFactory.getBean("htmlMessageFormatter",HTMLMessageFormatterImpl.class);
		IMessageFormatter pdfMessageFormatter = beanFactory.getBean("pdfMessageFormatter",PDFMessageFormatterImpl.class);
		
		messageWriter.setMessageFormatter(pdfMessageFormatter);*/
		messageWriter.writeMessage("Welome to Spring Framework");

	}

}
