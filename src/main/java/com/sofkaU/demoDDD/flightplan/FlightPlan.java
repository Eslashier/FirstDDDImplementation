package com.sofkaU.demoDDD.flightplan;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.demoDDD.flightplan.commands.AddAlternativeAirport;
import com.sofkaU.demoDDD.flightplan.events.*;
import com.sofkaU.demoDDD.flightplan.values.*;

import java.util.Objects;
import java.util.Set;

public class FlightPlan extends AggregateEvent<FlightPlanId> {

    protected Set<DepartureAirport> departureAirports;
    protected Set<ArrivalAirport> arrivalAirports;
    protected Set<AlternativeAirport> alternativeAirports;
    protected Set<Waypoint> waypoints;
    protected FlightPlanName flightPlanName;
    protected CruiseAltitude cruiseAltitude;
    protected FuelLoad fuelLoad;
    protected Length length;

    public FlightPlan(FlightPlanId entityId, DepartureAirport departureAirport, ArrivalAirport arrivalAirport, FlightPlanName flightPlanName,
                      CruiseAltitude cruiseAltitude, FuelLoad fuelLoad, Length length) {
        super(entityId);
        appendChange(new FlightPlanCreated(departureAirport, arrivalAirport, flightPlanName, cruiseAltitude, fuelLoad, length)).apply();
    }

    public void addAlternativeAirport(AirportId entityId, Runaway runaway, AirTrafficFrequency airTrafficFrequency){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(runaway);
        Objects.requireNonNull(airTrafficFrequency);
        appendChange(new AlternativeAirportAdded(entityId, runaway, airTrafficFrequency)).apply();

    }

    public void addAWaypoint(WaypointId entityId, Frequency frequency, GPSCoordinate gpsCoordinate){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(frequency);
        Objects.requireNonNull(gpsCoordinate);
        appendChange(new WaypointAdded(entityId, frequency, gpsCoordinate)).apply();

    }

    public void UpdateFlightPlanName(FlightPlanName flightPlanName){
        appendChange(new FlightPlanNameUpdated(flightPlanName)).apply();
    }
    public void UpdateFlightPlanCruiseAltitud(CruiseAltitude cruiseAltitude){
        appendChange(new FlightPlanCruiseAltitudeUpdated(cruiseAltitude)).apply();
    }
    public void UpdateFlightPlanCruiseFuel(FuelLoad fuelLoad){
        appendChange(new FlightPlanFuelUpdated(fuelLoad)).apply();
    }
    public void UpdateFlightPlanLenght(Length length){
        appendChange(new FlightPlanLenghtUpdated(length)).apply();
    }
    public void ChangeDepartureAirport(AirportId entityId, Runaway runaway, AirTrafficFrequency airTrafficFrequency){
        appendChange(new DepartureAirportUpdated(entityId, runaway, airTrafficFrequency)).apply();
    }
    public void UpdateDepartureRunaway(AirportId entityId, Runaway runaway){
        appendChange(new DepartureAirportRunawayUpdated(entityId, runaway)).apply();
    }
    public void UpdateDepartureAirTrafficFrequency(AirportId entityId, AirTrafficFrequency airTrafficFrequency){
        appendChange(new DepartureAirportAirTrafficFrequencyUpdated(entityId, airTrafficFrequency)).apply();
    }
    public void ChangeArrivalAirport(AirportId entityId, Runaway runaway, AirTrafficFrequency airTrafficFrequency){
        appendChange(new ArrivalAirportUpdated(entityId, runaway, airTrafficFrequency)).apply();
    }
    public void UpdateArrivalRunaway(AirportId entityId, Runaway runaway){
        appendChange(new ArrivalAirportRunawayUpdated(entityId, runaway)).apply();
    }
    public void UpdateArrivalAirTrafficFrequency(AirportId entityId, AirTrafficFrequency airTrafficFrequency){
        appendChange(new ArrivalAirportAirTrafficFrequencyUpdated(entityId, airTrafficFrequency)).apply();
    }
    public void ChangeAlternativeAirport(AirportId entityId, Runaway runaway, AirTrafficFrequency airTrafficFrequency){
        appendChange(new AlternativeAirportUpdated(entityId, runaway, airTrafficFrequency)).apply();
    }
    public void UpdateAlternativeRunaway(AirportId entityId, Runaway runaway){
        appendChange(new AlternativeAirportRunawayUpdated(entityId, runaway)).apply();
    }
    public void UpdateAlternativeAirTrafficFrequency(AirportId entityId, AirTrafficFrequency airTrafficFrequency){
        appendChange(new AlternativeAirportAirTrafficFrequencyUpdated(entityId, airTrafficFrequency)).apply();
    }
    public void UpdateWaypoint(WaypointId entityId, Frequency frequency, GPSCoordinate gpsCoordinate){
        appendChange(new WaypointUpdated(entityId,frequency,gpsCoordinate)).apply();
    }
    public void UpdateWaypointFrequency(WaypointId entityId, Frequency frequency){
        appendChange(new WaypointFrequencyUpdated(entityId,frequency)).apply();
    }
    public void UpdateWaypointGPS(WaypointId entityId, GPSCoordinate gpsCoordinate){
        appendChange(new WaypointUpdated(entityId,gpsCoordinate)).apply();
    }

    public Set<DepartureAirport> DepartureAirport() {
        return departureAirports;
    }

    public Set<ArrivalAirport> ArrivalAirport() {
        return arrivalAirports;
    }

    public Set<AlternativeAirport> AlternativeAirports() {
        return alternativeAirports;
    }

    public Set<Waypoint> Waypoints() {
        return waypoints;
    }

    public FlightPlanName FlightPlanName() {
        return flightPlanName;
    }

    public CruiseAltitude CruiseAltitude() {
        return cruiseAltitude;
    }

    public FuelLoad FuelLoad() {
        return fuelLoad;
    }

    public Length length() {
        return length;
    }
}
