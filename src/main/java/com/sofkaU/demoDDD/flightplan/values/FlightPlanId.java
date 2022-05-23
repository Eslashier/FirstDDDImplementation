package com.sofkaU.demoDDD.flightplan.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkaU.demoDDD.plane.values.ModelID;

public class FlightPlanId extends Identity {

    public FlightPlanId(){

    }
    private FlightPlanId(String uid){
        super(uid);
    }

    public static FlightPlanId of(String uid){
        return new FlightPlanId(uid);
    }
}