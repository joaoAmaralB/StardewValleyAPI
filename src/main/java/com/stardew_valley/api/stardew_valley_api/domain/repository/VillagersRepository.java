package com.stardew_valley.api.stardew_valley_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stardew_valley.api.stardew_valley_api.domain.model.Villagers.Villagers;

@Repository
public interface VillagersRepository extends JpaRepository<Villagers, Long> {
    
}
