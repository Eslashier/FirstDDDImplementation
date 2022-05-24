package com.sofkaU.demoDDD.plane.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.plane.values.*;

public class AddHistory extends Command {

    private final PlaneID planeID;
    private final HistoryID historyID;
    private final FlightTime flightTime;
    private final Cicles cicles;
    private final LastMaintenance lastMaintenance;

    public AddHistory(PlaneID planeID, HistoryID historyID, FlightTime flightTime, Cicles cicles, LastMaintenance lastMaintenance) {
        this.planeID = planeID;
        this.historyID = historyID;
        this.flightTime = flightTime;
        this.cicles = cicles;
        this.lastMaintenance = lastMaintenance;
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

    public Cicles getCicles() {
        return cicles;
    }

    public LastMaintenance getLastMaintenance() {
        return lastMaintenance;
    }
}
