package com.sofkaU.demoDDD.flightplan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.ArrivalAirport;
import com.sofkaU.demoDDD.flightplan.DepartureAirport;

import com.sofkaU.demoDDD.flightplan.values.*;

public class FlightPlanCreated extends DomainEvent {
    private final DepartureAirport departureAirport;
    private final ArrivalAirport arrivalAirport;
    private final FlightPlanName flightPlanName;
    private final CruiseAltitude cruiseAltitude;
    private final FuelLoad fuelLoad;
    private final Length length;

    public FlightPlanCreated(DepartureAirport departureAirport, ArrivalAirport arrivalAirport, FlightPlanName flightPlanName,
                             CruiseAltitude cruiseAltitude, FuelLoad fuelLoad, Length length) {
        super("airways.flightplan.flightplancreated");
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightPlanName = flightPlanName;
        this.cruiseAltitude = cruiseAltitude;
        this.fuelLoad = fuelLoad;
        this.length = length;
    }

    public DepartureAirport getDepartureAirport() {
        return departureAirport;
    }

    public ArrivalAirport getArrivalAirport() {
        return arrivalAirport;
    }

    public FlightPlanName getFlightPlanName() {
        return flightPlanName;
    }

    public CruiseAltitude getCruiseAltitude() {
        return cruiseAltitude;
    }

    public FuelLoad getFuelLoad() {
        return fuelLoad;
    }

    public Length getLength() {
        return length;
    }
}
