package com.sofkaU.demoDDD.flightplan.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkaU.demoDDD.plane.values.ModelID;

public class WaypointId extends Identity {

    public WaypointId(){

    }
    private WaypointId(String uid){
        super(uid);
    }

    public static WaypointId of(String uid){
        return new WaypointId(uid);
    }
}
