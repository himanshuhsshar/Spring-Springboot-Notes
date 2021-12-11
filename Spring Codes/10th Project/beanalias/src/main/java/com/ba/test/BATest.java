package com.ba.test;

import java.util.stream.Stream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ba.beans.Person;

public class BATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ba/commons/application-context.xml"));
		Person p1 = beanFactory.getBean("person",Person.class);
		Person p2 = beanFactory.getBean("Him",Person.class);
		Person p3 = beanFactory.getBean("Sh",Person.class);
		Person p4 = beanFactory.getBean("Himanshu,Sha",Person.class);
		
		System.out.println("p1 == p2 ?: " + (p1 == p2));
		System.out.println("p1 == p3 ?: " + (p1 == p3));
		System.out.println("p2 == p3 ?: " + (p2 == p3));
		System.out.println("p3 " + p3);
		
		String[] aliases = beanFactory.getAliases("HS");
		Stream.of(aliases).forEach(System.out::println);

	}

}
