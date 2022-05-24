package com.sofkaU.demoDDD.flightplan.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flightplan.Waypoint;
import com.sofkaU.demoDDD.flightplan.values.*;

public class AddWaypoint extends Command {

    private final FlightPlanId flightPlanId;
    private final WaypointId waypointId;
    private final Frequency frequency;
    private final GPSCoordinate gpsCoordinate;

    public AddWaypoint(FlightPlanId flightPlanId, WaypointId waypointId, Frequency frequency, GPSCoordinate gpsCoordinate) {
        this.flightPlanId = flightPlanId;
        this.waypointId = waypointId;
        this.frequency = frequency;
        this.gpsCoordinate = gpsCoordinate;
    }

    public FlightPlanId getFlightPlanId() {
        return flightPlanId;
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
