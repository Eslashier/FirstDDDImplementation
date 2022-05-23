package com.sofkaU.demoDDD.flightplan.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Length implements ValueObject<Double> {

    private final Double value;


    public Length(Double value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("A lenght cannot be negative");
        }
    }

    public Double value() {
        return value;
    }
}
