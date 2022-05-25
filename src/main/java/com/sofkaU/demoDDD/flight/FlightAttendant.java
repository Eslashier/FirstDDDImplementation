package com.sofkaU.demoDDD.flight;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.flight.values.*;

import java.util.Set;

public class FlightAttendant extends Entity<FlightAttendantId> {

    private Name name;
    private Experience experience;
    private Nationality nationality;
    private Languages languages;

    public FlightAttendant(FlightAttendantId entityId, Name name, Experience experience, Nationality nationality, Languages languages) {
        super(entityId);
        this.name = name;
        this.experience = experience;
        this.nationality = nationality;
        this.languages = languages;
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
