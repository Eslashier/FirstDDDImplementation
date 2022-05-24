package com.sofkaU.demoDDD.plane.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.plane.values.ModelID;
import com.sofkaU.demoDDD.plane.values.Version;

public class ModelVersionUpdated extends DomainEvent {

    private ModelID modelID;
    private Version version;

    public ModelVersionUpdated(ModelID modelID, Version version){
        super("challenge.traffic.modelversionnupdated");
        this.modelID = modelID;
        this.version = version;
    }

    public ModelID getModelID() {
        return modelID;
    }

    public Version getVersion() {
        return version;
    }
}
