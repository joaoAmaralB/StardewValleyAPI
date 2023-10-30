package com.stardew_valley.api.stardew_valley_api.service;

import java.util.List;

import com.stardew_valley.api.stardew_valley_api.domain.model.Animals.Animals;

public interface AnimalsService {
    Animals findById(Long id);

    List<Animals> findAll();

    Animals create(Animals animalToCreate);
}