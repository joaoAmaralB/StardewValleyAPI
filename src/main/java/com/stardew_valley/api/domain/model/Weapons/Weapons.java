package com.stardew_valley.api.domain.model;

import java.util.List;

import javax.xml.stream.Location;

@Entity
public class Weapons {
    private Long id;
    private String type;
    private String url;
    private String name;
    private String level;
    private String damage;
    private String critChance;
    private List<Stats> stats;
    private String location;
    private SellPrice sellPrice;
    private BuyPrice buyPrice;
}