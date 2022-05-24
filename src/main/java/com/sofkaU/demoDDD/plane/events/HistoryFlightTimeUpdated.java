package com.sofkaU.demoDDD.plane.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.plane.values.FlightTime;
import com.sofkaU.demoDDD.plane.values.HistoryID;

public class HistoryFlightTimeUpdated extends DomainEvent {
    private final HistoryID historyID;
    private final FlightTime flightTime;


    public HistoryFlightTimeUpdated(HistoryID historyID, FlightTime flightTime){
        super("airways.plane.historyflighttimeupdated");
        this.historyID = historyID;
        this.flightTime = flightTime;
    }

    public HistoryID getHistoryID() {
        return historyID;
    }

    public FlightTime getFlightTime() {
        return flightTime;
    }
}
