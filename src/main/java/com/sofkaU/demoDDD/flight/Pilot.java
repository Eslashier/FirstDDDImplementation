package com.sofkaU.demoDDD.flight;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.flight.values.*;
import com.sofkaU.demoDDD.plane.values.FlightTime;

public class Pilot extends Entity<PilotId> {
    private Name name;
    private FlightTime flightTime;
    private Nationality nationality;
    private Languages languages;
    private Rank rank;

    public Pilot(PilotId entityId, Name name, FlightTime flightTime, Nationality nationality, Languages languages, Rank rank) {
        super(entityId);
        this.name = name;
        this.flightTime = flightTime;
        this.nationality = nationality;
        this.languages = languages;
        this.rank = rank;
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
