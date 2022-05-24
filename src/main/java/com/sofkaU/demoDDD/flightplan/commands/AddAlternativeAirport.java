package com.sofkaU.demoDDD.flightplan.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flightplan.FlightPlan;
import com.sofkaU.demoDDD.flightplan.values.AirTrafficFrequency;
import com.sofkaU.demoDDD.flightplan.values.AirportId;
import com.sofkaU.demoDDD.flightplan.values.FlightPlanId;
import com.sofkaU.demoDDD.flightplan.values.Runaway;

public class AddAlternativeAirport extends Command {

    private final FlightPlanId flightPlanId;
    private final AirportId airportId;
    private final Runaway runaway;
    private final AirTrafficFrequency airTrafficFrequency;

    public AddAlternativeAirport(FlightPlanId flightPlanId, AirportId airportId, Runaway runaway, AirTrafficFrequency airTrafficFrequency) {
        this.flightPlanId = flightPlanId;
        this.airportId = airportId;
        this.runaway = runaway;
        this.airTrafficFrequency = airTrafficFrequency;
    }

    public FlightPlanId getFlightPlanId() {
        return flightPlanId;
    }

    public AirportId getAirportId() {
        return airportId;
    }

    public Runaway getRunaway() {
        return runaway;
    }

    public AirTrafficFrequency getAirTrafficFrequency() {
        return airTrafficFrequency;
    }
}
