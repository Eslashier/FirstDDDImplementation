package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.*;
import com.sofkaU.demoDDD.plane.values.FlightTime;

public class PilotNameUpdated extends DomainEvent {

    private final PilotId pilotId;
    private final Name name;

    public PilotNameUpdated(PilotId pilotId, Name name){
        super("airways.flight.flightpilotnameupdateded");
        this.pilotId = pilotId;
        this.name = name;
    }

    public PilotId getPilotId() {
        return pilotId;
    }

    public Name getName() {
        return name;
    }
}
