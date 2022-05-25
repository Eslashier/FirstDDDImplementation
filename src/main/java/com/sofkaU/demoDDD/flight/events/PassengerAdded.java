package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.*;

public class PassengerAdded extends DomainEvent {

    private final PassengerId passengerId;
    private final Name name;
    private final Nationality nationality;

    public PassengerAdded(PassengerId passengerId, Name name, Nationality nationality){
        super("airways.flight.flightpassengeradded");
        this.passengerId = passengerId;
        this.name = name;
        this.nationality = nationality;
    }
    public PassengerId getPassengerId() {
        return passengerId;
    }

    public Name getName() {
        return name;
    }

    public Nationality getNationality() {
        return nationality;
    }
}
