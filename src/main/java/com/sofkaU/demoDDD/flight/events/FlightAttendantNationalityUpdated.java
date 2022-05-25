package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.*;

public class FlightAttendantNationalityUpdated extends DomainEvent {
    private final FlightAttendantId flightAttendantId;
    private final Nationality nationality;


    public FlightAttendantNationalityUpdated(FlightAttendantId flightAttendantId, Nationality nationality){
        super("airways.flight.flightattendantnameupdated");
        this.flightAttendantId = flightAttendantId;
        this.nationality = nationality;
    }

    public FlightAttendantId getFlightAttendantId() {
        return flightAttendantId;
    }

    public Nationality getNationality() {
        return nationality;
    }
}
