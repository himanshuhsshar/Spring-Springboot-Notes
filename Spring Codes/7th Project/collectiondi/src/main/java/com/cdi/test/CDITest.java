package com.cdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cdi.beans.ElectionCommission;
import com.cdi.beans.Parcel;
import com.cdi.beans.Profile;
import com.cdi.beans.Staff;
import com.cdi.beans.Store;

public class CDITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("com/cdi/commons/application-context.xml"));
		Parcel parcel=beanFactory.getBean("parcel",Parcel.class);
		System.out.println(parcel);
		
		Store store=beanFactory.getBean("store",Store.class);
		System.out.println(store);
		
		ElectionCommission electionCommission = beanFactory.getBean("electionCommission",ElectionCommission.class);
		System.out.println(electionCommission);
		
		Profile profile=beanFactory.getBean("profile",Profile.class);
		System.out.println(profile);

	}

}
