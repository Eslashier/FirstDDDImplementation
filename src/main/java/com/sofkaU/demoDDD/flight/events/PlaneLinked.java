package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.FlightPlanId;
import com.sofkaU.demoDDD.plane.values.PlaneID;

public class PlaneLinked extends DomainEvent {

    private final PlaneID planeID;

    public PlaneLinked(PlaneID planeID){
        super("challenge.model.planelinked");
        this.planeID = planeID;
    }

    public PlaneID getPlaneID() {
        return planeID;
    }
}
