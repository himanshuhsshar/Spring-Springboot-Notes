package com.clc.helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.clc.beans.MessageWriter;

public class AppFactory {
	
	 private static Properties props;
	  
	  static {
	    props = new Properties();
	    InputStream in = MessageWriter.class.getClassLoader().getResourceAsStream("appClasses.properties");
	    try {
			props.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

	public static Object createObject(String lclassname) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	    String fqnClass = null;
	    Class<?> clazz = null;
	    Object obj = null;
	    /*Properties props = new Properties();
	    InputStream in = AppFactory.class.getClassLoader().getResourceAsStream("appClasses.properties");
	    try {
			props.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	    fqnClass = props.getProperty(lclassname);
	     
	    System.out.println(fqnClass);
	    clazz = Class.forName(fqnClass);
	    obj = clazz.newInstance();
	    return obj;
	  }
}
