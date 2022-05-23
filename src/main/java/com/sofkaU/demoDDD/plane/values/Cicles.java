package com.sofkaU.demoDDD.plane.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cicles implements ValueObject<Integer> {

    private final Integer value;


    public Cicles(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<0){
            throw new IllegalArgumentException("Number of ciclos cannot be negative");
        }
    }

    public Integer value() {
        return value;
    }

}
