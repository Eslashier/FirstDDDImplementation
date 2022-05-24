package com.sofkaU.demoDDD.plane.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.plane.values.HistoryID;
import com.sofkaU.demoDDD.plane.values.LastMaintenance;

public class HistoryLastMaintenanceUpdated extends DomainEvent {
    private final HistoryID historyID;
    private final LastMaintenance lastMaintenance;

    public HistoryLastMaintenanceUpdated(HistoryID historyID, LastMaintenance lastMaintenance){
        super("airways.plane.lastmaintenanceupdated");
        this.historyID = historyID;
        this.lastMaintenance = lastMaintenance;
    }

    public HistoryID getHistoryID() {
        return historyID;
    }

    public LastMaintenance getLastMaintenance() {
        return lastMaintenance;
    }
}
