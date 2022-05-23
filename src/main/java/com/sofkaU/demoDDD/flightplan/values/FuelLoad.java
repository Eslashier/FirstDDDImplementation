package com.sofkaU.demoDDD.flightplan.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FuelLoad implements ValueObject<Integer> {

    private final Integer value;


    public FuelLoad(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("The fuel load cannot be negative");
        }
    }

    public Integer value() {
        return value;
    }

}