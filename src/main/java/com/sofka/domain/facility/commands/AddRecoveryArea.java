package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.*;

public class AddRecoveryArea extends Command {

    private final FacilityID facilityID;
    private final RecoveryAreaID recoveryAreaID;
    private final HospitalWing hospitalWing;
    private final Status status;
    private final BedsAvailable bedsAvailable;

    public AddRecoveryArea(FacilityID facilityID, RecoveryAreaID recoveryAreaID, HospitalWing hospitalWing, Status status, BedsAvailable bedsAvailable) {
        this.facilityID = facilityID;
        this.recoveryAreaID = recoveryAreaID;
        this.hospitalWing = hospitalWing;
        this.status = status;
        this.bedsAvailable = bedsAvailable;
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

    public Status getStatus() {
        return status;
    }

    public BedsAvailable getBedsAvailable() {
        return bedsAvailable;
    }
}
