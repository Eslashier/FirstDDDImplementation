package com.sofkaU.demoDDD.flightplan;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.demoDDD.flightplan.values.AirTrafficFrequency;
import com.sofkaU.demoDDD.flightplan.values.AirportId;
import com.sofkaU.demoDDD.flightplan.values.Runaway;

import java.util.Objects;

public class DepartureAirport extends AggregateEvent<AirportId> {

    protected Runaway runaway;
    protected AirTrafficFrequency airTrafficFrequency;

    public DepartureAirport(AirportId entityId, Runaway runaway, AirTrafficFrequency airTrafficFrequency) {
        super(entityId);
        this.runaway = runaway;
        this.airTrafficFrequency = airTrafficFrequency;
    }

    public void updateAlternativeRunaway(Runaway runaway){
        this.runaway = Objects.requireNonNull(runaway);
    }

    public void updateAlternativeAirTrafficFrequency(AirTrafficFrequency airTrafficFrequency){
        this.airTrafficFrequency = Objects.requireNonNull(airTrafficFrequency);
    }

    public Runaway runaway() {
        return runaway;
    }

    public AirTrafficFrequency airTrafficFrequency() {
        return airTrafficFrequency;
    }
}
