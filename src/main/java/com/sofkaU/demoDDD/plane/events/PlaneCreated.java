package com.sofkaU.demoDDD.plane.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.plane.values.PlaneName;

public class PlaneCreated extends DomainEvent {

    private final PlaneName planeName;

    public PlaneCreated(PlaneName planeName){
        super("airways.plane.planecreated");
        this.planeName = planeName;
    }

    public PlaneName getPlaneName() {
        return planeName;
    }
}
