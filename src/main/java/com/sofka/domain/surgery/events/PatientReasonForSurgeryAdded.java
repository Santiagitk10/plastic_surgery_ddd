package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.PatientID;
import com.sofka.domain.surgery.values.ReasonForSurgery;

public class PatientReasonForSurgeryAdded extends DomainEvent {

    private final PatientID patientID;
    private final ReasonForSurgery reasonForSurgery;

    public PatientReasonForSurgeryAdded(PatientID patientID, ReasonForSurgery reasonForSurgery) {
        super("sofka.domain.surgery.PatientReasonForSurgeryAdded");
        this.patientID = patientID;
        this.reasonForSurgery = reasonForSurgery;
    }


    public PatientID getPatientID() {
        return patientID;
    }

    public ReasonForSurgery getReasonForSurgery() {
        return reasonForSurgery;
    }
}
