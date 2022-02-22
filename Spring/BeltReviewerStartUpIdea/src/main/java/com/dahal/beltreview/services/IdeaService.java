package com.dahal.beltreview.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dahal.beltreview.models.Idea;
import com.dahal.beltreview.repositories.IdeaRepository;

@Service
public class IdeaService {
	
	@Autowired
	private IdeaRepository ideaRepo;

	
	//show all ideas
	public List<Idea> findAllIdeas(){
		//use the repo to query the idea table for all ideas
		return (List<Idea>)this.ideaRepo.findAll();
	}
	
	
	//create idea
	public Idea createNewIdea(Idea idea) {
		return this.ideaRepo.save(idea);
	}
	
	//get one idea
	public Idea getOneIdea(Long id) {
		return this.ideaRepo.findById(id).orElse(null);
	}
	
	//update one idea
	public Idea updateIdea(Idea idea) {
		return this.ideaRepo.save(idea);
	}
	
	
	//delete one idea
	public void deleteIdea(Long id) {
		this.ideaRepo.deleteById(id);
	}

}
