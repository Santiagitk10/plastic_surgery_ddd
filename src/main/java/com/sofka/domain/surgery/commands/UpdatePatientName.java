package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.Name;
import com.sofka.domain.surgery.values.PatientID;
import com.sofka.domain.surgery.values.SurgeryID;

public class UpdatePatientName extends Command {

    private final SurgeryID surgeryID;
    private final PatientID patientID;
    private final Name name;

    public UpdatePatientName(SurgeryID surgeryID, PatientID patientID, Name name) {
        this.surgeryID = surgeryID;
        this.patientID = patientID;
        this.name = name;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public PatientID getPatientID() {
        return patientID;
    }

    public Name getName() {
        return name;
    }
}
