package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.FlightId;
import com.sofkaU.demoDDD.flight.values.Name;
import com.sofkaU.demoDDD.flight.values.Nationality;
import com.sofkaU.demoDDD.flight.values.PassengerId;

public class UpdatePassengerName extends Command {
    private final FlightId flightId;
    private final PassengerId passengerId;
    private final Name name;

    public UpdatePassengerName(FlightId flightId, PassengerId passengerId, Name name) {
        this.flightId = flightId;
        this.passengerId = passengerId;
        this.name = name;
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
}
