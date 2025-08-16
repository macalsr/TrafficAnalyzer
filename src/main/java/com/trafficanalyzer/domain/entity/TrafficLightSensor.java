package com.trafficanalyzer.domain.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class TrafficLightSensor extends Sensor {

    private TrafficLightState state;

    @Override
    public String readData() {
        return "";
    }
}
