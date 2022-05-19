package com.sofkaU.demoDDD.flightplan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.FlightPlanName;

public class FlightPlanNameUpdated extends DomainEvent {

    private final FlightPlanName flightPlanName;


    public FlightPlanNameUpdated(FlightPlanName flightPlanName) {
        super("airways.flightplan.flighplantnameupdated");
        this.flightPlanName = flightPlanName;
    }

    public FlightPlanName getFlightPlanName() {
        return flightPlanName;
    }
}
