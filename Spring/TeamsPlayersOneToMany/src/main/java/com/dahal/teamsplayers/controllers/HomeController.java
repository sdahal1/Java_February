package com.dahal.teamsplayers.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	
	
	
}
