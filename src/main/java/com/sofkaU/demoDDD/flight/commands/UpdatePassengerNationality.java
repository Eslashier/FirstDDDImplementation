package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.FlightId;
import com.sofkaU.demoDDD.flight.values.Name;
import com.sofkaU.demoDDD.flight.values.Nationality;
import com.sofkaU.demoDDD.flight.values.PassengerId;

public class UpdatePassengerNationality extends Command {
    private final FlightId flightId;
    private final PassengerId passengerId;
    private final Nationality nationality;

    public UpdatePassengerNationality(FlightId flightId, PassengerId passengerId, Nationality nationality) {
        this.flightId = flightId;
        this.passengerId = passengerId;
        this.nationality = nationality;
    }

    public FlightId getFlightId() {
        return flightId;
    }

    public PassengerId getPassengerId() {
        return passengerId;
    }

    public Nationality getNationality() {
        return nationality;
    }
}
