package com.stardew_valley.api.domain.model;

import java.util.List;

import jakarta.persistence.Entity;
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

    @OneToMany
    private List<Products> products;

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