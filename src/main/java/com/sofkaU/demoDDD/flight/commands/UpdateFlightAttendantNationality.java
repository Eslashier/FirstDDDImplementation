package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.*;

public class UpdateFlightAttendantNationality extends Command {

    private final FlightId flightId;
    private final FlightAttendantId flightAttendantId;
    private final Nationality nationality;

    public UpdateFlightAttendantNationality(FlightId flightId, FlightAttendantId flightAttendantId, Nationality nationality) {
        this.flightId = flightId;
        this.flightAttendantId = flightAttendantId;
        this.nationality = nationality;
    }

    public FlightId getFlightId() {
        return flightId;
    }

    public FlightAttendantId getFlightAttendantId() {
        return flightAttendantId;
    }

    public Nationality getNationality() {
        return nationality;
    }
}
