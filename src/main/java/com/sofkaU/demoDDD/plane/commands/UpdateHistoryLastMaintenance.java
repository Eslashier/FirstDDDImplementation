package com.sofkaU.demoDDD.plane.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.plane.values.*;

public class UpdateHistoryLastMaintenance extends Command {
    private final PlaneID planeID;
    private final HistoryID historyID;
    private final LastMaintenance lastMaintenance;

    public UpdateHistoryLastMaintenance(PlaneID planeID, HistoryID historyID, LastMaintenance lastMaintenance) {
        this.planeID = planeID;
        this.historyID = historyID;
        this.lastMaintenance = lastMaintenance;
    }

    public PlaneID getPlaneID() {
        return planeID;
    }

    public HistoryID getHistoryID() {
        return historyID;
    }

    public LastMaintenance getLastMaintenance() {
        return lastMaintenance;
    }
}
