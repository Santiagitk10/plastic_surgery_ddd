package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.Ambulances;
import com.sofka.domain.facility.values.Location;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.SurgeryID;

public class FacilityCreated extends DomainEvent {

    private final SurgeryID surgeryID;
    private final Name clinicName;
    private final Ambulances ambulances;
    private final Location location;

    public FacilityCreated(SurgeryID surgeryID, Name clinicName, Ambulances ambulances, Location location) {
        super("sofka.domain.facility.FacilityCreated");
        this.surgeryID = surgeryID;
        this.clinicName = clinicName;
        this.ambulances = ambulances;
        this.location = location;
    }


    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public Name getClinicName() {
        return clinicName;
    }

    public Ambulances getAmbulances() {
        return ambulances;
    }

    public Location getLocation() {
        return location;
    }
}
