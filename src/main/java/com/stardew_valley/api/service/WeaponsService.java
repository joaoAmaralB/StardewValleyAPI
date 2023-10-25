package com.stardew_valley.api.service;

import com.stardew_valley.api.domain.model.Weapons.Weapons;

public interface WeaponsService {
    Weapons findById(Long id);

    Weapons findAll();

    Weapons create(Weapons weaponToCreate);
}