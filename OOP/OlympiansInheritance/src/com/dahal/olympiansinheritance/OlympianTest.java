package com.dahal.olympiansinheritance;

public class OlympianTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");
		
		
		Olympian olympian1 = new Olympian();
		Olympian olympian2 = new Olympian("Phelps", "USA");
		
		System.out.println(olympian1.getName());
		System.out.println(olympian2.getName());
		
		olympian1.displayCountry();
		olympian2.displayCountry();
		
		olympian1.displayEnergy();
	}

}
