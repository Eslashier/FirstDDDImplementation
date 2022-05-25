package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.Flight;
import com.sofkaU.demoDDD.flightplan.values.FlightPlanId;
import com.sofkaU.demoDDD.plane.values.PlaneID;

public class FlightPlanLinked extends DomainEvent {

    private final FlightPlanId flightPlanId;

    public FlightPlanLinked(FlightPlanId flightPlanId){
        super("challenge.model.geometrylinked");
        this.flightPlanId = flightPlanId;
    }

    public FlightPlanId getFlightPlanId() {
        return flightPlanId;
    }
}
