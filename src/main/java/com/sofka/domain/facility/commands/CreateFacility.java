package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.Ambulances;
import com.sofka.domain.facility.values.FacilityID;
import com.sofka.domain.facility.values.Location;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.SurgeryID;

public class CreateFacility extends Command {

    private final FacilityID facilityID;
    private final SurgeryID surgeryID;
    private final Name clinicName;
    private final Ambulances ambulances;
    private final Location location;

    public CreateFacility(FacilityID facilityID, SurgeryID surgeryID, Name clinicName, Ambulances ambulances, Location location) {
        this.facilityID = facilityID;
        this.surgeryID = surgeryID;
        this.clinicName = clinicName;
        this.ambulances = ambulances;
        this.location = location;
    }

    public FacilityID getFacilityID() {
        return facilityID;
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
