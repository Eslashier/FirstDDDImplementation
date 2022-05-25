package com.sofkaU.demoDDD.flight;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.flight.values.Date;
import com.sofkaU.demoDDD.flight.values.FlightId;

import java.util.List;

public class Flight extends Entity<FlightId> {

    public Date date;

    public Flight(FlightId entityId, Date date) {
        super(entityId);
        this.date = date;
    }

    private Flight(FlightId entityId){
        super(entityId);
        subscribe(new FlightChange(this));
    }

    public static Flight from(FlightId flightId, List<DomainEvent> events){
        var flight = new Flight(flightId);
        events.forEach(flight::applyEvent);
        return flight;
    }

    public Date date() {
        return date;
    }
}
