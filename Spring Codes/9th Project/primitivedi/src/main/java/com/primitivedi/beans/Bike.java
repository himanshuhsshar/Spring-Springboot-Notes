package com.primitivedi.beans;

public class Bike {
	
	private String chasisNo;
	private String engineNo;
	private String rtaRegistrationNo;
	private String color;
	private String fuelType;
	
	public Bike(String chasisNo, String engineNo, String rtaRegistrationNo) {
		super();
		this.chasisNo = chasisNo;
		this.engineNo = engineNo;
		this.rtaRegistrationNo = rtaRegistrationNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Beans [chasisNo=" + chasisNo + ", engineNo=" + engineNo + ", rtaRegistrationNo=" + rtaRegistrationNo
				+ ", color=" + color + ", fuelType=" + fuelType + "]";
	}
	 

}
