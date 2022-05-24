package com.sofkaU.demoDDD.plane.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.plane.values.ModelID;
import com.sofkaU.demoDDD.plane.values.Seats;

public class ModelSeatsUpdated extends DomainEvent {
    private ModelID modelID;
    private Seats seats;

    public ModelSeatsUpdated(ModelID modelID, Seats seats){
        super("challenge.traffic.seatsversionnupdated");
        this.modelID = modelID;
        this.seats = seats;
    }

    public ModelID getModelID() {
        return modelID;
    }

    public Seats getSeats() {
        return seats;
    }
}
