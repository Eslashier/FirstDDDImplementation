package com.sofkaU.demoDDD.plane.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PlaneName implements ValueObject<String> {

    private final String value;

    public PlaneName(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String value(){
        return value;
    }

}
