package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.Allergy;
import com.sofka.domain.surgery.values.PatientID;
import com.sofka.domain.surgery.values.SurgeryID;

public class AddPatientAllergy extends Command {

    private final SurgeryID surgeryID;
    private final PatientID patientID;
    private final Allergy allergy;

    public AddPatientAllergy(SurgeryID surgeryID, PatientID patientID, Allergy allergy) {
        this.surgeryID = surgeryID;
        this.patientID = patientID;
        this.allergy = allergy;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public PatientID getPatientID() {
        return patientID;
    }

    public Allergy getAllergy() {
        return allergy;
    }
}
