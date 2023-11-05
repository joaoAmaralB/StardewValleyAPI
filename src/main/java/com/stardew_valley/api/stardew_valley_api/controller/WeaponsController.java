package com.stardew_valley.api.stardew_valley_api.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.stardew_valley.api.stardew_valley_api.domain.model.Weapons.Weapons;
import com.stardew_valley.api.stardew_valley_api.service.WeaponsService;

@RestController
@RequestMapping("/weapons")
public class WeaponsController {

    private final WeaponsService weaponsService;

    public WeaponsController(WeaponsService weaponsService) {
        this.weaponsService = weaponsService;
    }    

    @GetMapping("/{id}")
    public ResponseEntity<Weapons> findById(@PathVariable Long id) {
        var weapon = weaponsService.findById(id);

        return ResponseEntity.ok(weapon);
    }

    @GetMapping("")
    public ResponseEntity<List<Weapons>> findById() {
        var weapons = weaponsService.findAll();

        return ResponseEntity.ok(weapons);
    }

    @PostMapping
    public ResponseEntity<Weapons> create(@RequestBody Weapons weaponToCreate) {
        var weaponCreated = weaponsService.create(weaponToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{name}")
                .buildAndExpand(weaponCreated.getName())
                .toUri();
        return ResponseEntity.created(location).body(weaponCreated);
    }
}