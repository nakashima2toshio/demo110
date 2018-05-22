package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

@Controller
@RequestMapping("/items")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		List<Item> items = itemService.findAll();
		model.addAttribute("items", items);
		return "items/index";
	}
	/*
	@RequestMapping(method=RequestMethod.GET, value="/items/{id}")
	public Item getItem(@PathVariable("id") Long id) {
		Item itm =  itemService.findOne(id);
		return Item;
	}
	*/
}
