package com.stardew_valley.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stardew_valley.api.domain.model.Animals;

@Repository
public interface AnimalsRepository extends JpaRepository<Animals, Long> {
    boolean existsByName(String name);
}
