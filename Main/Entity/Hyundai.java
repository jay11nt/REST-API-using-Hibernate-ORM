package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


// Hyundai entity class with a bidirectional one-to-one relationship with Kia.
@Entity
@Data
@NoArgsConstructor
public class Hyundai 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelName;  // Car model name

    @OneToOne(mappedBy = "hyundai", cascade = CascadeType.ALL)
    private Kia kia;  // Bidirectional relationship with Kia
}
