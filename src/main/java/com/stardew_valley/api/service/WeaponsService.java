package com.stardew_valley.api.service;

import java.util.List;

import com.stardew_valley.api.domain.model.Weapons.Weapons;

public interface WeaponsService {
    Weapons findById(Long id);

    List<Weapons> findAll();

    Weapons create(Weapons weaponToCreate);
}