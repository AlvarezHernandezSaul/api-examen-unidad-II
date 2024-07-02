package edu.utvt.mx.data.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "personas")
public class Persona {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Column(nullable = false)
    private String name;

    private String email;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Item> items;
}
