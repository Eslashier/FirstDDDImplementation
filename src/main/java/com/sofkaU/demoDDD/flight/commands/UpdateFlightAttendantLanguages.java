package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.*;

public class UpdateFlightAttendantLanguages extends Command {

    private final FlightId flightId;
    private final FlightAttendantId flightAttendantId;
    private final Languages languages;

    public UpdateFlightAttendantLanguages(FlightId flightId, FlightAttendantId flightAttendantId, Languages languages) {
        this.flightId = flightId;
        this.flightAttendantId = flightAttendantId;
        this.languages = languages;
    }

    public FlightId getFlightId() {
        return flightId;
    }

    public FlightAttendantId getFlightAttendantId() {
        return flightAttendantId;
    }

    public Languages getLanguages() {
        return languages;
    }
}
