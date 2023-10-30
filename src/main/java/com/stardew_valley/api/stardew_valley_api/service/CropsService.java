package com.stardew_valley.api.stardew_valley_api.service;

import java.util.List;

import com.stardew_valley.api.stardew_valley_api.domain.model.Crops.Crops;

public interface CropsService {
    Crops findById(Long id);

    List<Crops> findAll();

    Crops create(Crops cropToCreate);
}