package com.trafficanalyzer.domain.entity.sensor;

import com.trafficanalyzer.domain.entity.trafficevent.TrafficEvent;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Entity
@Data
@RequiredArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String location;

    public abstract TrafficEvent readData();
}
