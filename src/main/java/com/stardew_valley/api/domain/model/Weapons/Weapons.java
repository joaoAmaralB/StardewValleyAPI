package com.stardew_valley.api.domain.model.Weapons;

import java.util.List;

import javax.xml.stream.Location;

import com.stardew_valley.api.domain.model.BuyPrice;
import com.stardew_valley.api.domain.model.SellPrice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_weapons")
public class Weapons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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