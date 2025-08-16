package com.trafficanalyzer.domain.entity;


import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
@Entity
@ToString
public class CameraSensor extends Sensor {

    private String resolution;
    private Double frameRate;

    @Override
    public String readData() {
        return "";
    }
}
