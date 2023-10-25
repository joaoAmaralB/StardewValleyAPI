package com.stardew_valley.api.domain.model.controller;

import com.stardew_valley.api.service.AnimalsService;

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

    @GetMapping("/")
    public ResponseEntity<Animals> findById() {
        var animals = animalsService.findAll();

        return ResponseEntity.ok(animals);
    }

    @PostMapping
    public ResponseEntity<Animals> create(@RequestBody Animals animalToCreate) {
        var animalCreated = animalsService.create(animalToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(animalCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(animalCreated);
    }
}