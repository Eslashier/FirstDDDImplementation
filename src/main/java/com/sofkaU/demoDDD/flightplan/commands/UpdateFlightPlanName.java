package com.sofkaU.demoDDD.flightplan.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flightplan.values.FlightPlanId;
import com.sofkaU.demoDDD.flightplan.values.FlightPlanName;

public class UpdateFlightPlanName extends Command {
    private final FlightPlanId flightPlanId;
    private final FlightPlanName flightPlanName;

    public UpdateFlightPlanName(FlightPlanId flightPlanId, FlightPlanName flightPlanName) {
        this.flightPlanId = flightPlanId;
        this.flightPlanName = flightPlanName;
    }

    public FlightPlanId getFlightPlanId() {
        return flightPlanId;
    }

    public FlightPlanName getFlightPlanName() {
        return flightPlanName;
    }
}
