package com.sofkaU.demoDDD.flight.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkaU.demoDDD.plane.values.ModelID;

public class FlightAttendantId extends Identity {

    public FlightAttendantId(){

    }
    private FlightAttendantId(String uid){
        super(uid);
    }

    public static FlightAttendantId of(String uid){
        return new FlightAttendantId(uid);
    }
}

