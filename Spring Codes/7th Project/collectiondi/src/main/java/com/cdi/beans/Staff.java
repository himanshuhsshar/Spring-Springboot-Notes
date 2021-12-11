package com.cdi.beans;

public class Staff {
	
	private int staffNo;
	private String fullName;
	private int age;
	private String gender;
	
	

	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
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
		return "Staff [staffNo=" + staffNo + ", fullName=" + fullName + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
