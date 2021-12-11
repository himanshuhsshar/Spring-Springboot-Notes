package com.cdi.beans;

public class Person {
	
	private String uidai;
	private String fullName;
	private int age;
	private String gender;
	
	public Person(String uidai) {
		super();
		this.uidai = uidai;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [uidai=" + uidai + ", fullName=" + fullName + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
