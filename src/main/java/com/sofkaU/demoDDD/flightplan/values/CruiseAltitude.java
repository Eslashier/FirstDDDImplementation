package com.sofkaU.demoDDD.flightplan.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CruiseAltitude implements ValueObject<Integer> {

    private final Integer value;


    public CruiseAltitude(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("A cruise alttitude cannot be negative");
        }
    }

    public Integer value() {
        return value;
    }

}
