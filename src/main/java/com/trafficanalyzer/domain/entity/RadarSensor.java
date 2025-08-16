package com.trafficanalyzer.domain.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@Entity
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class RadarSensor extends Sensor {

    private Integer maxSpeed;

    @Override
    public String readData() {
        return "";
    }
}
