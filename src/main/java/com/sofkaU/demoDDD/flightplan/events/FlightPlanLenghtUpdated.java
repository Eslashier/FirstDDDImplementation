package com.sofkaU.demoDDD.flightplan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.Length;

public class FlightPlanLenghtUpdated extends DomainEvent {

    private final Length length;

    public FlightPlanLenghtUpdated(Length lenght) {
        super("airways.flightplan.lenghtupdated");
        this.length = lenght;
    }

    public Length getLength() {
        return length;
    }
}
