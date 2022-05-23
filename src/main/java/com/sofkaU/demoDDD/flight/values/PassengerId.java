package com.sofkaU.demoDDD.flight.values;

import co.com.sofka.domain.generic.Identity;

public class PassengerId extends Identity {

    public PassengerId(){

    }
    private PassengerId(String uid){
        super(uid);
    }

    public static PassengerId of(String uid){
        return new PassengerId(uid);
    }
}
