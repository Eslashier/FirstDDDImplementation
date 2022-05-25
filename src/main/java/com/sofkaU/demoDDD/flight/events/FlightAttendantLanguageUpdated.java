package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.*;

public class FlightAttendantLanguageUpdated extends DomainEvent {

    private final FlightAttendantId flightAttendantId;
    private final Languages languages;

    public FlightAttendantLanguageUpdated(FlightAttendantId flightAttendantId, Languages languages){
        super("airways.flight.flightattendantadded");
        this.flightAttendantId = flightAttendantId;
        this.languages =languages;
    }
}
