package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.Name;
import com.sofkaU.demoDDD.flight.values.Nationality;
import com.sofkaU.demoDDD.flight.values.PassengerId;

public class PassengerNameUpdated extends DomainEvent {

    private final PassengerId passengerId;
    private final Name name;

    public PassengerNameUpdated(PassengerId passengerId, Name name){
        super("airways.flight.flightpassengernameupdated");
        this.passengerId = passengerId;
        this.name = name;
    }
    public PassengerId getPassengerId() {
        return passengerId;
    }

    public Name getName() {
        return name;
    }

}
