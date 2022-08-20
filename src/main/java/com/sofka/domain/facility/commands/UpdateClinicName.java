package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.FacilityID;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.SurgeryID;

public class UpdateClinicName extends Command {

    private final FacilityID facilityID;
    private final Name clinicName;

    public UpdateClinicName(FacilityID facilityID, Name clinicName) {
        this.facilityID = facilityID;
        this.clinicName = clinicName;
    }

    public FacilityID getFacilityID() {
        return facilityID;
    }

    public Name getClinicName() {
        return clinicName;
    }
}
