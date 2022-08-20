package com.sofka.domain.facility;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.events.*;
import com.sofka.domain.facility.values.*;
import com.sofka.domain.shared.values.Anesthesia;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.SurgeryID;

import java.util.List;
import java.util.Objects;

public class Facility extends AggregateEvent<FacilityID> {

    protected SurgeryID surgeryID;
    protected Name clinicName;
    protected Ambulances ambulances;
    protected Location location;
    protected RecoveryArea recoveryArea;
    protected OperatingRoom operatingRoom;
    protected Instrumentation instrumentation;

    public Facility(FacilityID facilityID, SurgeryID surgeryID, Name clinicName, Ambulances ambulances, Location location) {
        super(facilityID);
        appendChange(new FacilityCreated(surgeryID, clinicName, ambulances, location));
    }

    private Facility(FacilityID facilityID){
        super(facilityID);
        subscribe(new FacilityChange(this));
    }

    public static Facility from(FacilityID facilityID, List<DomainEvent> events){
        var facility = new Facility(facilityID);
        events.forEach(facility::applyEvent);
        return facility;
    }

    public void UpdateClinicName(Name clinicName){
        Objects.requireNonNull(clinicName);
        appendChange(new ClinicNameUpdated(clinicName)).apply();
    }

    public void updateAmbulances(Ambulances ambulances){
        Objects.requireNonNull(ambulances);
        appendChange(new AmbulancesUpdated(ambulances)).apply();
    }

    public void updateLocation(Location location){
        Objects.requireNonNull(location);
        appendChange(new LocationUpdated(location)).apply();
    }

    public void addRecoveryArea(RecoveryAreaID recoveryAreaID, HospitalWing hospitalWing, Status status, BedsAvailable bedsAvailable){
        Objects.requireNonNull(recoveryAreaID);
        Objects.requireNonNull(hospitalWing);
        Objects.requireNonNull(status);
        Objects.requireNonNull(bedsAvailable);
        appendChange(new RecoveryAreaAdded(recoveryAreaID, hospitalWing, status, bedsAvailable)).apply();
    }


    public void addOperatingRoom(OperatingRoomID operatingRoomID, HospitalWing hospitalWing, Status status, Anesthesia anesthesia, Monitors monitors){
        Objects.requireNonNull(operatingRoomID);
        Objects.requireNonNull(hospitalWing);
        Objects.requireNonNull(status);
        Objects.requireNonNull(anesthesia);
        Objects.requireNonNull(monitors);
        appendChange(new OperationRoomAdded(operatingRoomID, hospitalWing, status, anesthesia, monitors)).apply();
    }

    public void addInstrumentation(InstrumentationID instrumentationID, Manufacturer manufacturer, Status status, SanitationDate sanitationDate){
        Objects.requireNonNull(instrumentationID);
        Objects.requireNonNull(manufacturer);
        Objects.requireNonNull(status);
        Objects.requireNonNull(sanitationDate);
        appendChange(new InstrumentationAdded(instrumentationID, manufacturer, status, sanitationDate)).apply();
    }

    public void updateRecoveryAreaHospitalWing(RecoveryAreaID recoveryAreaID, HospitalWing hospitalWing){
        Objects.requireNonNull(recoveryAreaID);
        Objects.requireNonNull(hospitalWing);
        appendChange(new RecoveryAreaHospitalWingUpdated(recoveryAreaID, hospitalWing)).apply();
    }

    public void changeRecoveryAreaStatus(RecoveryAreaID recoveryAreaID, Status status){
        Objects.requireNonNull(recoveryAreaID);
        Objects.requireNonNull(status);
        appendChange(new RecoveryAreaStatusChanged(recoveryAreaID, status)).apply();
    }

    public void changeRecoveryAreaBedsAvailable(RecoveryAreaID recoveryAreaID, BedsAvailable bedsAvailable){
        Objects.requireNonNull(recoveryAreaID);
        Objects.requireNonNull(bedsAvailable);
        appendChange(new RecoveryAreaBedsAvailableChanged(recoveryAreaID, bedsAvailable)).apply();
    }

    public void updateOperatingRoomHospitalWing(OperatingRoomID operatingRoomID, HospitalWing hospitalWing){
        Objects.requireNonNull(operatingRoomID);
        Objects.requireNonNull(hospitalWing);
        appendChange(new OperatingRoomHospitalWingUpdated(operatingRoomID, hospitalWing)).apply();
    }

    public void changeOperatingRoomStatus(OperatingRoomID operatingRoomID, Status status){
        Objects.requireNonNull(operatingRoomID);
        Objects.requireNonNull(status);
        appendChange(new OperatingRoomStatusChanged(operatingRoomID, status)).apply();
    }

    public void changeOperatingRoomAnesthesia(OperatingRoomID operatingRoomID, Anesthesia anesthesia){
        Objects.requireNonNull(operatingRoomID);
        Objects.requireNonNull(anesthesia);
        appendChange(new OperatingRoomAnesthesiaChanged(operatingRoomID, anesthesia)).apply();
    }

    public void updateOperatingRoomMonitors(OperatingRoomID operatingRoomID, Monitors monitors){
        Objects.requireNonNull(operatingRoomID);
        Objects.requireNonNull(monitors);
        appendChange(new OperatingRoomMonitorsUpdated(operatingRoomID, monitors)).apply();
    }

    public void changeInstrumentationManufacturer(InstrumentationID instrumentationID, Manufacturer manufacturer){
        Objects.requireNonNull(instrumentationID);
        Objects.requireNonNull(manufacturer);
        appendChange(new InstrumentationManufacturerChanged(instrumentationID, manufacturer)).apply();
    }

    public void changeInstrumentationStatus(InstrumentationID instrumentationID, Status status){
        Objects.requireNonNull(instrumentationID);
        Objects.requireNonNull(status);
        appendChange(new InstrumentationStatusChanged(instrumentationID, status)).apply();
    }

    public void changeInstrumentationSanitationDate(InstrumentationID instrumentationID, SanitationDate sanitationDate){
        Objects.requireNonNull(instrumentationID);
        Objects.requireNonNull(sanitationDate);
        appendChange(new InstrumentationSanitationDateChanged(instrumentationID, sanitationDate)).apply();
    }


    //TODO PENDIENTE OPTIONALS PARA BUSQUEDAS POR ID



    public Name clinicName() {
        return clinicName;
    }

    public Ambulances ambulances() {
        return ambulances;
    }

    public Location location() {
        return location;
    }

    public RecoveryArea recoveryArea() {
        return recoveryArea;
    }

    public OperatingRoom operatingRoom() {
        return operatingRoom;
    }

    public Instrumentation instrumentation() {
        return instrumentation;
    }

}
