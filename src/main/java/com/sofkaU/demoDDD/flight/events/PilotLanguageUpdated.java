package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.*;
import com.sofkaU.demoDDD.plane.values.FlightTime;

public class PilotLanguageUpdated extends DomainEvent {

    private final PilotId pilotId;
    private final Languages languages;


    public PilotLanguageUpdated(PilotId pilotId, Languages languages){
        super("airways.flight.flightpilotlanguageupdated");
        this.pilotId = pilotId;
        this.languages =languages;
    }

    public PilotId getPilotId() {
        return pilotId;
    }

    public Languages getLanguages() {
        return languages;
    }
}
