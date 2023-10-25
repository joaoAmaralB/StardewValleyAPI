package com.stardew_valley.api.domain.model.Crops;

import java.util.List;

import com.stardew_valley.api.domain.model.SellPrice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_crops")
public class Crops {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String season;
    private String description;
    private List<Stages> stages;
    private List<Gifting> gifting;
    private List<Recipes> recipes;
    private List<SellPrice> sellPrices;
}
