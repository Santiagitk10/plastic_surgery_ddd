package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.Age;
import com.sofka.domain.surgery.values.PatientID;

public class PatientAgeUpdated extends DomainEvent {

    private final PatientID patientID;
    private final Age age;

    public PatientAgeUpdated(PatientID patientID, Age age) {
        super("sofka.domain.surgery.PatientAgeUpdated");
        this.patientID = patientID;
        this.age = age;
    }


    public PatientID getPatientID() {
        return patientID;
    }

    public Age getAge() {
        return age;
    }
}
