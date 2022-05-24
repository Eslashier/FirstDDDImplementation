package com.sofkaU.demoDDD.plane.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.plane.values.Cicles;
import com.sofkaU.demoDDD.plane.values.FlightTime;
import com.sofkaU.demoDDD.plane.values.HistoryID;
import com.sofkaU.demoDDD.plane.values.LastMaintenance;

public class HistoryAdded extends DomainEvent {

    private final HistoryID historyID;
    private final FlightTime flightTime;
    private final Cicles cicles;
    private final LastMaintenance lastMaintenance;

    public HistoryAdded(HistoryID historyID, FlightTime flightTime, Cicles cicles, LastMaintenance lastMaintenance){
        super("airways.plane.historyadded");
        this.historyID = historyID;
        this.flightTime = flightTime;
        this. cicles = cicles;
        this.lastMaintenance = lastMaintenance;
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
