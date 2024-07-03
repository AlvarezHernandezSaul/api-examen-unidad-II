package edu.utvt.mx.data.persistence.service;

import java.util.List;
import java.util.Optional;

import edu.utvt.mx.data.persistence.entities.Item;

public interface ItemService {
	
	 List<Item> getAllItems();
	 
	    Optional<Item> getItemById(Long id);
	    
	    List<Item> getItemsByNombre(String nombre);
	    
	    Item saveItem(Item item);
	    
	    void deleteItem(Long id);
}
