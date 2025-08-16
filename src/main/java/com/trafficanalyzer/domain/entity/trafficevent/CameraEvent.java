package com.trafficanalyzer.domain.entity.trafficevent;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class CameraEvent extends TrafficEvent {
    private String resolution;
    private String imageUrl;
    private Double frameRate;
    private Boolean incidentDetected;
    private Integer vehicleCount;
}
