package com.sofkaU.demoDDD.flight.values;

import co.com.sofka.domain.generic.Identity;

public class PlaneId extends Identity {

    public PlaneId(){

    }
    private PlaneId(String uid){
        super(uid);
    }

    public static PlaneId of(String uid){
        return new PlaneId(uid);
    }
}
