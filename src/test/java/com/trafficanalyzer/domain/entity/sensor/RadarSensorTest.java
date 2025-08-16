package com.trafficanalyzer.domain.entity.sensor;

import com.trafficanalyzer.domain.entity.trafficevent.SpeedEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;
import static org.assertj.core.api.Assertions.assertThat;

class RadarSensorTest {
    private RadarSensor radarSensor;

    @BeforeEach
     void init() {
        radarSensor = new RadarSensor();
        radarSensor.setId(UUID.randomUUID());
        radarSensor.setLocation("route 66");
        radarSensor.setMaxSpeed(60);
    }

    @Test
    void readData() {
        SpeedEvent event = radarSensor.readData();
        assertThat(event).isNotNull();
        assertThat(event.getSensorId()).isEqualTo(radarSensor.getId());
        assertThat(event.getTimestamp()).isBeforeOrEqualTo(LocalDateTime.now());
        assertThat(event.getSpeed()).isBetween(0.0, radarSensor.getMaxSpeed().doubleValue());
    }
}