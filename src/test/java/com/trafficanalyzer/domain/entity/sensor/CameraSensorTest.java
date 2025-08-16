package com.trafficanalyzer.domain.entity.sensor;

import com.trafficanalyzer.domain.entity.trafficevent.CameraEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CameraSensorTest {

    private CameraSensor sensor;

    @BeforeEach
    void init() {
        sensor = new CameraSensor();
        sensor.setId(UUID.randomUUID());
        sensor.setResolution("resolution");
        sensor.setFrameRate(60.0);
        sensor.setLocation("location");
    }
    @Test
    void readData() {
        CameraEvent event = sensor.readData();
        assertThat(event).isNotNull();
        assertThat(event.getSensorId()).isEqualTo(sensor.getId());
        assertThat(event.getResolution()).isEqualTo(sensor.getResolution());
        assertThat(event.getFrameRate()).isEqualTo(sensor.getFrameRate());
        assertThat(event.getImageUrl()).isNull();
        assertThat(event.getTimestamp()).isBeforeOrEqualTo(LocalDateTime.now());
        assertThat(event.getIncidentDetected()).isIn(true,false);
        assertThat(event.getVehicleCount()).isBetween(0,50);
    }
}