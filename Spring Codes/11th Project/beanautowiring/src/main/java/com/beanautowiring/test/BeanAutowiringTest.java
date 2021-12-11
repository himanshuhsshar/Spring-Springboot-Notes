package com.beanautowiring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.beanautowiring.beans.SalesOrder;

public class BeanAutowiringTest {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/beanautowiring/commons/application-context.xml"));
		SalesOrder salesorder = beanFactory.getBean("salesorder",SalesOrder.class);
		System.out.println(salesorder);
	}

}
