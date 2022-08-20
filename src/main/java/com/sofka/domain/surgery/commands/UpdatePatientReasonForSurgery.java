package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.*;

public class UpdatePatientReasonForSurgery extends Command {

    private final SurgeryID surgeryID;
    private final PatientID patientID;
    private final ReasonForSurgery reasonForSurgery;

    public UpdatePatientReasonForSurgery(SurgeryID surgeryID, PatientID patientID, ReasonForSurgery reasonForSurgery) {
        this.surgeryID = surgeryID;
        this.patientID = patientID;
        this.reasonForSurgery = reasonForSurgery;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public PatientID getPatientID() {
        return patientID;
    }

    public ReasonForSurgery getReasonForSurgery() {
        return reasonForSurgery;
    }
}
