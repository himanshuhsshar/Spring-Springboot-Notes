package com.awareinjection.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//public class Car {
//	
// private IEngine engine;
// 
// public void drive() { 
//	 engine.start(); 
//	 System.out.println("Driving..."); 
//	 }
// 
// public void setEngine(IEngine engine) {
//	 this.engine = engine; 
//	 }
//}
//public class Car { 
//	private String beanId;
//	
//	public Car(String beanId) { 
//		super(); 
//		this.beanId = beanId; 
//	}
//	
//	public void drive() { 
//		IEngine engine=null; 
//		BeanFactory beanFactory=null;
//		beanFactory = new XmlBeanFactory(new ClassPathResource("com/awareinjection/commons/application-context.xml")); 
//		engine = beanFactory.getBean(beanId,IEngine.class); 
//		engine.start(); 
//		System.out.println("Driving....");
//	} 
//}
public class Car implements BeanFactoryAware{
	private BeanFactory beanFactory;
	private  String beanId;
	private String modelName;

	public Car(String beanId) {
		System.out.println("Car(String beanId)");
		this.beanId = beanId;
	}
	
	public void drive() {
		IEngine engine=null;
		engine = beanFactory.getBean(beanId,IEngine.class);
		engine.start();
		System.out.println("Driving Car" + modelName + "....");
	}

	public void setModelName(String modelName) {
		System.out.println("setModelName(String modelName)");
		this.modelName = modelName;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory(BeanFactory beanFactory)");
		this.beanFactory=beanFactory;
		
	}
}