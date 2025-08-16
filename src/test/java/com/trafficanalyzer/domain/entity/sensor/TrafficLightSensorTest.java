package com.trafficanalyzer.domain.entity.sensor;

import com.trafficanalyzer.domain.entity.trafficevent.TrafficLightEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TrafficLightSensorTest {

    private TrafficLightSensor sensor;

    @BeforeEach
    void setUp() {
        sensor = new TrafficLightSensor();
        sensor.setId(UUID.randomUUID());
        sensor.setLocation("location");
    }
    @Test
    void readData() {
        TrafficLightEvent event = sensor.readData();
        assertThat(event).isNotNull();
        assertThat(event.getSensorId()).isEqualTo(sensor.getId());
        assertThat(event.getState()).isIn(TrafficLightState.RED,TrafficLightState.YELLOW,TrafficLightState.GREEN);
        assertThat(event.getTimestamp()).isBeforeOrEqualTo(LocalDateTime.now());
    }
}