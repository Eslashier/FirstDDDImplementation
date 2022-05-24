package com.sofkaU.demoDDD.flightplan.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flightplan.values.AirportId;
import com.sofkaU.demoDDD.flightplan.values.FlightPlanId;
import com.sofkaU.demoDDD.flightplan.values.Runaway;

public class UpdateArrivalRunaway extends Command {
    private final FlightPlanId flightPlanId;
    private final AirportId airportId;
    private final Runaway runaway;

    public UpdateArrivalRunaway(FlightPlanId flightPlanId, AirportId airportId, Runaway runaway) {
        this.flightPlanId = flightPlanId;
        this.airportId = airportId;
        this.runaway = runaway;
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
}
