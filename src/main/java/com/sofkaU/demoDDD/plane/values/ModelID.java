package com.sofkaU.demoDDD.plane.values;

import co.com.sofka.domain.generic.Identity;

public class ModelID extends Identity {

    public ModelID(){

    }
    private ModelID(String uid){
        super(uid);
    }

    public static ModelID of(String uid){
        return new ModelID(uid);
    }
}
