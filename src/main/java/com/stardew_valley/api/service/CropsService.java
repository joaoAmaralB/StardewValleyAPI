package com.stardew_valley.api.service;

import com.stardew_valley.api.domain.model.Crops.Crops;

public interface CropsService {
    Crops findById(Long id);

    Crops findAll();

    Crops create(Crops cropToCreate);
}