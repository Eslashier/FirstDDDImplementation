package com.sofkaU.demoDDD.flight.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nationality implements ValueObject<String> {

    private final String value;

    public Nationality(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String value(){
        return value;
    }

}
