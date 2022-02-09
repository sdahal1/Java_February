package com.dahal.olympiansinheritance;

public class Olympian {
	//name
	private String name;
	//energylevel
	private int energyLevel=100;
	//country
	private String country;
	
	
//	//constructor
	public Olympian() {
		this.name = "Guest user";
		this.country = "World";
	}
	
	//loaded constructer 
	public Olympian(String nameInput, String countryInput) {
		this.name = nameInput;
		this.country = countryInput;
	}
	
	//display energy
	public void displayEnergy() {
		System.out.println("Energy level: " + this.energyLevel);
	}
	
	
	//display country
	public void displayCountry() {
		System.out.println("Country: " + this.country);
	}

	
	//getters and setters below!
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
