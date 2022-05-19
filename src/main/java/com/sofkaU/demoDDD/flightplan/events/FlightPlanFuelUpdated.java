package com.sofkaU.demoDDD.flightplan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.FuelLoad;

public class FlightPlanFuelUpdated extends DomainEvent {

    private final FuelLoad fuelLoad;


    public FlightPlanFuelUpdated(FuelLoad fuelLoad) {
        super("airways.flightplan.fuelloadupdated");
        this.fuelLoad = fuelLoad;
    }

    public FuelLoad getFuelLoad() {
        return fuelLoad;
    }
}
