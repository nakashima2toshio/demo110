package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepo;
	
	public List<Item> findAll(){
		return itemRepo.findAll();
	}
	
	public Item findOne(Long id) {
		return itemRepo.getOne(id);
	}
	
	public Item save(Item item) {
		return itemRepo.save(item);
	}
	
	public void delete(Long id) {
		itemRepo.deleteById(id);
	}

}
