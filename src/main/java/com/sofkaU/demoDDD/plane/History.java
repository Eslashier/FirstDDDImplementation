package com.sofkaU.demoDDD.plane;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.plane.values.Cicles;
import com.sofkaU.demoDDD.plane.values.FlightTime;
import com.sofkaU.demoDDD.plane.values.HistoryID;
import com.sofkaU.demoDDD.plane.values.LastMaintenance;

public class History extends Entity<HistoryID> {
    private FlightTime flightTime;
    private Cicles cicles;
    private LastMaintenance lastMaintenance;

    public History(HistoryID entityId, FlightTime flightTime, Cicles cicles, LastMaintenance lastMaintenance){
        super(entityId);
        this.flightTime = flightTime;
        this.cicles = cicles;
        this.lastMaintenance = lastMaintenance;
    }

    public void updateHistoryCicles(Cicles cicles){
        this.cicles = cicles;
    }

    public void updateHistoryFlightTime(FlightTime flightTime){
        this.flightTime = flightTime;
    }
    public void updateHistoryLastMaintenance(LastMaintenance lastMaintenance){
        this.lastMaintenance = lastMaintenance;
    }
}
