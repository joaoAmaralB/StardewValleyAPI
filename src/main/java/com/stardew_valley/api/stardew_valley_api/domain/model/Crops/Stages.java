package com.stardew_valley.api.stardew_valley_api.domain.model.Crops;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_stages")
public class Stages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List<String> stageNumbers;
    private List<String> urls;
    private List<String> daysNumbers;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public List<String> getStageNumbers() {
        return stageNumbers;
    }
    public void setStageNumbers(List<String> stageNumbers) {
        this.stageNumbers = stageNumbers;
    }
    public List<String> getUrls() {
        return urls;
    }
    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
    public List<String> getDaysNumbers() {
        return daysNumbers;
    }
    public void setDaysNumbers(List<String> daysNumbers) {
        this.daysNumbers = daysNumbers;
    }
}
