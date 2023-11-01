package com.stardew_valley.api.stardew_valley_api.domain.model.Villagers;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_family")
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Villagers relative;
    private String kinship;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Villagers getRelative() {
        return relative;
    }
    public void setRelative(Villagers relative) {
        this.relative = relative;
    }
    public String getKinship() {
        return kinship;
    }
    public void setKinship(String kinship) {
        this.kinship = kinship;
    }
}
