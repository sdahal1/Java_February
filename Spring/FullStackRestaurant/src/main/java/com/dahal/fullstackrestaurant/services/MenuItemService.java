package com.dahal.fullstackrestaurant.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dahal.fullstackrestaurant.models.MenuItem;
import com.dahal.fullstackrestaurant.repositories.MenuItemRepository;

@Service
public class MenuItemService {
	// adding the book repository as a dependency
    private final MenuItemRepository menuRepo;
    
    
    //constructor that has the repository injected into it (dependency injection) --> initializes the Service with connection to the repository
    public MenuItemService(MenuItemRepository menuRepo) {
    	this.menuRepo = menuRepo;
    }
    
    
    //methods that can use the repository to talk to db
 // returns all the Menu Items
    public List<MenuItem> allMenuItems() {
    	
        return (List<MenuItem>)this.menuRepo.findAll();
    }
    
    public MenuItem createMenuItem(MenuItem menuItem) {
    	
    	return this.menuRepo.save(menuItem);
    }
    
    
    //retrieves a MenuItem by id
    public MenuItem findMenuItem(Long id) {
    	
    	return this.menuRepo.findById(id).orElse(null);
    }
    
    
    //update a menuitem given an object
    public MenuItem updateItem(MenuItem menuItem) {
    	return this.menuRepo.save(menuItem);
    }
    
    //delete a menuitem by its id
    public void deleteItem(Long id) {
    	this.menuRepo.deleteById(id);
    	
    }
    
    
    
    
}
