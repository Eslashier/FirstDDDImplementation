package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.*;
import com.sofkaU.demoDDD.plane.values.FlightTime;

public class PilotFlightTimeUpdated extends DomainEvent {

    private final PilotId pilotId;
    private final FlightTime flightTime;


    public PilotFlightTimeUpdated(PilotId pilotId, FlightTime flightTime){
        super("airways.flight.flightpilotflighttimeupdated");
        this.pilotId = pilotId;
        this.flightTime = flightTime;
    }

    public PilotId getPilotId() {
        return pilotId;
    }

    public FlightTime getFlightTime() {
        return flightTime;
    }
}
