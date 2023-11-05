package com.stardew_valley.api.stardew_valley_api.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.stardew_valley.api.stardew_valley_api.domain.model.Tools.Tools;
import com.stardew_valley.api.stardew_valley_api.domain.repository.ToolsRepository;
import com.stardew_valley.api.stardew_valley_api.service.ToolsService;

@Service
public class ToolsServiceImpl implements ToolsService {

    private final ToolsRepository toolsRepository;

    public ToolsServiceImpl(ToolsRepository toolsRepository) {
        this.toolsRepository = toolsRepository;
    }
    
    @Override
    public Tools findById(Long id) {
        return toolsRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Tools> findAll() {
        return toolsRepository.findAll();
    }

    @Override
    public Tools create(Tools toolToCreate) {
        if (toolsRepository.existsByName(toolToCreate.getName())) {
            throw new IllegalArgumentException("This tool already exists");
        }

        return toolsRepository.save(toolToCreate);
    }
}