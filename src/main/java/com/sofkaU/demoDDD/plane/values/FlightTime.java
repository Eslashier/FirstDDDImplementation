package com.sofkaU.demoDDD.plane.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FlightTime implements ValueObject<Double> {

    private final Double value;


    public FlightTime(Double value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("Number of hours cannot be negative");
        }
    }

    public Double value() {
        return value;
    }

}
