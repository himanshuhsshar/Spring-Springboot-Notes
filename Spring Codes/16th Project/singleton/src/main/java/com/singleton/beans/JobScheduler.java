package com.singleton.beans;

public class JobScheduler {
	
	public void execute() {
	
		DateConvertor dc = DateConvertor.getInstance();
		System.out.println("DateConvertor hashcode: " + dc.hashCode());
	}

}
