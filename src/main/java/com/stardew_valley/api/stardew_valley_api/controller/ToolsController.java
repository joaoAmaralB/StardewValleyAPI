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

import com.stardew_valley.api.stardew_valley_api.domain.model.Tools.Tools;
import com.stardew_valley.api.stardew_valley_api.service.ToolsService;

@RestController
@RequestMapping("/tools")
public class ToolsController {
    private final ToolsService toolsService;

    public ToolsController(ToolsService toolsService) {
        this.toolsService = toolsService;
    }    

    @GetMapping("/{id}")
    public ResponseEntity<Tools> findById(@PathVariable Long id) {
        var tool = toolsService.findById(id);

        return ResponseEntity.ok(tool);
    }

    @GetMapping("")
    public ResponseEntity<List<Tools>> findById() {
        var Tools = toolsService.findAll();

        return ResponseEntity.ok(Tools);
    }

    @PostMapping
    public ResponseEntity<Tools> create(@RequestBody Tools toolToCreate) {
        var toolCreated = toolsService.create(toolToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{name}")
                .buildAndExpand(toolCreated.getName())
                .toUri();
        return ResponseEntity.created(location).body(toolCreated);
    }
}