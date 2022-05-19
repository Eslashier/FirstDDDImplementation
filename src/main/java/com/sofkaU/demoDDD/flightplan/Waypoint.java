package com.sofkaU.demoDDD.flightplan;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.demoDDD.flightplan.events.WaypointFrequencyUpdated;
import com.sofkaU.demoDDD.flightplan.events.WaypointUpdated;
import com.sofkaU.demoDDD.flightplan.values.*;

public class Waypoint extends AggregateEvent<WaypointId> {

    protected Frequency frequency;
    protected GPSCoordinate gpsCoordinate;

    public Waypoint(WaypointId entityId, Frequency frequency, GPSCoordinate gpsCoordinate) {
        super(entityId);
        this.frequency = frequency;
        this.gpsCoordinate = gpsCoordinate;
    }

    public void UpdateWaypointFrequency(Frequency frequency){
        this.frequency = frequency;
    }
    public void UpdateWaypointGPS(GPSCoordinate gpsCoordinate){
        this.gpsCoordinate=gpsCoordinate;
    }

}
