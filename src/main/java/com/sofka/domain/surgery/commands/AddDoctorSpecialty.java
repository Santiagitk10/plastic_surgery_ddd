package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.DoctorID;
import com.sofka.domain.surgery.values.Specialty;
import com.sofka.domain.surgery.values.SurgeryID;

public class AddDoctorSpecialty extends Command {

    private final SurgeryID surgeryID;
    private final DoctorID doctorID;
    private final Specialty specialty;

    public AddDoctorSpecialty(SurgeryID surgeryID, DoctorID doctorID, Specialty specialty) {
        this.surgeryID = surgeryID;
        this.doctorID = doctorID;
        this.specialty = specialty;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public DoctorID getDoctorID() {
        return doctorID;
    }

    public Specialty getSpecialty() {
        return specialty;
    }
}
