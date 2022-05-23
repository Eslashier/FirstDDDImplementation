package com.sofkaU.demoDDD.flight.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Rank implements ValueObject<String> {

    private final String value;

    public Rank(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String value(){
        return value;
    }

}
