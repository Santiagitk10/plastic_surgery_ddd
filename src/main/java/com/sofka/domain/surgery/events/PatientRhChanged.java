package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.PatientID;
import com.sofka.domain.surgery.values.Rh;

public class PatientRhChanged extends DomainEvent {

    private final PatientID patientID;
    private final Rh rh;

    public PatientRhChanged(PatientID patientID, Rh rh) {
        super("sofka.domain.surgery.PatientRhChanged");
        this.patientID = patientID;
        this.rh = rh;
    }


    public PatientID getPatientID() {
        return patientID;
    }

    public Rh getRh() {
        return rh;
    }
}
