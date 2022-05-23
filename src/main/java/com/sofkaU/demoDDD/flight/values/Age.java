package com.sofkaU.demoDDD.flight.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Age implements ValueObject<Integer> {

    private final Integer value;


    public Age(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if(this.value>120){
            throw new IllegalArgumentException("A person cannot have that age");
        }
    }

    public Integer value() {
        return value;
    }

}
