package com.stardew_valley.api.service;

import java.util.List;

import com.stardew_valley.api.domain.model.Villagers.Villagers;

public interface VillagersService {
    Villagers findById(Long id);

    List<Villagers> findAll();

    Villagers create(Villagers villagerToCreate);
}