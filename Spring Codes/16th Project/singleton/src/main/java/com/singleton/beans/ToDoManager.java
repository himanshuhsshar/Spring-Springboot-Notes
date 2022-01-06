package com.singleton.beans;

public class ToDoManager {

	public void manage() {
		DateConvertor dc = DateConvertor.getInstance();
		System.out.println("DateConvertor hashcode: " + dc.hashCode());
	}
}
