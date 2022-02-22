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

}
