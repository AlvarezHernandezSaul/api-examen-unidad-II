package edu.utvt.mx.data.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "items")
public class Item {

	 @Id
	 @GeneratedValue(generator = "UUID")
	 @Column(updatable = false, nullable = false)
	 private UUID id;

    @Column(nullable = false)
    private String name;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id")
    private Persona persona;
}