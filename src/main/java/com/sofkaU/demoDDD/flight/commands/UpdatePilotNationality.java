package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.*;
import com.sofkaU.demoDDD.plane.values.FlightTime;

public class UpdatePilotNationality extends Command {
    private final FlightId flightId;
    private final PilotId pilotId;
    private final Languages languages;

    public UpdatePilotNationality(FlightId flightId, PilotId pilotId, Languages languages) {
        this.flightId = flightId;
        this.pilotId = pilotId;
        this.languages = languages;
    }

    public FlightId getFlightId() {
        return flightId;
    }

    public PilotId getPilotId() {
        return pilotId;
    }

    public Languages getLanguages() {
        return languages;
    }
}
