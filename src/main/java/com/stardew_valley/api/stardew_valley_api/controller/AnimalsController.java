package com.stardew_valley.api.stardew_valley_api.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.stardew_valley.api.stardew_valley_api.domain.model.Animals.Animals;
import com.stardew_valley.api.stardew_valley_api.service.AnimalsService;

@RestController
@RequestMapping("/animals")
public class AnimalsController {
    private final AnimalsService animalsService;

    public AnimalsController(AnimalsService animalsService) {
        this.animalsService = animalsService;
    }    

    @GetMapping("/{id}")
    public ResponseEntity<Animals> findById(@PathVariable Long id) {
        var animal = animalsService.findById(id);

        return ResponseEntity.ok(animal);
    }

    @GetMapping("")
    public ResponseEntity<List<Animals>> findById() {
        var animals = animalsService.findAll();

        return ResponseEntity.ok(animals);
    }

    @PostMapping
    public ResponseEntity<Animals> create(@RequestBody Animals animalToCreate) {
        var animalCreated = animalsService.create(animalToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{name}")
                .buildAndExpand(animalCreated.getName())
                .toUri();
        return ResponseEntity.created(location).body(animalCreated);
    }
}