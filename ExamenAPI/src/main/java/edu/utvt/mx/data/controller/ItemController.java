package edu.utvt.mx.data.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.utvt.mx.data.persistence.entities.Item;
import edu.utvt.mx.data.persistence.service.ItemService;

@RestController
@RequestMapping("/api/exa/items")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}

	@GetMapping("/{id}")
	public Item getItemById(@PathVariable UUID id) {
		return itemService.getItemById(id).orElse(null);
	}
	
	@GetMapping("/name/{name}")
    public List<Item> getItemsByName(@PathVariable String name) {
		  return itemService.getItemsByName(name);
	}
	
	@PostMapping
	public Item createItem(@RequestBody Item item) {
		return itemService.saveItem(item);
	}
	
	@PutMapping("/{id}")
	public Item updateItem(@PathVariable UUID id, @RequestBody Item itemDetails) {
		
		Item item = itemService.getItemById(id).orElse(itemDetails);
		  if (item != null) {
	            item.setName(itemDetails.getName());
	            item.setDescription(itemDetails.getDescription());
	            item.setPersona(itemDetails.getPersona());
	            return itemService.saveItem(item);
	        }
	        return null;
	    }

	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable UUID id) {
		itemService.deleteItem(id);
	}
	
}
