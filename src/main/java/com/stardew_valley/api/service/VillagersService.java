package com.stardew_valley.api.service;

import com.stardew_valley.api.domain.model.Villagers.Villagers;

public interface VillagersService {
    Villagers findById(Long id);

    Villagers findAll();

    Villagers create(Villagers villagerToCreate);
}