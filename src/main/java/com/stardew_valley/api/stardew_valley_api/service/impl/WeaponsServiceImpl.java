package com.stardew_valley.api.stardew_valley_api.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.stardew_valley.api.stardew_valley_api.domain.model.Weapons.Weapons;
import com.stardew_valley.api.stardew_valley_api.domain.repository.WeaponsRepository;
import com.stardew_valley.api.stardew_valley_api.service.WeaponsService;

@Service
public class WeaponsServiceImpl implements WeaponsService {

    private final WeaponsRepository weaponsRepository;

    public WeaponsServiceImpl(WeaponsRepository weaponsRepository) {
        this.weaponsRepository = weaponsRepository;
    }
    
    @Override
    public Weapons findById(Long id) {
        return weaponsRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Weapons> findAll() {
        return weaponsRepository.findAll();
    }

    @Override
    public Weapons create(Weapons weaponToCreate) {
        if (weaponsRepository.existsByName(weaponToCreate.getName())) {
            throw new IllegalArgumentException("This weapon already exists");
        }

        return weaponsRepository.save(weaponToCreate);
    }
}