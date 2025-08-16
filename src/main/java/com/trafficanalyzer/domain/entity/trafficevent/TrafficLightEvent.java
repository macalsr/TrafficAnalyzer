package com.trafficanalyzer.domain.entity.trafficevent;

import com.trafficanalyzer.domain.entity.sensor.TrafficLightState;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class TrafficLightEvent extends TrafficEvent{
    private TrafficLightState state;
}
