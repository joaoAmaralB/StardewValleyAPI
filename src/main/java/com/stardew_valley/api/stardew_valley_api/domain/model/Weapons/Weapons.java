package com.stardew_valley.api.stardew_valley_api.domain.model.Weapons;

import java.util.List;

import com.stardew_valley.api.stardew_valley_api.domain.model.BuyPrice;
import com.stardew_valley.api.stardew_valley_api.domain.model.SellPrice;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

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
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Stats> stats;
    private String location;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private SellPrice sellPrice;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private BuyPrice buyPrice;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getDamage() {
        return damage;
    }
    public void setDamage(String damage) {
        this.damage = damage;
    }
    public String getCritChance() {
        return critChance;
    }
    public void setCritChance(String critChance) {
        this.critChance = critChance;
    }
    public List<Stats> getStats() {
        return stats;
    }
    public void setStats(List<Stats> stats) {
        this.stats = stats;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public SellPrice getSellPrice() {
        return sellPrice;
    }
    public void setSellPrice(SellPrice sellPrice) {
        this.sellPrice = sellPrice;
    }
    public BuyPrice getBuyPrice() {
        return buyPrice;
    }
    public void setBuyPrice(BuyPrice buyPrice) {
        this.buyPrice = buyPrice;
    }
}