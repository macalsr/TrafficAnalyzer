package com.trafficanalyzer.domain.entity.trafficevent;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public abstract class TrafficEvent {
    private UUID sensorId;
    private LocalDateTime timestamp;
}
