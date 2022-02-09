package com.dahal.phoneinterfacesabstractlecture;

public class Android extends Phone{
	

	//constructor for iphone that acceps inputs for version number, battery %, carrier, and ringtone
	public Android(String versionNumberInput, int batteryPercentageInput, String carrierInput, String ringToneInput) {
		
		//super is saying pass the inputs on to the constructor of the parent in the Phone class
		super(versionNumberInput, batteryPercentageInput, carrierInput,ringToneInput );
	}
	
	
	public void displayInfo(){
		System.out.println("Google Assistant is displaying info. Beep boop.");
		System.out.println(String.format("Android info: \n Version Number: %s \n Battery Percentage %s \n Carrier: %s \n Ring Tone: %s", this.getVersionNumber(), this.getBatteryPercentage(), this.getCarrier(), this.getRingTone()));
	}

}
