package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.PatientID;

public class PatientNameUpdated extends DomainEvent {

    private final PatientID patientID;
    private final Name name;

    public PatientNameUpdated(PatientID patientID, Name name) {
        super("sofka.domain.surgery.PatientNameUpdated");
        this.patientID = patientID;
        this.name = name;
    }


    public PatientID getPatientID() {
        return patientID;
    }

    public Name getName() {
        return name;
    }
}
