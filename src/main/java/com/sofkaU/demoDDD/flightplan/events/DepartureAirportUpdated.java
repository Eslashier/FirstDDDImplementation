package com.sofkaU.demoDDD.flightplan.events;


import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.AirTrafficFrequency;
import com.sofkaU.demoDDD.flightplan.values.AirportId;
import com.sofkaU.demoDDD.flightplan.values.Runaway;

public class DepartureAirportUpdated extends DomainEvent {
    private final AirportId airportId;
    private final Runaway runaway;
    private final AirTrafficFrequency airTrafficFrequency;

    public DepartureAirportUpdated(AirportId airportId, Runaway runaway, AirTrafficFrequency airTrafficFrequency) {
        super("airways.flightplan.departureairportupdated");
        this.airportId = airportId;
        this.runaway = runaway;
        this.airTrafficFrequency = airTrafficFrequency;
    }

    public AirportId getAirportId() {
        return airportId;
    }

    public Runaway getRunaway() {
        return runaway;
    }

    public AirTrafficFrequency getAirTrafficFrequency() {
        return airTrafficFrequency;
    }

}
