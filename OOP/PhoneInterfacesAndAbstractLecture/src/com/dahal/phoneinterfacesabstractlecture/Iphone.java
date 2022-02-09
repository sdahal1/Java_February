package com.dahal.phoneinterfacesabstractlecture;

public class Iphone extends Phone{
	
	//constructor for iphone that acceps inputs for version number, battery %, carrier, and ringtone
	public Iphone(String versionNumberInput, int batteryPercentageInput, String carrierInput, String ringToneInput) {
		
		//super is saying pass the inputs on to the constructor of the parent in the Phone class
		super(versionNumberInput, batteryPercentageInput, carrierInput,ringToneInput );
	}
	
	
	public void displayInfo(){
		System.out.println("Siri is displaying info");
		System.out.println(String.format("Iphone info: \n Version Number: %s \n Battery Percentage %s \n Carrier: %s \n Ring Tone: %s", this.getVersionNumber(), this.getBatteryPercentage(), this.getCarrier(), this.getRingTone()));
	}

}
