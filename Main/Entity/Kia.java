package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


//Kia entity class with a bidirectional one-to-one relationship with Hyundai.

@Entity
@Data
@NoArgsConstructor
public class Kia 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelName;  // Car model name

    
    @OneToOne
    @JoinColumn(name = "hyundai_id")  // Foreign key column in Kia
    private Hyundai hyundai;  // One-to-one relationship with Hyundai
}
