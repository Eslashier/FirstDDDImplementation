package com.sofkaU.demoDDD.plane.values;

import co.com.sofka.domain.generic.Identity;

public class PlaneID extends Identity {

    public PlaneID(){

    }
    private PlaneID(String uid){
        super(uid);
    }

    public static PlaneID of(String uid){
        return new PlaneID(uid);
    }
}
