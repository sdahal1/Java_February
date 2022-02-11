package com.dahal.hellopets;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //this tells the app that we can accept requests and send out responses
public class HomeController {

	@RequestMapping("/") //this is similar to @app.route("/") from flask
	public String hellopet() {
		return "Hello pets";
	}
	
	@RequestMapping("/pets")
	public String pets(@RequestParam(value="name", required=false) String name, @RequestParam(value="breed", required=false) String breed) {
//		console.log("this is the query param!! " + )
		System.out.println("this is the value of the variable name: " + name);
		if(name ==null) {
			return "This is the default pet. Guest Pet. ";
		}else if(breed==null){
			return String.format("This is %s, hes a good boy (or shes a good girl. Idk junior basically but there you go.", name);
		}
		else { //if it hits else, then name and breed were not null
			return String.format("Pet name: %s. Pet breed: %s", name, breed);
		}
	}
	
}
