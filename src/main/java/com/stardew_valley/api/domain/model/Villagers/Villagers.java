package com.stardew_valley.api.domain.model;

import com.stardew_valley.api.domain.model.Building;

@Entity
public class Villagers {
    @Id
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