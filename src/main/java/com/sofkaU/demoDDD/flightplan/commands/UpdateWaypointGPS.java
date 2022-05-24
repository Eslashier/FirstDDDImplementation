package com.sofkaU.demoDDD.flightplan.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flightplan.values.FlightPlanId;
import com.sofkaU.demoDDD.flightplan.values.Frequency;
import com.sofkaU.demoDDD.flightplan.values.GPSCoordinate;
import com.sofkaU.demoDDD.flightplan.values.WaypointId;

public class UpdateWaypointGPS extends Command {
    private final FlightPlanId flightPlanId;
    private final WaypointId waypointId;
    private final GPSCoordinate gpsCoordinate;

    public UpdateWaypointGPS(FlightPlanId flightPlanId, WaypointId waypointId, GPSCoordinate gpsCoordinate) {
        this.flightPlanId = flightPlanId;
        this.waypointId = waypointId;
        this.gpsCoordinate = gpsCoordinate;
    }

    public FlightPlanId getFlightPlanId() {
        return flightPlanId;
    }

    public WaypointId getWaypointId() {
        return waypointId;
    }

    public GPSCoordinate getGpsCoordinate() {
        return gpsCoordinate;
    }
}
