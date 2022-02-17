package com.dahal.teamsplayers.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dahal.teamsplayers.models.Player;
import com.dahal.teamsplayers.models.Team;
import com.dahal.teamsplayers.services.AppService;

@Controller
public class HomeController {
	private final AppService appServ;
	
	public HomeController(AppService appServ) {
		this.appServ = appServ;
	}
	
	
	@RequestMapping("/")
	public String home(Model model) {
		//whenever you render a form, send an empty object to the form using the view model so that the form can bind to the empty object and have it validations and it can update that objects info from the form
		model.addAttribute("team", new Team());
		
		return "teamhome.jsp";
	}
	
	@PostMapping("/teams/create")
	public String createTeam(@Valid @ModelAttribute("team") Team team, BindingResult result) {
		if(result.hasErrors()) {
			return "teamhome.jsp";
		}else {
			//if no form errors, create a team by using the service 
			this.appServ.createTeam(team);
			return "redirect:/";
		}
		
	}
	
	@RequestMapping("/players/add")
	public String addPlayer(Model model) {
		//pass an empty player obj to the form for the form to bind to and update its information with
		model.addAttribute("player", new Player());
		
		
		//pass a list of all teams to the template so that the form can show all the teams that the player can be added to
		model.addAttribute("allteams",this.appServ.getAllTeams());
		
		return "player.jsp";
	}
	
	
	//create a player when the form submits using post request
	@PostMapping("/players/create")
	public String createPlayer(@Valid @ModelAttribute("player") Player player, BindingResult result) {
		if(result.hasErrors()) {
			return "player.jsp";
		}else {
			//if no errros in form, then create a player using the service
			this.appServ.createPlayer(player);
			
			return "redirect:/";
		}
		
		
	}
	
	@RequestMapping("/teams/{id}")
	public String showOneTeamDetails(@PathVariable("id") Long id, Model model) {
		
		//get one team using the id from the pathvariable by requesting it from the service 
		Team teamToshow = this.appServ.getOneTeam(id);
		
		model.addAttribute("teamToshow", teamToshow);
		
		return "oneTeamDetails.jsp";
	}
	
	
	
	
	
	
	
	
	
	
}
