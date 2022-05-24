package com.sofkaU.demoDDD.flightplan;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.demoDDD.flightplan.events.FlightPlanCreated;
import com.sofkaU.demoDDD.flightplan.values.Length;

import java.util.HashSet;

public class FlightPlanChange extends EventChange {

    public FlightPlanChange(FlightPlan flightPlan){
        apply((FlightPlanCreated event)->{
            flightPlan.length = event.getLength();
            flightPlan.flightPlanName = event.getFlightPlanName();
            flightPlan.cruiseAltitude = event.getCruiseAltitude();
            flightPlan.alternativeAirports = new HashSet<>();
            flightPlan.arrivalAirports = new HashSet<>();
            flightPlan.departureAirports = new HashSet<>();
            flightPlan.fuelLoad = event.getFuelLoad();
            flightPlan.waypoints = new HashSet<>();
        });
    }
}
