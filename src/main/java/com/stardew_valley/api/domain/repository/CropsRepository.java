package com.stardew_valley.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stardew_valley.api.domain.model.Crops;

@Repository
public interface CropsRepository extends JpaRepository<Crops, Long> {
    
}
