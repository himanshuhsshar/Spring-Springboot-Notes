package com.cdi.beans;

import java.util.Properties;

public class Profile {
	
	private String fullName;
	private int age;
	private Properties wishlist;
	
	
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void setWishlist(Properties wishlist) {
		this.wishlist = wishlist;
	}



	@Override
	public String toString() {
		return "Profile [fullName=" + fullName + ", age=" + age + ", wishlist=" + wishlist + "]";
	}
	
	

}
