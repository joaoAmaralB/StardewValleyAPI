package com.stardew_valley.api.stardew_valley_api.domain.model.Animals;

import java.util.List;

import com.stardew_valley.api.stardew_valley_api.domain.model.Building;
import com.stardew_valley.api.stardew_valley_api.domain.model.BuyPrice;
import com.stardew_valley.api.stardew_valley_api.domain.model.SellPrice;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "tb_animals")
public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String care;
    private Building building;
    private SellPrice sellPrice;
    private BuyPrice buyPrice;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Products> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCare() {
        return care;
    }

    public void setCare(String care) {
        this.care = care;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
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

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}