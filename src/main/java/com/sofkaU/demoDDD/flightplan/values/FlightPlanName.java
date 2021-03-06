package com.sofkaU.demoDDD.flightplan.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FlightPlanName implements ValueObject<String> {

    private final String value;

    public FlightPlanName(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String value(){
        return value;
    }

}
