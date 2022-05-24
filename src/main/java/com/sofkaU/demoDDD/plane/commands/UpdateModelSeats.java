package com.sofkaU.demoDDD.plane.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.plane.Model;
import com.sofkaU.demoDDD.plane.values.*;

public class UpdateModelSeats extends Command {
    private final PlaneID planeID;
    private final ModelID modelID;
    private final Seats seats;

    public UpdateModelSeats(PlaneID planeID, ModelID modelID, Seats seats) {
        this.planeID = planeID;
        this.modelID = modelID;
        this.seats = seats;
    }

    public PlaneID getPlaneID() {
        return planeID;
    }

    public ModelID getModelID() {
        return modelID;
    }

    public Seats getSeats() {
        return seats;
    }
}
