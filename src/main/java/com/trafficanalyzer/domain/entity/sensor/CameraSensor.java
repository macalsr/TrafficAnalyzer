package com.trafficanalyzer.domain.entity.sensor;


import com.trafficanalyzer.domain.entity.trafficevent.CameraEvent;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
@Entity
@ToString
public class CameraSensor extends Sensor {

    private String resolution;
    private Double frameRate;

    @Override
    public CameraEvent readData() {
        CameraEvent event = new CameraEvent();
        event.setSensorId(getId());
        event.setResolution(resolution);
        event.setFrameRate(frameRate);
        event.setImageUrl(null);
        event.setTimestamp(LocalDateTime.now());
        event.setIncidentDetected(ThreadLocalRandom.current().nextBoolean());
        event.setVehicleCount(ThreadLocalRandom.current().nextInt(0,50));
        return event;
    }
}
