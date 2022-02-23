package com.dahal.beltreview.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dahal.beltreview.models.Idea;
import com.dahal.beltreview.services.IdeaService;

@Controller
public class IdeaController {

	@Autowired
    private IdeaService ideaServ;
	
	
	@RequestMapping("/ideas/new")
	public String addNewIdea(Model model, HttpSession session) {
		//we will render a create form in this method
		
		
		//pass in empty idea object to the form so the form can bind to it
		model.addAttribute("idea", new Idea());
		
		
//		get the id of the logged inuser using session
		Long idOfLoggedInUser = (Long)session.getAttribute("loggedInUserID");
		
		//pass info about the logged in user to the form so that we know who is the uploader of the item/idea/pet/etc;
		model.addAttribute("idOfLoggedInUser", idOfLoggedInUser);
		
		return "addIdea.jsp";
	}
	
	@PostMapping("/ideas/create")
	public String createNewIdea(@Valid @ModelAttribute("idea") Idea idea, BindingResult result) {
		if(result.hasErrors()) {
			return "addIdea.jsp";
		}
		
		//if the form is submitted properly and there are no validation errors, request the service to create something new( new idea)
		this.ideaServ.createNewIdea(idea);
		
		return "redirect:/home";
	}
	
	
	@RequestMapping("/ideas/{id}/details")
	public String getIdeaDetails(@PathVariable("id") Long id, Model model, HttpSession session) {
		
		//use the id from the path variable to send to the service to get info about an idea given that id
		Idea ideaToShow = this.ideaServ.getOneIdea(id);
		
		model.addAttribute("ideaToShow", ideaToShow);
		
//		get the id of the logged inuser using session
		Long idOfLoggedInUser = (Long)session.getAttribute("loggedInUserID");
		
		//pass info about the logged in user to the form so that we know who is the uploader of the item/idea/pet/etc;
		model.addAttribute("idOfLoggedInUser", idOfLoggedInUser);
		
		return "ideaDetail.jsp";
	}
	
	@RequestMapping("/ideas/{id}/edit")
	public String editIdea(@PathVariable("id")Long id, Model model, HttpSession session) {
		
		//get an idea from the db using the service and the id from the path
		Idea idea = this.ideaServ.getOneIdea(id);
		
		model.addAttribute("idea", idea);
		
		
		//get the id of the logged inuser using session
		Long idOfLoggedInUser = (Long)session.getAttribute("loggedInUserID");
		
		//pass info about the logged in user to the form so that we know who is the uploader of the item/idea/pet/etc;
		model.addAttribute("idOfLoggedInUser", idOfLoggedInUser);
		
		//check only render the jsp if the id of the loggedin user is the same as the id of the ideas creator
		if(idOfLoggedInUser == idea.getUploader().getId()) {
			return "editIdea.jsp";
		}else {
			return "redirect:/home";
		}
		
		
		
	}
	
	@PutMapping("/ideas/{id}/update")
	public String updateIdea(@PathVariable("id") Long id, @Valid @ModelAttribute("idea") Idea idea, BindingResult result) {
		
		if(result.hasErrors()) {
			return "editIdea.jsp";
		}
		
		//if no validation errors, send the idea object from the from to the service so the service can update it
		this.ideaServ.updateIdea(idea);
		return "redirect:/home";
		
	}
	
	@RequestMapping("/ideas/{id}/delete")
    public String deleteIdea(@PathVariable("id") Long id) {
		
		this.ideaServ.deleteIdea(id);
		
		return "redirect:/home";
	}
	
	
	
	
	
	
}
