package com.trafficanalyzer.domain.entity.sensor;

import com.trafficanalyzer.domain.entity.trafficevent.TrafficLightEvent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

@Data
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TrafficLightSensor extends Sensor {

    @Override
    public TrafficLightEvent readData() {
        TrafficLightEvent event = new TrafficLightEvent();
        event.setSensorId(getId());
        event.setTimestamp(LocalDateTime.now());
        TrafficLightState state = randomState();
        event.setState(state);
        return event;
    }

    private TrafficLightState randomState() {
        TrafficLightState[] states = TrafficLightState.values();
        int index = ThreadLocalRandom.current().nextInt(states.length);
        return states[index];
    }
}
