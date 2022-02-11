package com.dahal.moviesite;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String helloworld(Model model) {
		//importing Model classs and creating an instance of it
//		Model model = new Model()
		
		
		String movieTitle = "American Gangster";
		String releaseDate = "2001-01-01";
		String imageUrl = "https://m.media-amazon.com/images/I/71tEMmFxo7L._SL1500_.jpg";
		
		
		model.addAttribute("movie", movieTitle);
		model.addAttribute("rd", releaseDate);
		model.addAttribute("imageurl", imageUrl);
		
		
		
		//array of actors
		ArrayList<Actor> castOfActors = new ArrayList<Actor>();
		
//		Actor a1 = new Actor("Denzel", "Washington", 50);
//		
		castOfActors.add(new Actor("Denzel", "Washington", 50));
		castOfActors.add(new Actor("Russell", "Crowe", 55));
		castOfActors.add(new Actor("Edris", "Alba", 45));
//		
		model.addAttribute("actors", castOfActors);
		
		return "index.jsp";
		
		
		//return render_template("index.html", movie = movieTitle)
	}
}
