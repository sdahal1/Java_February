package com.dahal.movieapi.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

@Controller
public class HomeController {
	
	private String url = "https://www.omdbapi.com/?apikey=470135e&s=";
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("query") String searchQuery, Model model) {
		//make an api call using the searchQuery
		
		
		String apiCallQuery = url+searchQuery.replace(" ", "+");;
		
		System.out.println(apiCallQuery);
		
		//make an api call using unirest and the api endpoint
//		String info = Unirest.get(apiCallQuery).asString().getBody();
		
//		System.out.println(info);
		
		//save the response from the api as a Json Object
		JSONObject resultsObj = Unirest.get(apiCallQuery).asJson().getBody().getObject();
		
		System.out.println(resultsObj);
		
		//results at the key "Search" has the array of movie objects that I want
		JSONArray resultsArray = resultsObj.getJSONArray("Search");
		
		//create an array of JSONObjects and pass them to the template
		ArrayList<JSONObject> results = new ArrayList<JSONObject>();
		
		for(int i = 0; i<resultsArray.length(); i++) {
			results.add(resultsArray.getJSONObject(i));
		}
		
		model.addAttribute("results", results);
		
		return "results.jsp";
	}
}
