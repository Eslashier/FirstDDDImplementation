package com.sofkaU.demoDDD.flight.values;

import co.com.sofka.domain.generic.Identity;

public class PilotId extends Identity {

    public PilotId(){

    }
    private PilotId(String uid){
        super(uid);
    }

    public static PilotId of(String uid){
        return new PilotId(uid);
    }
}
