package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.Age;
import com.sofka.domain.surgery.values.DoctorID;
import com.sofka.domain.surgery.values.SurgeryID;

public class UpdateDoctorAge extends Command {

    private final SurgeryID surgeryID;
    private final DoctorID doctorID;
    private final Age age;

    public UpdateDoctorAge(SurgeryID surgeryID, DoctorID doctorID, Age age) {
        this.surgeryID = surgeryID;
        this.doctorID = doctorID;
        this.age = age;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public DoctorID getDoctorID() {
        return doctorID;
    }

    public Age getAge() {
        return age;
    }
}
