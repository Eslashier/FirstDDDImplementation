package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.*;

import java.rmi.server.ExportException;

public class FlightAttendantAdded extends DomainEvent {

    private final FlightAttendantId flightAttendantId;
    private final Name name;
    private final Experience experience;
    private final Nationality nationality;
    private final Languages languages;

    public FlightAttendantAdded(FlightAttendantId flightAttendantId, Name name, Experience experience, Nationality nationality, Languages languages){
        super("airways.flight.flightattendantadded");
        this.flightAttendantId = flightAttendantId;
        this.name = name;
        this.experience = experience;
        this.nationality = nationality;
        this.languages =languages;
    }

    public FlightAttendantId getFlightAttendantId() {
        return flightAttendantId;
    }

    public Name getName() {
        return name;
    }

    public Experience getExperience() {
        return experience;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public Languages getLanguages() {
        return languages;
    }
}
