package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.*;
import com.sofkaU.demoDDD.plane.values.FlightTime;

public class PilotNationalityUpdated extends DomainEvent {

    private final PilotId pilotId;
    private final Nationality nationality;

    public PilotNationalityUpdated(PilotId pilotId, Nationality nationality){
        super("airways.flight.flightpilotnationalityupdated");
        this.pilotId = pilotId;
        this.nationality = nationality;
    }

    public PilotId getPilotId() {
        return pilotId;
    }

    public Nationality getNationality() {
        return nationality;
    }
}
