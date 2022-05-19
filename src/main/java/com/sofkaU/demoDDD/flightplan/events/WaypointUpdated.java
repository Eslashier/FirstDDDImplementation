package com.sofkaU.demoDDD.flightplan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.Frequency;
import com.sofkaU.demoDDD.flightplan.values.GPSCoordinate;
import com.sofkaU.demoDDD.flightplan.values.WaypointId;

public class WaypointUpdated extends DomainEvent {

    private final WaypointId waypointId;
    private final Frequency frequency;
    private final GPSCoordinate gpsCoordinate;


    public WaypointUpdated(WaypointId waypointId, Frequency frequency, GPSCoordinate gpsCoordinate) {
        super("airways.flightplan.waypointupdated");
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
