package com.dahal.phoneinterfacesabstractlecture;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello interfaces and abstract!");
		
		
//		Phone p1 = new Phone("ios12", 100, "At&t", "Blessings!");
		Iphone iphone1 = new Iphone("ios12", 100, "At&t", "Blessings!");
		iphone1.displayInfo();
		
		Android android1 = new Android("S12", 110, "Verizon", "We winning");
		android1.displayInfo();
		
		android1.unlockPhone();
		iphone1.unlockPhone();
		
		
	}

}
