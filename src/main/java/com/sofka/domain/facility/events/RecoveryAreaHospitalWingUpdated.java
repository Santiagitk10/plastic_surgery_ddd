package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.HospitalWing;
import com.sofka.domain.facility.values.RecoveryAreaID;

public class RecoveryAreaHospitalWingUpdated extends DomainEvent {

    private final RecoveryAreaID recoveryAreaID;
    private final HospitalWing hospitalWing;

    public RecoveryAreaHospitalWingUpdated(RecoveryAreaID recoveryAreaID, HospitalWing hospitalWing) {
        super("sofka.domain.facility.RecoveryAreaHospitalWingUpdated");
        this.recoveryAreaID = recoveryAreaID;
        this.hospitalWing = hospitalWing;
    }


    public RecoveryAreaID getRecoveryAreaID() {
        return recoveryAreaID;
    }

    public HospitalWing getHospitalWing() {
        return hospitalWing;
    }
}
