package com.sofkaU.demoDDD.flightplan.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class GPSCoordinate implements ValueObject<String> {

    private final String value;

    public GPSCoordinate(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String value(){
        return value;
    }

}
