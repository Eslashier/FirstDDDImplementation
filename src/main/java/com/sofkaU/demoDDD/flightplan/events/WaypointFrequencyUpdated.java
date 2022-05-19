package com.sofkaU.demoDDD.flightplan.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.flightplan.values.Frequency;
import com.sofkaU.demoDDD.flightplan.values.WaypointId;

public class WaypointFrequencyUpdated extends DomainEvent {

    private final WaypointId waypointId;
    private final Frequency frequency;

    public WaypointFrequencyUpdated(WaypointId waypointId, Frequency frequency) {
        super("airways.flightplan.waypointfrequencyupdated");
        this.waypointId = waypointId;
        this.frequency = frequency;
    }

    public WaypointId getWaypointId() {
        return waypointId;
    }

    public Frequency getFrequency() {
        return frequency;
    }
}
