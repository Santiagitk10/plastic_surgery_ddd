package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.*;

public class RecoveryAreaAdded extends DomainEvent {

    private final RecoveryAreaID recoveryAreaID;
    private final HospitalWing hospitalWing;
    private final Status status;
    private final BedsAvailable bedsAvailable;

    public RecoveryAreaAdded(RecoveryAreaID recoveryAreaID, HospitalWing hospitalWing, Status status, BedsAvailable bedsAvailable) {
        super("sofka.domain.facility.RecoveryAreaAdded");
        this.recoveryAreaID = recoveryAreaID;
        this.hospitalWing = hospitalWing;
        this.status = status;
        this.bedsAvailable = bedsAvailable;
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
