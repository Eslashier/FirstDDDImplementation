package com.sofkaU.demoDDD.flight.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flight.values.Name;
import com.sofkaU.demoDDD.flight.values.Nationality;
import com.sofkaU.demoDDD.flight.values.PassengerId;

public class PassengerNationalityUpdated extends DomainEvent {
    private final PassengerId passengerId;
    private final Nationality nationality;

    public PassengerNationalityUpdated(PassengerId passengerId, Nationality nationality){
        super("airways.flight.flightpassengernationalityupdated");
        this.passengerId = passengerId;
        this.nationality = nationality;
    }
    public PassengerId getPassengerId() {
        return passengerId;
    }

    public Nationality getNationality() {
        return nationality;
    }
}
