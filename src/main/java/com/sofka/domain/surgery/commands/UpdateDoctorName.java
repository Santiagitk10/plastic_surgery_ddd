package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.DoctorID;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.SurgeryID;

public class UpdateDoctorName extends Command {

    private final SurgeryID surgeryID;
    private final DoctorID doctorID;
    private final Name name;

    public UpdateDoctorName(SurgeryID surgeryID, DoctorID doctorID, Name name) {
        this.surgeryID = surgeryID;
        this.doctorID = doctorID;
        this.name = name;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public DoctorID getDoctorID() {
        return doctorID;
    }

    public Name getName() {
        return name;
    }
}
