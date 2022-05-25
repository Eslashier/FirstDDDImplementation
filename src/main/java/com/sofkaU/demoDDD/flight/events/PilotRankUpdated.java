package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.*;
import com.sofkaU.demoDDD.plane.values.FlightTime;

public class PilotRankUpdated extends DomainEvent {

    private final PilotId pilotId;
    private final Rank rank;

    public PilotRankUpdated(PilotId pilotId, Rank rank){
        super("airways.flight.flightpilotrankupdateded");
        this.pilotId = pilotId;
        this.rank = rank;
    }

    public PilotId getPilotId() {
        return pilotId;
    }

    public Rank getRank() {
        return rank;
    }
}
