package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.*;
import com.sofkaU.demoDDD.plane.values.FlightTime;

public class PilotAdded extends DomainEvent {

    private final PilotId pilotId;
    private final Name name;
    private final FlightTime flightTime;
    private final Nationality nationality;
    private final Languages languages;
    private final Rank rank;

    public PilotAdded(PilotId pilotId, Name name, FlightTime flightTime, Nationality nationality, Languages languages,Rank rank){
        super("airways.flight.flightpilotadded");
        this.pilotId = pilotId;
        this.name = name;
        this.flightTime = flightTime;
        this.nationality = nationality;
        this.languages =languages;
        this.rank = rank;
    }

    public PilotId getPilotId() {
        return pilotId;
    }

    public Name getName() {
        return name;
    }

    public FlightTime getFlightTime() {
        return flightTime;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public Languages getLanguages() {
        return languages;
    }

    public Rank getRank() {
        return rank;
    }
}
