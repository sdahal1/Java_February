package com.dahal.OOPIntroStocks_Portfolio;

public class Stock {
	
	//member variable- name
	private String name;
		
	//member variable- price
	private double price;
	
	//constructor is a method that lets you define how to initialize the class
	public Stock() {
		
	}
	
	//overloading the constructor (create another constructor with same exact name) so that we can create (construct) a stock that is initialized with a name and price upon construction
	public Stock(String nameInput, double priceInput) {
		this.name = nameInput;
		this.price = priceInput;
	}
	
	
	

	
	//these methods are called getters and setters
	
	//getters allows use to access info about our member variables
	public String getName() {
		return name;
	}

	//a setter will accept an input and will set the value of your member variable to that input
	public void setName(String name) {
		this.name = name;
	}
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
