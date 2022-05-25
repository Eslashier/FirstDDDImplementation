package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.Flight;
import com.sofkaU.demoDDD.flight.values.*;
import com.sofkaU.demoDDD.plane.values.FlightTime;

public class AddPilot extends Command {

    private final FlightId flightId;
    private final PilotId pilotId;

    private final Name name;
    private final FlightTime flightTime;
    private final Nationality nationality;
    private final Languages languages;
    private final Rank rank;

    public AddPilot(FlightId flightId, PilotId pilotId, Name name, FlightTime flightTime, Nationality nationality, Languages languages, Rank rank) {
        this.flightId = flightId;
        this.pilotId = pilotId;
        this.name = name;
        this.flightTime = flightTime;
        this.nationality = nationality;
        this.languages = languages;
        this.rank = rank;
    }

    public FlightId getFlightId() {
        return flightId;
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
