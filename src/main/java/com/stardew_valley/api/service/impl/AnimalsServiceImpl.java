package com.stardew_valley.api.service;

import java.util.EmptyStackException;

import com.stardew_valley.api.domain.repository.AnimalsRepository;
import com.stardew_valley.api.service.AnimalsService;

@Service
public class AnimalsServiceImpl implements AnimalsService {

    private final AnimalsRepository animalsRepository;

    public AnimalsService(AnimalsRepository animalsRepository) {
        this.animalsRepository = animalsRepository;
    }
    
    @Override
    public Animals findById(Long id) {
        return animalsRepository.findById(id).orElseThrow(new NoSuchElementException("Cannot find the animal with id: "+id));
    }

    @Override
    public Animals findAll() {
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