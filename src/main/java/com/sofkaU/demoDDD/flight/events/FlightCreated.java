package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.Date;

import java.util.Set;

public class FlightCreated extends DomainEvent {

    public final Date date;

    public FlightCreated(Date date){
        super("airways.flight.flightcreated");
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
