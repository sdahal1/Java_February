package com.dahal.fullstackrestaurant.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dahal.fullstackrestaurant.models.MenuItem;
import com.dahal.fullstackrestaurant.repositories.MenuItemRepository;

@Service
public class MenuItemService { //the service is what has access to the repository and thus the db
	
	// adding the MenuItemRepository as a member variabel to the service class so that this service can access the repository
    private final MenuItemRepository menuRepo;
    
    
    //constructor that has the repository injected into it (dependency injection) --> initializes the Service with connection to the repository
    public MenuItemService(MenuItemRepository menuRepo) {
    	this.menuRepo = menuRepo;
    }
    
    
    
    //methods that can use the repository to talk to db
 // returns all the Menu Items
    public List<MenuItem> allMenuItems() {
    	//we are using the findAll() method that the menuRepo has access to and that returns back a list of MenuItem objects in an Iterable data type. We have to cast it to List<MenuItem> then return the result;
        return (List<MenuItem>)this.menuRepo.findAll();
    }
    
    
    //this method to create new menu item accepts a MenuItem instance as an input and it will save it to the db using the repository
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
