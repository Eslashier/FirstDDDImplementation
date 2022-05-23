package com.sofkaU.demoDDD.flightplan.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Runaway implements ValueObject<String> {

    private final String value;

    public Runaway(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String value(){
        return value;
    }

}
