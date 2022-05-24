package com.sofkaU.demoDDD.plane;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.demoDDD.plane.values.Manufacturer;
import com.sofkaU.demoDDD.plane.values.ModelID;
import com.sofkaU.demoDDD.plane.values.Seats;
import com.sofkaU.demoDDD.plane.values.Version;

public class Model extends Entity<ModelID> {

    private Manufacturer manufacturer;
    private Version version;
    private Seats seats;

    public Model(ModelID entityId, Manufacturer manufacturer, Version version, Seats seats){
        super(entityId);
        this.manufacturer = manufacturer;
        this.version = version;
        this.seats = seats;
    }

    public void updateModelSeats(Seats seats){
        this.seats = seats;
    }

    public void updateModelVersion(Version version){
        this.version = version;
    }
}
