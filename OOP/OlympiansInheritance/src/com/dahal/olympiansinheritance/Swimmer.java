package com.dahal.olympiansinheritance;

public class Swimmer extends Olympian {
	
	//member variable- swimSpeed
	private int swimSpeed;
	
	
	//empty constructor
	public Swimmer() {
		this.energyLevel= 500;
	}
	
	//loaded constructor
	public Swimmer(String nameInput, String countryInput, int swimSpeedInput) {
		super(nameInput, countryInput); //super is saying "do what the parent class did for the nameInput and countryInput
		
		this.swimSpeed = swimSpeedInput;
		this.energyLevel= 500;
//		super.setEnergyLevel(500);
		
	}
	
	

	
	public int getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(int swimSpeed) {
		this.swimSpeed = swimSpeed;
	}
	
	
	//things only a swimmer can do
	public void swim() {
		System.out.println("Swimming....");
		this.energyLevel-= 20;
	}
	
	
	
}
