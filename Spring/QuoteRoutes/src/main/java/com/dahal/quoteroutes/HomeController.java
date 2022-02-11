package com.dahal.quoteroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController

@RequestMapping("/quotes")
public class HomeController {
	
	//@app.route("/")
	//def home():
	//	return "hello welcome to home";
	
	@RequestMapping("")
	public String home() {
		return "Hello world! Welcome to the quotes application!";
	}
	
	@RequestMapping("/funny")
	public String funnyQuote() {
		return "Do I need to be liked? Absolutely not. I like to be liked. I enjoy being liked. I have to be liked. But it’s not like this compulsive need like my need to be praised.";
	}
	
	@RequestMapping("/inspirational")
	public String inspirationalQuote() {
		return "You miss 100% of the shots you don't take";
	}
	
	@RequestMapping("/interesting")
	public String interestingQuote() {
		
		return "Mosquitos kill the most humans. (besides humans).";
	}

}
