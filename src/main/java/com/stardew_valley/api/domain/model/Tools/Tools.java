package com.stardew_valley.api.domain.model;

@Entity
public class Tools {
    @Id
    private Long id;
    private String type;
    private String url;
    private String name;
    private UppgradePrice uppgradePrice;
    private Ingredients ingredients;
    private String improvements;
}