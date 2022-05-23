package com.sofkaU.demoDDD.plane.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Seats implements ValueObject<Integer> {

    private final Integer value;


    public Seats(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("Number of seats cannot be negative");
        }
    }

    public Integer value() {
        return value;
    }

}
