package com.sofkaU.demoDDD.flight.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flight.values.Date;
import com.sofkaU.demoDDD.flight.values.FlightId;
import com.sofkaU.demoDDD.flight.values.PilotId;

public class ChangeDateOfFlight extends Command {

    private final FlightId flightId;
    private final Date date;

    public ChangeDateOfFlight(FlightId flightId, Date date) {
        this.flightId = flightId;
        this.date = date;
    }

    public FlightId getFlightId() {
        return flightId;
    }

    public Date getDate() {
        return date;
    }
}
