package com.stardew_valley.api.domain.model.Villagers;

import com.stardew_valley.api.domain.model.Building;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_villagers")
public class Villagers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String type;
    private String name;
    private String url;
    private Birthday birthday;
    private Building address;
    private Family family;
    private String description;
    private String schedule;
    private String relationships;
    private Gifts gifts;
}