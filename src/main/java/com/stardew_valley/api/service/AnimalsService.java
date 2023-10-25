package com.stardew_valley.api.service;

import com.stardew_valley.api.domain.model.Animals.Animals;

public interface AnimalsService {
    Animals findById(Long id);

    Animals findAll();

    Animals create(Animals animalToCreate);
}