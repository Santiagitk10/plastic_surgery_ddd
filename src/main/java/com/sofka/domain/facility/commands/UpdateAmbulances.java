package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.Ambulances;
import com.sofka.domain.facility.values.FacilityID;
import com.sofka.domain.shared.values.Name;

public class UpdateAmbulances extends Command {

    private final FacilityID facilityID;
    private final Ambulances ambulances;

    public UpdateAmbulances(FacilityID facilityID, Ambulances ambulances) {
        this.facilityID = facilityID;
        this.ambulances = ambulances;
    }

    public FacilityID getFacilityID() {
        return facilityID;
    }

    public Ambulances getAmbulances() {
        return ambulances;
    }
}
