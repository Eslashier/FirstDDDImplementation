package com.sofkaU.demoDDD.plane;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.demoDDD.plane.events.PlaneCreated;

import java.util.HashSet;

public class PlaneChange extends EventChange {

    public PlaneChange(Plane plane){
        apply((PlaneCreated event)->{
            plane.planeName = event.getPlaneName();
            plane.histories = new HashSet<>();
            plane.models = new HashSet<>();
        });
    }

}
