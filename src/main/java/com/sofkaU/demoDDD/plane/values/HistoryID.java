package com.sofkaU.demoDDD.plane.values;

import co.com.sofka.domain.generic.Identity;

public class HistoryID extends Identity {

    public  HistoryID(){

    }
    private HistoryID(String uid){
        super(uid);
    }

    public static HistoryID of(String uid){
        return new HistoryID(uid);
    }
}
