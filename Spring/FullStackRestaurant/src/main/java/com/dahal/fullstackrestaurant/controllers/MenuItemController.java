package com.dahal.fullstackrestaurant.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dahal.fullstackrestaurant.models.MenuItem;
import com.dahal.fullstackrestaurant.services.MenuItemService;

@Controller //@controller means that this class can return jsp files as a response and it can accept http requests
public class MenuItemController {
	
	//the controller speaks to the service to access data. Controller doesnt directly access the data, it uses the service as a middleman (for modularization purposes)
	private final MenuItemService menuService;

	//initialize the constructor with the MenuItemService enabled
	public MenuItemController(MenuItemService menuService) {
		this.menuService = menuService;
	}
	
	
	
	@RequestMapping("/menuitems")
	public String index(Model model){ //Dependency injection of Model model-> this means that we are enabling this index() method to have access to the View Model class to be able to pass data to templates
		
//		System.out.println(this.menuService.allMenuItems());
//		
		//create a variable called allMenuItems that will store a List<MenuItem> and set it equal to what the service returns which is a List<MenuItem>
		List<MenuItem> allMenuItems = this.menuService.allMenuItems();
//		
		//model.addAttribute lets us pass data from the controller to the jsp file that we render in this method
		model.addAttribute("allMenuItems", allMenuItems); //the word on the left side is what the HTML understands
//		
//		//send an empty MenuItem object to the form for the form to bind to
		model.addAttribute("menuitem", new MenuItem());
		return "index.jsp";
	}
	
	
//	//get info about one menu item by its id
	@RequestMapping("/menuitems/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		
		//retrieve menu item and put in variable. We are using the id from the path /menuitems/{id}--> and requesting from the service a menu item from the db that has that particular id
		MenuItem menuItem = this.menuService.findMenuItem(id);
		
		//pass the menuItem that was retrieved from the service to the templates ussing the view model
		model.addAttribute("menuItem", menuItem);
		
		return "oneItem.jsp";
	}
	
	
	//create a menu item (post submission of the form)
	@PostMapping("/menuitem/create")
	public String create(@Valid @ModelAttribute("menuitem") MenuItem menuItem, BindingResult result, Model model) {
		if(result.hasErrors()) {
			//need to pass in all menu items again to the template since we are re-rendering the template if there are validation errors
			List<MenuItem> allMenuItems = this.menuService.allMenuItems();
			
			model.addAttribute("allMenuItems", allMenuItems);
			return "index.jsp";
		}else { //else means there were no form errors, and we can send the menu item object from the form to the service
			this.menuService.createMenuItem(menuItem);
			return "redirect:/menuitems";
		}	
	}
	
	@RequestMapping("/menuitems/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		
		//get info about the menu item i want to edit by using the id from the route path (path variable) so I can pre-populate the edit form with this menu item's info. 
		MenuItem itemToEdit = this.menuService.findMenuItem(id);
		
		//pass the existing menu item object that already has information to the edit form by using the view model to pass to the template
		model.addAttribute("itemToEdit", itemToEdit);
		
		return "edit.jsp";
	}
//	
	@PutMapping("/menuitems/update/{id}")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("itemToEdit") MenuItem menuItemToEdit, BindingResult result) {
		
		//the @ModelAttributre("itemToEdit") needs to match the modelAttribute in the edit form so we can get the menu item object from the form and store it in a varaible. If the result has errors (form was not filled out properly), then we re -render the edit form
		if(result.hasErrors()) {
			
			return "edit.jsp";
		}else { //otherwise if theres no errors, we send the object to update to the service and the service will talk to the repository to update that item
			
			this.menuService.updateItem(menuItemToEdit);
			
			return "redirect:/menuitems"; //redirect to the menuitems page
		}
		
	}
	
//	//for deleting routes, just make it a get request
	@RequestMapping("/menuitems/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		
		//we collect the id of the item we want to delte using the @pathvariable(id), and then we tell the service to delete something with this id
		this.menuService.deleteItem(id);
		
		return "redirect:/menuitems";
	}
//	
	
	
	
}
