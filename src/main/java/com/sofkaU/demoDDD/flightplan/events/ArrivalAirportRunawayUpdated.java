package com.sofkaU.demoDDD.flightplan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.AirportId;
import com.sofkaU.demoDDD.flightplan.values.Runaway;

public class ArrivalAirportRunawayUpdated extends DomainEvent {

    private final AirportId airportId;
    private final Runaway runaway;

    public ArrivalAirportRunawayUpdated(AirportId airportId, Runaway runaway){
        super("airways.flightplan.arrivalairportrunawayupdated");
        this.airportId = airportId;
        this.runaway = runaway;
    }

    public AirportId getAirportId() {
        return airportId;
    }

    public Runaway getRunaway() {
        return runaway;
    }
}
