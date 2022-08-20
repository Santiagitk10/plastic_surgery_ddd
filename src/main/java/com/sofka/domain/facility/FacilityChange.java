package com.sofka.domain.facility;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.domain.facility.events.*;

public class FacilityChange extends EventChange {

    public FacilityChange(Facility facility){


        apply((FacilityCreated event) -> {
            facility.clinicName = event.getClinicName();
            facility.ambulances = event.getAmbulances();
            facility.location = event.getLocation();
        });


        apply((ClinicNameUpdated event) -> {
            facility.clinicName = event.getClinicName();
        });

        apply((AmbulancesUpdated event) -> {
            facility.ambulances = event.getAmbulances();
        });

        apply((LocationUpdated event) -> {
            facility.location = event.getLocation();
        });

        apply((RecoveryAreaAdded event)->{
            facility.recoveryArea = new RecoveryArea(
                event.getRecoveryAreaID(),
                event.getHospitalWing(),
                event.getStatus(),
                event.getBedsAvailable()
            );
        });


        apply((OperatingRoomAdded event)->{
            facility.operatingRoom = new OperatingRoom(
                    event.getOperatingRoomID(),
                    event.getHospitalWing(),
                    event.getStatus(),
                    event.getAnesthesia(),
                    event.getMonitors()
            );
        });


        apply((InstrumentationAdded event)->{
            facility.instrumentation = new Instrumentation(
                    event.getInstrumentationID(),
                    event.getManufacturer(),
                    event.getStatus(),
                    event.getSanitationDate()
            );
        });

        apply((RecoveryAreaHospitalWingUpdated event) -> {
            facility.recoveryArea.updateHospitalWing(event.getHospitalWing());
        });

        apply((RecoveryAreaStatusChanged event) -> {
            facility.recoveryArea.changeStatus(event.getStatus());
        });

        apply((RecoveryAreaBedsAvailableChanged event) -> {
            facility.recoveryArea.changeBedsAvailable(event.getBedsAvailable());
        });

        apply((OperatingRoomHospitalWingUpdated event) -> {
            facility.operatingRoom.updateHospitalWing(event.getHospitalWing());
        });

        apply((OperatingRoomStatusChanged event) -> {
            facility.operatingRoom.changeStatus(event.getStatus());
        });

        apply((OperatingRoomAnesthesiaChanged event) -> {
            facility.operatingRoom.changeAnesthesia(event.getAnesthesia());
        });

        apply((OperatingRoomMonitorsUpdated event) -> {
            facility.operatingRoom.updateMonitors(event.getMonitors());
        });

        apply((InstrumentationManufacturerChanged event) -> {
            facility.instrumentation.changeManufacturer(event.getManufacturer());
        });

        apply((InstrumentationStatusChanged event) -> {
            facility.instrumentation.changeStatus(event.getStatus());
        });

        apply((InstrumentationSanitationDateChanged event) -> {
            facility.instrumentation.changeSanitationDate(event.getSanitationDate());
        });


    }

}
