package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.*;

public class UpdateFlightAttendantExperience extends Command {

    private final FlightId flightId;
    private final FlightAttendantId flightAttendantId;
    private final Experience experience;

    public UpdateFlightAttendantExperience(FlightId flightId, FlightAttendantId flightAttendantId, Experience experience) {
        this.flightId = flightId;
        this.flightAttendantId = flightAttendantId;
        this.experience = experience;
    }

    public FlightId getFlightId() {
        return flightId;
    }

    public FlightAttendantId getFlightAttendantId() {
        return flightAttendantId;
    }

    public Experience getExperience() {
        return experience;
    }
}
