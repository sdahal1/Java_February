package com.dahal.fullstackrestaurant.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dahal.fullstackrestaurant.models.MenuItem;
import com.dahal.fullstackrestaurant.services.MenuItemService;

@Controller
public class MenuItemController {
	private final MenuItemService menuService;

	
	public MenuItemController(MenuItemService menuService) {
		this.menuService = menuService;
	}
	
	
	
	@RequestMapping("/menuitems")
	public String index(Model model){
		
		System.out.println(this.menuService.allMenuItems());
		
		List<MenuItem> allMenuItems = this.menuService.allMenuItems();
		
		model.addAttribute("allMenuItems", allMenuItems);
		
		
		return "index.jsp";
	}
	
	
	//get info about one menu item by its id
	@RequestMapping("/menuitems/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		
		//retrieve menu item and put in variable
		MenuItem menuItem = this.menuService.findMenuItem(id);
		
		model.addAttribute("menuItem", menuItem);
		
		return "oneItem.jsp";
	}
	
	
}
