package com.stardew_valley.api.domain.model;

import java.util.List;

@Entity
public class Crops {
    private Long id;
    private String season;
    private String description;
    private List<Stages> stages;
    private List<Gifting> gifting;
    private List<Recipes> recipes;
    private List<SellPrice> sellPrices;
}
