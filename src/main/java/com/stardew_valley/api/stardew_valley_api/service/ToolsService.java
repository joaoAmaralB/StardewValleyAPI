package com.stardew_valley.api.stardew_valley_api.service;

import java.util.List;

import com.stardew_valley.api.stardew_valley_api.domain.model.Tools.Tools;

public interface ToolsService {
    Tools findById(Long id);

    List<Tools> findAll();

    Tools create(Tools toolToCreate);
}