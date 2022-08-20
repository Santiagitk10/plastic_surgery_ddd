package com.sofka.domain.facility;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domain.facility.values.*;
import com.sofka.domain.shared.values.Anesthesia;
import com.sofka.domain.surgery.values.DoctorID;
import com.sofka.domain.surgery.values.NurseID;

import java.util.Objects;
import java.util.Set;

public class OperatingRoom extends Entity<OperatingRoomID> {

    private HospitalWing hospitalWing;
    private Status status;
    private Anesthesia anesthesia;
    private Monitors monitors;

    private Set<DoctorID> doctorIDS;

    private Set<NurseID> nurseIDS;



    public OperatingRoom(OperatingRoomID operatingRoomID, HospitalWing hospitalWing, Status status, Anesthesia anesthesia, Monitors monitors) {
        super(operatingRoomID);
        this.hospitalWing = hospitalWing;
        this.status = status;
        this.anesthesia = anesthesia;
        this.monitors = monitors;
    }


    public void updateHospitalWing(HospitalWing hospitalWing) {
        this.hospitalWing = Objects.requireNonNull(hospitalWing);
    }

    public void changeStatus(Status status) {
        this.status = Objects.requireNonNull(status);
    }

    public void changeAnesthesia(Anesthesia anesthesia) {
        this.anesthesia = Objects.requireNonNull(anesthesia);
    }

    public void updateMonitors(Monitors monitors) {
        this.monitors = Objects.requireNonNull(monitors);
    }



    public HospitalWing hospitalWing() {
        return hospitalWing;
    }

    public Status status() {
        return status;
    }

    public Anesthesia anesthesia() {
        return anesthesia;
    }

    public Monitors monitors() {
        return monitors;
    }
}
