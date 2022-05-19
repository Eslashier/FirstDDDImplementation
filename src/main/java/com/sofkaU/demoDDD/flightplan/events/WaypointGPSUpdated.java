package com.sofkaU.demoDDD.flightplan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.Frequency;
import com.sofkaU.demoDDD.flightplan.values.GPSCoordinate;
import com.sofkaU.demoDDD.flightplan.values.WaypointId;

public class WaypointGPSUpdated extends DomainEvent{
    private final WaypointId waypointId;
    private final GPSCoordinate gpsCoordinate;


    public WaypointGPSUpdated(WaypointId waypointId,GPSCoordinate gpsCoordinate) {
        super("airways.flightplan.gpscoordinateupdated");
        this.waypointId = waypointId;
        this.gpsCoordinate = gpsCoordinate;
    }

    public WaypointId getWaypointId() {
        return waypointId;
    }


    public GPSCoordinate getGpsCoordinate() {
        return gpsCoordinate;
    }
}
