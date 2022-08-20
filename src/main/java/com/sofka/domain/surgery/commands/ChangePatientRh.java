package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.*;

public class ChangePatientRh extends Command {

    private final SurgeryID surgeryID;
    private final PatientID patientID;
    private final Rh rh;

    public ChangePatientRh(SurgeryID surgeryID, PatientID patientID, Rh rh) {
        this.surgeryID = surgeryID;
        this.patientID = patientID;
        this.rh = rh;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public PatientID getPatientID() {
        return patientID;
    }

    public Rh getRh() {
        return rh;
    }
}
