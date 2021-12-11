package com.setterdi.beans;

public class WaterPump {
	
	private Motor motor;
	
	public WaterPump(Motor motor) {
		super();
		this.motor = motor;
	}


	public void run() {
		motor.run();
	}

	/*
	 * public void setMotor(Motor motor) { this.motor = motor; }
	 */
	//comments = ctrl+shift+/
    //alt+shift+s(r)
	//alt+l
	//enter
}
