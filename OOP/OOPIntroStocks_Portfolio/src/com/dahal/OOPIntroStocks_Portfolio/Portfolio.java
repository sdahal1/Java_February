package com.dahal.OOPIntroStocks_Portfolio;

import java.util.ArrayList;

public class Portfolio {
	
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
		this.stocks = stocks;
	} 
	
	
	
	
	
	
	
	
	

}
