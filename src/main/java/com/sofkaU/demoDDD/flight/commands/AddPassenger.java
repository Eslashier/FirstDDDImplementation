package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.*;

public class AddPassenger extends Command {

    private final FlightId flightId;
    private final PassengerId passengerId;
    private final Name name;
    private final Nationality nationality;

    public AddPassenger(FlightId flightId, PassengerId passengerId, Name name, Nationality nationality) {
        this.flightId = flightId;
        this.passengerId = passengerId;
        this.name = name;
        this.nationality = nationality;
    }

    public FlightId getFlightId() {
        return flightId;
    }

    public PassengerId getPassengerId() {
        return passengerId;
    }

    public Name getName() {
        return name;
    }

    public Nationality getNationality() {
        return nationality;
    }
}
