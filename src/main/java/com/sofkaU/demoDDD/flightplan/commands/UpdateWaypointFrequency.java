package com.sofkaU.demoDDD.flightplan.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flightplan.values.FlightPlanId;
import com.sofkaU.demoDDD.flightplan.values.Frequency;
import com.sofkaU.demoDDD.flightplan.values.GPSCoordinate;
import com.sofkaU.demoDDD.flightplan.values.WaypointId;

public class UpdateWaypointFrequency extends Command {
    private final FlightPlanId flightPlanId;
    private final WaypointId waypointId;
    private final Frequency frequency;

    public UpdateWaypointFrequency(FlightPlanId flightPlanId, WaypointId waypointId, Frequency frequency) {
        this.flightPlanId = flightPlanId;
        this.waypointId = waypointId;
        this.frequency = frequency;
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
}
