package edu.utvt.mx.data.persistence.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import edu.utvt.mx.data.persistence.entities.Item;

public interface ItemService {
	
	List<Item> getAllItems();
	
    Optional<Item> getItemById(UUID id);
    
    List<Item> getItemsByName(String name);

    Item saveItem(Item item);
    
    void deleteItem(UUID id);
}
