package com.stardew_valley.api.stardew_valley_api.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.stardew_valley.api.stardew_valley_api.domain.model.Animals.Animals;
import com.stardew_valley.api.stardew_valley_api.domain.repository.AnimalsRepository;
import com.stardew_valley.api.stardew_valley_api.service.AnimalsService;

@Service
public class AnimalsServiceImpl implements AnimalsService {

    private final AnimalsRepository animalsRepository;

    public AnimalsServiceImpl(AnimalsRepository animalsRepository) {
        this.animalsRepository = animalsRepository;
    }
    
    @Override
    public Animals findById(Long id) {
        return animalsRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Animals> findAll() {
        return animalsRepository.findAll();
    }

    @Override
    public Animals create(Animals animalToCreate) {
        if (animalsRepository.existsByName(animalToCreate.getName())) {
            throw new IllegalArgumentException("This animal already exists");
        }

        return animalsRepository.save(animalToCreate);
    }
}