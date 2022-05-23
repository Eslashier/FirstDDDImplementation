package com.sofkaU.demoDDD.flight.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Languages implements ValueObject<String> {

    private final String value;

    public Languages(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String value(){
        return value;
    }

}
