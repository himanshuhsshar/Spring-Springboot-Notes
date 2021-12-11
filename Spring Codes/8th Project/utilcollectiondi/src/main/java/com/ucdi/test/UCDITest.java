package com.ucdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ucdi.beans.Contract;

public class UCDITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ucdi/commons/application-context.xml"));
		Contract contract = beanFactory.getBean("contract",Contract.class);
		System.out.println(contract);

	}

}
