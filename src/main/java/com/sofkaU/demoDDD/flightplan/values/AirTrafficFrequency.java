package com.sofkaU.demoDDD.flightplan.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AirTrafficFrequency implements ValueObject<Double> {

    private final Double value;


    public AirTrafficFrequency(Double value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("A frequency cannot be negative");
        }
    }

    public Double value() {
        return value;
    }

}
