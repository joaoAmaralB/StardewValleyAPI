package com.stardew_valley.api.stardew_valley_api.domain.model.Tools;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_tools")
public class Tools {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String url;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private UppgradePrice uppgradePrice;
    @OneToOne(cascade = CascadeType.ALL)
    private Ingredients ingredients;
    private String improvements;
    
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
    public UppgradePrice getUppgradePrice() {
        return uppgradePrice;
    }
    public void setUppgradePrice(UppgradePrice uppgradePrice) {
        this.uppgradePrice = uppgradePrice;
    }
    public Ingredients getIngredients() {
        return ingredients;
    }
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }
    public String getImprovements() {
        return improvements;
    }
    public void setImprovements(String improvements) {
        this.improvements = improvements;
    }
}