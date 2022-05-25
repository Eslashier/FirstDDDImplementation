package com.sofkaU.demoDDD.flight;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.demoDDD.flight.events.FlightCreated;

public class FlightChange extends EventChange {
    public  FlightChange(Flight flight){
        apply((FlightCreated event)->{
            flight.date = event.getDate();
        });
    }
}
