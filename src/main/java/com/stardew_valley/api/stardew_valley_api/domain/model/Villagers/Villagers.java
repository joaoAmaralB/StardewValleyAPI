package com.stardew_valley.api.stardew_valley_api.domain.model.Villagers;

import java.util.List;

import com.stardew_valley.api.stardew_valley_api.domain.model.Building;
import com.stardew_valley.api.stardew_valley_api.domain.model.Crops.Crops;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

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
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Family> family;
    private String description;
    private String schedule;
    private String relationships;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Crops> lovedCrops;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Crops> neutralCrops;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Crops> hatedCrops;

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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Birthday getBirthday() {
        return birthday;
    }
    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }
    public Building getAddress() {
        return address;
    }
    public void setAddress(Building address) {
        this.address = address;
    }
    public List<Family> getFamily() {
        return family;
    }
    public void setFamily(List<Family> family) {
        this.family = family;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSchedule() {
        return schedule;
    }
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    public String getRelationships() {
        return relationships;
    }
    public void setRelationships(String relationships) {
        this.relationships = relationships;
    }
    public List<Crops> getLovedCrops() {
        return lovedCrops;
    }
    public void setLovedCrops(List<Crops> lovedCrops) {
        this.lovedCrops = lovedCrops;
    }
    public List<Crops> getNeutralCrops() {
        return neutralCrops;
    }
    public void setNeutralCrops(List<Crops> neutralCrops) {
        this.neutralCrops = neutralCrops;
    }
    public List<Crops> getHatedCrops() {
        return hatedCrops;
    }
    public void setHatedCrops(List<Crops> hatedCrops) {
        this.hatedCrops = hatedCrops;
    }
}