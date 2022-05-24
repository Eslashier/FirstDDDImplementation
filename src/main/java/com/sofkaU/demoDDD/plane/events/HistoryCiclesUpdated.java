package com.sofkaU.demoDDD.plane.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.plane.values.Cicles;
import com.sofkaU.demoDDD.plane.values.HistoryID;

public class HistoryCiclesUpdated extends DomainEvent {
    private final HistoryID historyID;
    private final Cicles cicles;


    public HistoryCiclesUpdated(HistoryID historyID, Cicles cicles){
        super("airways.plane.historyciclesupdated");
        this.historyID = historyID;
        this. cicles = cicles;
    }

    public HistoryID getHistoryID() {
        return historyID;
    }

    public Cicles getCicles() {
        return cicles;
    }
}
