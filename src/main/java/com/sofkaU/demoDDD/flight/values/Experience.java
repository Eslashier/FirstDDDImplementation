package com.sofkaU.demoDDD.flight.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Experience implements ValueObject<Integer> {

    private final Integer value;


    public Experience(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("Experience cannot be negative");
        }
    }

    public Integer value() {
        return value;
    }

}
