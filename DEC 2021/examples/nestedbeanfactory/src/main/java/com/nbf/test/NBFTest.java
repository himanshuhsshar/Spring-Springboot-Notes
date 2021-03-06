package com.nbf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nbf.beans.Motor;

public class NBFTest {
	public static void main(String[] args) {
		BeanFactory parentFactory = new XmlBeanFactory(new ClassPathResource("com/nbf/common/parent-beans.xml"));
		BeanFactory childFactory = new XmlBeanFactory(new ClassPathResource("com/nbf/common/child-beans.xml"),
				parentFactory);

		Motor motor = childFactory.getBean("motor", Motor.class);
		System.out.println(motor);
	}
}
