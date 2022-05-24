package com.sofkaU.demoDDD.flightplan.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flightplan.values.CruiseAltitude;
import com.sofkaU.demoDDD.flightplan.values.FlightPlanId;

public class UpdateFlightPlanCruiseAltitude extends Command {
    private final FlightPlanId flightPlanId;
    private final CruiseAltitude cruiseAltitude;

    public UpdateFlightPlanCruiseAltitude(FlightPlanId flightPlanId, CruiseAltitude cruiseAltitude) {
        this.flightPlanId = flightPlanId;
        this.cruiseAltitude = cruiseAltitude;
    }

    public FlightPlanId getFlightPlanId() {
        return flightPlanId;
    }

    public CruiseAltitude getCruiseAltitude() {
        return cruiseAltitude;
    }
}
