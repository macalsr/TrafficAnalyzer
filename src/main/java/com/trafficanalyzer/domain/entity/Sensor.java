package com.trafficanalyzer.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public abstract class Sensor {

    @Id
    private Long id;
    private String location;

    public abstract String readData();
}
