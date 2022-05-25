package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.*;

public class FlightAttendantExperienceUpdated extends DomainEvent {
    private final FlightAttendantId flightAttendantId;
    private final Experience experience;


    public FlightAttendantExperienceUpdated(FlightAttendantId flightAttendantId, Experience experience){
        super("airways.flight.flightattendantexperienceupdated");
        this.flightAttendantId = flightAttendantId;
        this.experience = experience;
    }

    public FlightAttendantId getFlightAttendantId() {
        return flightAttendantId;
    }

    public Experience getExperience() {
        return experience;
    }
}
