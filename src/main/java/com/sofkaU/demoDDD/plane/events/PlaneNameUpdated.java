package com.sofkaU.demoDDD.plane.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.plane.values.PlaneName;

public class PlaneNameUpdated extends DomainEvent {

    private final PlaneName planeName;

    public PlaneNameUpdated(PlaneName planeName){
        super("challenge.plane.planenameupdated");
        this.planeName = planeName;
    }

    public PlaneName getPlaneName() {
        return planeName;
    }
}
