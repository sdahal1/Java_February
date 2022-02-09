package com.dahal.cafebusinesslogic;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello cafe demo");
		

		/* 
	      You will need add 1 line to this file to create an instance 
	      of the CafeUtil class. 
	      Hint: it will need to correspond with the variable name used below..
	    */
		
		//creating an INSTANCE of the CafeUtil class
		CafeUtil appTest = new CafeUtil();
		
	    	
	        /* ============ App Test Cases ============= */
//	    
	       	System.out.println("\n----- Streak Goal Test -----");
	       	
	       	
	        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(5));
	    
	        
	        
	         System.out.println("----- Order Total Test-----");
	         double[] lineItems = {3.5, 1.5, 4.0, 4.5};
	         
	         
	         System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
	         
	         
	        
	         System.out.println("----- Display Menu Test-----");
	        
	         
	         ArrayList<String> menu = new ArrayList<String>();
	         menu.add("drip coffee");
	         menu.add("cappuccino");
	         menu.add("latte");
	         menu.add("mocha");
	         
	         appTest.displayMenu(menu);
	    
	         System.out.println("\n----- Add Customer Test-----");
	         
	         ArrayList<String> customers = new ArrayList<String>();
	         
	         
//	         System.console().readLine();
	         
//	         Scanner s = new Scanner(System.in);
//	         String name;
//	         
//	          // --- Test 4 times ---
	          for (int i = 0; i < 4; i++) {
	        	  	
	              appTest.addCustomer(customers);
	       
	          }
	         
	         
	         System.out.println(customers);
	}

}