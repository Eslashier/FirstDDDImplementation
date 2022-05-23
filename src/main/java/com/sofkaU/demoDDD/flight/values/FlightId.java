package com.sofkaU.demoDDD.flight.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkaU.demoDDD.plane.values.ModelID;

public class FlightId extends Identity {

    public FlightId(){

    }
    private FlightId(String uid){
        super(uid);
    }

    public static FlightId of(String uid){
        return new FlightId(uid);
    }

}
