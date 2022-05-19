package com.sofkaU.demoDDD.flightplan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.*;

public class WaypointAdded extends DomainEvent {

    private final WaypointId waypointId;
    private final Frequency frequency;
    private final GPSCoordinate gpsCoordinate;


    public WaypointAdded(WaypointId waypointId, Frequency frequency, GPSCoordinate gpsCoordinate) {
        super("airways.flightplan.waypointadded");
        this.waypointId = waypointId;
        this.frequency = frequency;
        this.gpsCoordinate = gpsCoordinate;
    }

    public WaypointId getWaypointId() {
        return waypointId;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public GPSCoordinate getGpsCoordinate() {
        return gpsCoordinate;
    }
}
