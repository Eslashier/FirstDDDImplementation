package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.Date;

public class DateOfFlightUpdated extends DomainEvent {


    public final Date date;

    public DateOfFlightUpdated(Date date){
        super("airways.flight.dateofflightupdated");
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
