package com.sofkaU.demoDDD.plane.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.plane.values.*;

public class UpdateHistoryCicles extends Command {
    private final PlaneID planeID;
    private final HistoryID historyID;
    private final Cicles cicles;

    public UpdateHistoryCicles(PlaneID planeID, HistoryID historyID, Cicles cicles) {
        this.planeID = planeID;
        this.historyID = historyID;
        this.cicles = cicles;
    }

    public PlaneID getPlaneID() {
        return planeID;
    }

    public HistoryID getHistoryID() {
        return historyID;
    }

    public Cicles getCicles() {
        return cicles;
    }
}
