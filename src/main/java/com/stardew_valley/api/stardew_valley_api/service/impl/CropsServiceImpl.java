package com.stardew_valley.api.stardew_valley_api.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.stardew_valley.api.stardew_valley_api.domain.model.Crops.Crops;
import com.stardew_valley.api.stardew_valley_api.domain.repository.CropsRepository;
import com.stardew_valley.api.stardew_valley_api.service.CropsService;

@Service
public class CropsServiceImpl implements CropsService {

    private final CropsRepository cropsRepository;

    public CropsServiceImpl(CropsRepository cropsRepository) {
        this.cropsRepository = cropsRepository;
    }
    
    @Override
    public Crops findById(Long id) {
        return cropsRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Crops> findAll() {
        return cropsRepository.findAll();
    }

    @Override
    public Crops create(Crops cropToCreate) {
        if (cropsRepository.existsByName(cropToCreate.getName())) {
            throw new IllegalArgumentException("This crop already exists");
        }

        return cropsRepository.save(cropToCreate);
    }
}