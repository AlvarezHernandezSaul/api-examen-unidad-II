package edu.utvt.mx.data.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.utvt.mx.data.persistence.entities.Item;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByName(String name);
}