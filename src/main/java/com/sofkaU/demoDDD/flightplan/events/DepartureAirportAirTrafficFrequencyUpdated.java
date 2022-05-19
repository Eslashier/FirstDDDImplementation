package com.sofkaU.demoDDD.flightplan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.AirTrafficFrequency;
import com.sofkaU.demoDDD.flightplan.values.AirportId;

public class DepartureAirportAirTrafficFrequencyUpdated extends DomainEvent {
    private final AirportId airportId;
    private final AirTrafficFrequency airTrafficFrequency;

    public DepartureAirportAirTrafficFrequencyUpdated(AirportId airportId, AirTrafficFrequency airTrafficFrequency){
        super("airways.flightplan.departureirportairtrafficfrequencyupdated");
        this.airportId = airportId;
        this.airTrafficFrequency = airTrafficFrequency;
    }
    public AirportId getAirportId() {
        return airportId;
    }

    public AirTrafficFrequency getAirTrafficFrequency() {
        return airTrafficFrequency;
    }
}
