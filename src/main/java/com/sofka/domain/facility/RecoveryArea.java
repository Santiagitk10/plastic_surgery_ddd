package com.sofka.domain.facility;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domain.facility.values.*;
import com.sofka.domain.surgery.values.NurseID;

import java.util.Objects;
import java.util.Set;

public class RecoveryArea extends Entity<RecoveryAreaID> {

    private HospitalWing hospitalWing;
    private Status status;
    private BedsAvailable bedsAvailable;

    private Set<NurseID> nurseIDS;

    public RecoveryArea(RecoveryAreaID recoveryAreaID, HospitalWing hospitalWing, Status status, BedsAvailable bedsAvailable) {
        super(recoveryAreaID);
        this.hospitalWing = hospitalWing;
        this.status = status;
        this.bedsAvailable = bedsAvailable;
    }


    public void updateHospitalWing(HospitalWing hospitalWing) {
        this.hospitalWing = Objects.requireNonNull(hospitalWing);
    }

    public void changeStatus(Status status) {
        this.status = Objects.requireNonNull(status);
    }

    public void changeBedsAvailable(BedsAvailable bedsAvailable) {
        this.bedsAvailable = Objects.requireNonNull(bedsAvailable);
    }



    public HospitalWing hospitalWing() {
        return hospitalWing;
    }

    public Status status() {
        return status;
    }

    public BedsAvailable bedsAvailable() {
        return bedsAvailable;
    }
}
