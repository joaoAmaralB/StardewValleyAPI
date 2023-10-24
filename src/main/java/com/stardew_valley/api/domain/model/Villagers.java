package com.stardew_valley.api.domain.model;

@Entity
public class Villagers {
    @Id
    private Long id;
    private String type;
    private String name;
    private String url;
    private Birthday birthday;
    private String address;
    private Family family;
    private String description;
    private String schedule;
    private String relationships;
    private Gifts gifts;
}