package com.stardew_valley.api.domain.model.Tools;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_tools")
public class Tools {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String url;
    private String name;
    private UppgradePrice uppgradePrice;
    private Ingredients ingredients;
    private String improvements;
}