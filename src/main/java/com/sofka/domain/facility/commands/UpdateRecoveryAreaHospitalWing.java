package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.FacilityID;
import com.sofka.domain.facility.values.HospitalWing;
import com.sofka.domain.facility.values.RecoveryAreaID;

public class UpdateRecoveryAreaHospitalWing extends Command {

    private final FacilityID facilityID;
    private final RecoveryAreaID recoveryAreaID;
    private final HospitalWing hospitalWing;

    public UpdateRecoveryAreaHospitalWing(FacilityID facilityID, RecoveryAreaID recoveryAreaID, HospitalWing hospitalWing) {
        this.facilityID = facilityID;
        this.recoveryAreaID = recoveryAreaID;
        this.hospitalWing = hospitalWing;
    }

    public FacilityID getFacilityID() {
        return facilityID;
    }

    public RecoveryAreaID getRecoveryAreaID() {
        return recoveryAreaID;
    }

    public HospitalWing getHospitalWing() {
        return hospitalWing;
    }
}
