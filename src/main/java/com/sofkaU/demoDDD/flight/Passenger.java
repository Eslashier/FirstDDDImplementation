package com.sofkaU.demoDDD.flight;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.flight.values.Name;
import com.sofkaU.demoDDD.flight.values.Nationality;
import com.sofkaU.demoDDD.flight.values.PassengerId;

public class Passenger extends Entity<PassengerId> {
    private Name name;
    private Nationality nationality;

    public Passenger(PassengerId entityId, Name name, Nationality nationality) {
        super(entityId);
        this.name = name;
        this.nationality = nationality;
    }

    public Name getName() {
        return name;
    }

    public Nationality getNationality() {
        return nationality;
    }
}
