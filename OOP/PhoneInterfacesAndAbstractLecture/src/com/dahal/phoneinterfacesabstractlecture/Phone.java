package com.dahal.phoneinterfacesabstractlecture;

public abstract class Phone {
	
	
	//member variables (aka attributes, fields)
	//versionNumber
	private String versionNumber;
	//batteryPercentage
	private int batteryPercentage;
	//carrier
	private String carrier;
	//ringTone
	private String ringTone;
	
	
	//empty constructor
	public Phone() {
		
	}
	
	//constructor
	public Phone(String versionNumberInput, int batteryPercentageInput, String carrierInput, String ringToneInput  ) {
		this.versionNumber = versionNumberInput;
		this.batteryPercentage = batteryPercentageInput;
		this.carrier = carrierInput;
		this.ringTone = ringToneInput;
	}
	
	
	
	//abstract method. this method will be implemented by subclasses
	public abstract void displayInfo();

	
	
	//getters and setters
	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getRingTone() {
		return ringTone;
	}

	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
	
	
	
	

}
