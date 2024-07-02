package edu.utvt.mx.data.persistence.service;

import java.util.List;
import java.util.Optional;

import edu.utvt.mx.data.persistence.entities.Item;
import edu.utvt.mx.data.persistence.repositories.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ItemServiceImplementation implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> getItemById(UUID id) {
        return itemRepository.findById(id);
    }

    @Override
    public List<Item> getItemsByName(String name) {
        return itemRepository.findByName(name);
    }

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(UUID id) {
        itemRepository.deleteById(id);
    }
}