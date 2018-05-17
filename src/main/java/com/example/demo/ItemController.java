package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public String index(Model model) {
		List<Item> items = itemService.findAll();
		model.addAttribute("items", items);
		return "items/index";
	}
	
}
