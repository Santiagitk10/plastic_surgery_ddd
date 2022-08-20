package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.DoctorID;
import com.sofka.domain.surgery.values.Specialty;

public class DoctorSpecialtyAdded extends DomainEvent {

    private final DoctorID doctorID;
    private final Specialty specialty;

    public DoctorSpecialtyAdded(DoctorID doctorID, Specialty specialty) {
        super("sofka.domain.surgery.DoctorSpecialtyAdded");
        this.doctorID = doctorID;
        this.specialty = specialty;
    }


    public DoctorID getDoctorID() {
        return doctorID;
    }

    public Specialty getSpecialty() {
        return specialty;
    }
}
