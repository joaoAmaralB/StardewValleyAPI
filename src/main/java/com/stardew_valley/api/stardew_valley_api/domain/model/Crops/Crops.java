package com.stardew_valley.api.stardew_valley_api.domain.model.Crops;

import java.util.List;

import com.stardew_valley.api.stardew_valley_api.domain.model.SellPrice;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_crops")
public class Crops {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String growTime;
    private String season;
    private String description;
    @OneToOne(cascade = CascadeType.ALL)
    private Stages stages;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Recipes> recipes;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SellPrice> sellPrices;
    @ElementCollection
    @CollectionTable(name = "crops_loved_by", joinColumns = @JoinColumn(name = "crops_id"))
    @Column(name = "villager_id")
    private List<Long> lovedBy;
    @ElementCollection
    @CollectionTable(name = "crops_hated_by", joinColumns = @JoinColumn(name = "crops_id"))
    @Column(name = "villager_id")
    private List<Long> hatedBy;
    @ElementCollection
    @CollectionTable(name = "crops_neutral_by", joinColumns = @JoinColumn(name = "crops_id"))
    @Column(name = "villager_id")
    private List<Long> neutralBy;

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
    public String getGrowTime() {
        return growTime;
    }
    public void setGrowTime(String growTime) {
        this.growTime = growTime;
    }
    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Stages getStages() {
        return stages;
    }
    public void setStages(Stages stages) {
        this.stages = stages;
    }
    public List<Recipes> getRecipes() {
        return recipes;
    }
    public void setRecipes(List<Recipes> recipes) {
        this.recipes = recipes;
    }
    public List<SellPrice> getSellPrices() {
        return sellPrices;
    }
    public void setSellPrices(List<SellPrice> sellPrices) {
        this.sellPrices = sellPrices;
    }
    public List<Long> getLovedBy() {
        return lovedBy;
    }
    public void setLovedBy(List<Long> lovedBy) {
        this.lovedBy = lovedBy;
    }
    public List<Long> getHatedBy() {
        return hatedBy;
    }
    public void setHatedBy(List<Long> hatedBy) {
        this.hatedBy = hatedBy;
    }
    public List<Long> getNeutralBy() {
        return neutralBy;
    }
    public void setNeutralBy(List<Long> neutralBy) {
        this.neutralBy = neutralBy;
    }
}
