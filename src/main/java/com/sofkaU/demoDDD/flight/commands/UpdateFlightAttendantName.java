package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.*;

public class UpdateFlightAttendantName extends Command {

    private final FlightId flightId;
    private final FlightAttendantId flightAttendantId;
    private final Name name;

    public UpdateFlightAttendantName(FlightId flightId, FlightAttendantId flightAttendantId, Name name) {
        this.flightId = flightId;
        this.flightAttendantId = flightAttendantId;
        this.name = name;
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
}
