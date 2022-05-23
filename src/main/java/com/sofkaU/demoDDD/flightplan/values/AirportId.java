package com.sofkaU.demoDDD.flightplan.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkaU.demoDDD.plane.values.ModelID;

public class AirportId extends Identity {

    public AirportId(){

    }
    private AirportId(String uid){
        super(uid);
    }

    public static AirportId of(String uid){
        return new AirportId(uid);
    }
}