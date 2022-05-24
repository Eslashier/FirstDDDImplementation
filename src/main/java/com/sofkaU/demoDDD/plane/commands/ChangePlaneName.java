package com.sofkaU.demoDDD.plane.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.plane.values.PlaneID;
import com.sofkaU.demoDDD.plane.values.PlaneName;

public class ChangePlaneName extends Command {
    private final PlaneID planeID;
    private final PlaneName planeName;

    public ChangePlaneName(PlaneID planeID, PlaneName planeName) {
        this.planeID = planeID;
        this.planeName = planeName;
    }

    public PlaneID getPlaneID() {
        return planeID;
    }

    public PlaneName getPlaneName() {
        return planeName;
    }
}
