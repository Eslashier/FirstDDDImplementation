package com.sofkaU.demoDDD.flightplan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.Lenght;

public class FlightPlanLenghtUpdated extends DomainEvent {

    private final Lenght lenght;

    public FlightPlanLenghtUpdated(Lenght lenght) {
        super("airways.flightplan.lenghtupdated");
        this.lenght = lenght;
    }

    public Lenght getLenght() {
        return lenght;
    }
}
