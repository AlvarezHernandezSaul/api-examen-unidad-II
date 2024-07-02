package edu.utvt.mx.data.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.utvt.mx.data.persistence.entities.Item;

import java.util.List;
import java.util.UUID;

public interface ItemRepository extends JpaRepository<Item, UUID> {
    List<Item> findByName(String name);
}
