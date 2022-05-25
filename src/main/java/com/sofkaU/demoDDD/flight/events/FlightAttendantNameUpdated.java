package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.*;

public class FlightAttendantNameUpdated extends DomainEvent {

    private final FlightAttendantId flightAttendantId;
    private final Name name;

    public FlightAttendantNameUpdated(FlightAttendantId flightAttendantId, Name name){
        super("airways.flight.flightattendantnameupdated");
        this.flightAttendantId = flightAttendantId;
        this.name = name;
    }

    public FlightAttendantId getFlightAttendantId() {
        return flightAttendantId;
    }

    public Name getName() {
        return name;
    }
}
