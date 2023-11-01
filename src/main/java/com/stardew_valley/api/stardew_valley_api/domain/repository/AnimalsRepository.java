package com.stardew_valley.api.stardew_valley_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stardew_valley.api.stardew_valley_api.domain.model.Animals.Animals;

@Repository
public interface AnimalsRepository extends JpaRepository<Animals, Long> {
    boolean existsByName(String name);
}
