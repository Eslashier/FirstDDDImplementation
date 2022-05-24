package com.sofkaU.demoDDD.plane.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.demoDDD.plane.values.*;

public class UpdateModelVersion extends Command {
    private final PlaneID planeID;
    private final ModelID modelID;
    private final Version version;

    public UpdateModelVersion(PlaneID planeID, ModelID modelID, Version version) {
        this.planeID = planeID;
        this.modelID = modelID;
        this.version = version;
    }

    public PlaneID getPlaneID() {
        return planeID;
    }

    public ModelID getModelID() {
        return modelID;
    }

    public Version getVersion() {
        return version;
    }
}
