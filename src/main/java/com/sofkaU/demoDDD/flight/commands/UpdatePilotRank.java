package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.*;
import com.sofkaU.demoDDD.plane.values.FlightTime;

public class UpdatePilotRank extends Command {
    private final FlightId flightId;
    private final PilotId pilotId;
    private final Rank rank;

    public UpdatePilotRank(FlightId flightId, PilotId pilotId, Rank rank) {
        this.flightId = flightId;
        this.pilotId = pilotId;
        this.rank = rank;
    }

    public FlightId getFlightId() {
        return flightId;
    }

    public PilotId getPilotId() {
        return pilotId;
    }

    public Rank getRank() {
        return rank;
    }
}
