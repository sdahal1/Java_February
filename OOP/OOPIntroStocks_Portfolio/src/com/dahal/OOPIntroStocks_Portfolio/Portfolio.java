package com.dahal.OOPIntroStocks_Portfolio;

import java.util.ArrayList;

public class Portfolio {
	
	
	//empty constructor
	public Portfolio() {
		this.name = "Guest User";
	}
	
	//loaded constructor
	public Portfolio(String nameInput) {
		this.name = nameInput;
	}
	
	//name of owner
	private String name;
	
	//totalBalance
	private double totalBalance;
	
	//isDiamondHands
	private boolean isDiamondHands;
	
	//list of stocks
	private ArrayList<Stock> stocks = new ArrayList<Stock>();

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}

	public boolean isDiamondHands() {
		return isDiamondHands;
	}

	public void setDiamondHands(boolean isDiamondHands) {
		this.isDiamondHands = isDiamondHands;
	}

	public ArrayList<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(ArrayList<Stock> stocks) {
		for(Stock stock: stocks) {
			this.totalBalance+= stock.getPrice();
		}
		
		
		
		this.stocks = stocks;
	} 
	
	public void addOneStock(Stock stockObj) {
		this.stocks.add(stockObj);
		this.totalBalance += stockObj.getPrice();
	}
	
	public void printRiskAssessment() {
		if(this.isDiamondHands) {
			System.out.println("IM NOT SELLING!!!");
		}else {
			System.out.println("I took profits tho. wacchu know about these paper hands");
		}
	}
	
	
	public void displayInfo() {
		String info = String.format("Name: %s \n Total Balance: %s \n", this.name, this.totalBalance);
		
		String stocksInfo = "";
		//loop through the sotocks and add each stock info to the string
		for(int i = 0; i<this.stocks.size(); i++) {
			stocksInfo += String.format("%s - Price: $%s \n",this.stocks.get(i).getName(),this.stocks.get(i).getPrice());
		}
		
		System.out.println(info);
		System.out.println(stocksInfo);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
