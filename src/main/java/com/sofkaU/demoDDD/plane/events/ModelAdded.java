package com.sofkaU.demoDDD.plane.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.plane.values.Manufacturer;
import com.sofkaU.demoDDD.plane.values.ModelID;
import com.sofkaU.demoDDD.plane.values.Seats;
import com.sofkaU.demoDDD.plane.values.Version;

import java.util.UUID;

public class ModelAdded extends DomainEvent {

    private final ModelID modelID;
    private final Manufacturer manufacturer;
    private final Version version;
    private final Seats seats;


    public ModelAdded(ModelID modelID, Manufacturer manufacturer, Version version, Seats seats) {
        super("airways.plane.modeladded");
        this.modelID = modelID;
        this.manufacturer = manufacturer;
        this.version = version;
        this.seats = seats;
    }

    public ModelID getModelID() {
        return modelID;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Version getVersion() {
        return version;
    }

    public Seats getSeats() {
        return seats;
    }
}
