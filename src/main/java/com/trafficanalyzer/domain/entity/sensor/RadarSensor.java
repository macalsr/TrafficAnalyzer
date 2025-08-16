package com.trafficanalyzer.domain.entity.sensor;

import com.trafficanalyzer.domain.entity.trafficevent.SpeedEvent;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

@Data
@Entity
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RadarSensor extends Sensor {

    private Integer maxSpeed;

    @Override
    public SpeedEvent readData() {
        SpeedEvent speedEvent = new SpeedEvent();
        speedEvent.setSensorId(getId());
        speedEvent.setTimestamp(LocalDateTime.now());
        double simulatedSpeed = ThreadLocalRandom.current().nextDouble(0, maxSpeed != null ? maxSpeed : 120);
        speedEvent.setSpeed(simulatedSpeed);
        return speedEvent;
    }
}
