package com.sofkaU.demoDDD.plane.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.plane.values.*;

public class UpdateHistoryFlightTime extends Command {
    private final PlaneID planeID;
    private final HistoryID historyID;
    private final FlightTime flightTime;

    public UpdateHistoryFlightTime(PlaneID planeID, HistoryID historyID, FlightTime flightTime) {
        this.planeID = planeID;
        this.historyID = historyID;
        this.flightTime = flightTime;
    }

    public PlaneID getPlaneID() {
        return planeID;
    }

    public HistoryID getHistoryID() {
        return historyID;
    }

    public FlightTime getFlightTime() {
        return flightTime;
    }
}
