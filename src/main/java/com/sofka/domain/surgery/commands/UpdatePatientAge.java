package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.Age;
import com.sofka.domain.surgery.values.PatientID;
import com.sofka.domain.surgery.values.SurgeryID;

public class UpdatePatientAge extends Command {

    private final SurgeryID surgeryID;
    private final PatientID patientID;
    private final Age age;

    public UpdatePatientAge(SurgeryID surgeryID, PatientID patientID, Age age) {
        this.surgeryID = surgeryID;
        this.patientID = patientID;
        this.age = age;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public PatientID getPatientID() {
        return patientID;
    }

    public Age getAge() {
        return age;
    }
}
