package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.*;

public class AddPatient extends Command {

    private final SurgeryID surgeryID;
    private final PatientID patientID;
    private final Name name;
    private final Age age;
    private final ReasonForSurgery reasonForSurgery;
    private final Rh rh;

    public AddPatient(SurgeryID surgeryID, PatientID patientID, Name name, Age age, ReasonForSurgery reasonForSurgery, Rh rh) {
        this.surgeryID = surgeryID;
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.reasonForSurgery = reasonForSurgery;
        this.rh = rh;
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

    public Age getAge() {
        return age;
    }

    public ReasonForSurgery getReasonForSurgery() {
        return reasonForSurgery;
    }

    public Rh getRh() {
        return rh;
    }
}
