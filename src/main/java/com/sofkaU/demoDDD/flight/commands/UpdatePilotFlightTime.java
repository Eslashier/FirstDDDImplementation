package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.*;
import com.sofkaU.demoDDD.plane.values.FlightTime;

public class UpdatePilotFlightTime extends Command {
    private final FlightId flightId;
    private final PilotId pilotId;
    private final FlightTime flightTime;

    public UpdatePilotFlightTime(FlightId flightId, PilotId pilotId, FlightTime flightTime) {
        this.flightId = flightId;
        this.pilotId = pilotId;
        this.flightTime = flightTime;
    }

    public FlightId getFlightId() {
        return flightId;
    }

    public PilotId getPilotId() {
        return pilotId;
    }

    public FlightTime getFlightTime() {
        return flightTime;
    }
}
