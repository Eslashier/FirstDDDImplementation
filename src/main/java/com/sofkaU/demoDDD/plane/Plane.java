package com.sofkaU.demoDDD.plane;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.demoDDD.plane.events.*;
import com.sofkaU.demoDDD.plane.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Plane extends AggregateEvent<PlaneID> {

    protected PlaneName planeName;
    protected Set<Model> models;
    protected Set<History> histories;

    public Plane(PlaneID entityId, PlaneName planeName) {
        super(entityId);
        appendChange(new PlaneCreated(planeName)).apply();
    }

    public Plane(PlaneID entityId){
        super(entityId);
        subscribe(new PlaneChange(this));
    }

    public static Plane from(PlaneID planeID, List<DomainEvent> events){
        var plane = new Plane(planeID);
        events.forEach(plane::applyEvent);
        return  plane;
    }

    public void  addHistory(HistoryID entityId, FlightTime flightTime, Cicles cicles, LastMaintenance lastMaintenance){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(flightTime);
        Objects.requireNonNull(cicles);
        Objects.requireNonNull(lastMaintenance);
        appendChange(new HistoryAdded(entityId, flightTime,cicles,lastMaintenance)).apply();
    }

    public void addModel(ModelID entityId, Manufacturer manufacturer, Version version, Seats seats){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(manufacturer);
        Objects.requireNonNull(version);
        Objects.requireNonNull(seats);
        appendChange(new ModelAdded(entityId, manufacturer, version, seats)).apply();
    }

    public void updateHistoryCicles(HistoryID entityId, Cicles cicles){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(cicles);
        appendChange(new HistoryCiclesUpdated(entityId, cicles)).apply();
    }

    public void UpdatehistoryFlightTime(HistoryID entityId,FlightTime flightTime){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(flightTime);
        appendChange(new HistoryFlightTimeUpdated(entityId, flightTime)).apply();
    }

    public void updateHistoryLastMaintenance(HistoryID entityId, LastMaintenance lastMaintenance){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(lastMaintenance);
        appendChange(new HistoryLastMaintenanceUpdated(entityId, lastMaintenance)).apply();
    }

    public void UpdatemodelSeats(ModelID entityId, Seats seats){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(seats);
        appendChange(new ModelSeatsUpdated(entityId, seats)).apply();
    }

    public void UpdatemodelVersion(ModelID entityId, Version version){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(version);
        appendChange(new ModelVersionUpdated(entityId, version)).apply();
    }

    public PlaneName planeName() {
        return planeName;
    }

    public Set<Model> models() {
        return models;
    }

    public Set<History> ghistories() {
        return histories;
    }
}
