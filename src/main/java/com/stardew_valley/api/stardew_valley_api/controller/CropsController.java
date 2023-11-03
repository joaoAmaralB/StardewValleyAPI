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

import com.stardew_valley.api.stardew_valley_api.domain.model.Crops.Crops;
import com.stardew_valley.api.stardew_valley_api.service.CropsService;

@RestController
@RequestMapping("/crops")
public class CropsController {
    private final CropsService cropsService;

    public CropsController(CropsService cropsService) {
        this.cropsService = cropsService;
    }    

    @GetMapping("/{id}")
    public ResponseEntity<Crops> findById(@PathVariable Long id) {
        var crop = cropsService.findById(id);

        return ResponseEntity.ok(crop);
    }

    @GetMapping("")
    public ResponseEntity<List<Crops>> findById() {
        var Crops = cropsService.findAll();

        return ResponseEntity.ok(Crops);
    }

    @PostMapping
    public ResponseEntity<Crops> create(@RequestBody Crops cropToCreate) {
        var cropCreated = cropsService.create(cropToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{name}")
                .buildAndExpand(cropCreated.getName())
                .toUri();
        return ResponseEntity.created(location).body(cropCreated);
    }
}