package com.sofkaU.demoDDD.flightplan.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.flightplan.FlightPlan;
import com.sofkaU.demoDDD.flightplan.values.FlightPlanId;
import com.sofkaU.demoDDD.flightplan.values.Length;

public class UpdateFlightPlanLenght extends Command {
    private final FlightPlanId flightPlanId;
    private final Length length;

    public UpdateFlightPlanLenght(FlightPlanId flightPlanId, Length length) {
        this.flightPlanId = flightPlanId;
        this.length = length;
    }

    public FlightPlanId getFlightPlanId() {
        return flightPlanId;
    }

    public Length getLength() {
        return length;
    }
}
