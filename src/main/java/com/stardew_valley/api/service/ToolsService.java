package com.stardew_valley.api.service;

import com.stardew_valley.api.domain.model.Tools.Tools;

public interface ToolsService {
    Tools findById(Long id);

    Tools findAll();

    Tools create(Tools toolToCreate);
}