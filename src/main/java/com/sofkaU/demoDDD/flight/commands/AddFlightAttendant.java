package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.*;

public class AddFlightAttendant extends Command {

        private final FlightId flightId;
        private final FlightAttendantId flightAttendantId;
        private final Name name;
        private final Experience experience;
        private final Nationality nationality;
        private final Languages languages;

    public AddFlightAttendant(FlightId flightId, FlightAttendantId flightAttendantId, Name name, Experience experience, Nationality nationality, Languages languages) {
        this.flightId = flightId;
        this.flightAttendantId = flightAttendantId;
        this.name = name;
        this.experience = experience;
        this.nationality = nationality;
        this.languages = languages;
    }

    public FlightId getFlightId() {
        return flightId;
    }

    public FlightAttendantId getFlightAttendantId() {
        return flightAttendantId;
    }

    public Name getName() {
        return name;
    }

    public Experience getExperience() {
        return experience;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public Languages getLanguages() {
        return languages;
    }
}
