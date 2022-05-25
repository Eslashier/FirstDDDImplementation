package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.*;
import com.sofkaU.demoDDD.plane.values.FlightTime;

public class UpdatePilotName extends Command {
    private final FlightId flightId;
    private final PilotId pilotId;
    private final Name name;

    public UpdatePilotName(FlightId flightId, PilotId pilotId, Name name) {
        this.flightId = flightId;
        this.pilotId = pilotId;
        this.name = name;
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
}
