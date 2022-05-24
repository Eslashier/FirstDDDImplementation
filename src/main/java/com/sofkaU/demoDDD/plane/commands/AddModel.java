package com.sofkaU.demoDDD.plane.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.plane.values.Manufacturer;
import com.sofkaU.demoDDD.plane.values.PlaneID;
import com.sofkaU.demoDDD.plane.values.Seats;
import com.sofkaU.demoDDD.plane.values.Version;

public class AddModel extends Command {
    private final PlaneID planeID;
    private final Manufacturer manufacturer;
    private final Version version;
    private final Seats seats;

    public AddModel(PlaneID planeID, Manufacturer manufacturer, Version version, Seats seats) {
        this.planeID = planeID;
        this.manufacturer = manufacturer;
        this.version = version;
        this.seats = seats;
    }

    public PlaneID getPlaneID() {
        return planeID;
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
