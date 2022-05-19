package com.sofkaU.demoDDD.flightplan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.CruiseAltitude;

public class FlightPlanCruiseAltitudeUpdated extends DomainEvent {


    private final CruiseAltitude cruiseAltitude;

    public FlightPlanCruiseAltitudeUpdated(CruiseAltitude cruiseAltitude) {
        super("airways.flightplan.cruisealtitudupdated");
        this.cruiseAltitude = cruiseAltitude;
    }

    public CruiseAltitude getCruiseAltitude() {
        return cruiseAltitude;
    }
}
