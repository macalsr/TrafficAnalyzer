package com.trafficanalyzer.domain.entity.trafficevent;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SpeedEvent extends TrafficEvent {
    private double speed;
}
