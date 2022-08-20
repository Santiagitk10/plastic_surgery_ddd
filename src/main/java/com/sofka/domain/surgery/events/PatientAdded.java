package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.*;

public class PatientAdded extends DomainEvent {

    private final PatientID patientID;
    private final Name name;
    private final Age age;
    private final ReasonForSurgery reasonForSurgery;
    private final Rh rh;

    public PatientAdded(PatientID patientID, Name name, Age age, ReasonForSurgery reasonForSurgery, Rh rh) {
        super("sofka.domain.surgery.PatientAdded");
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.reasonForSurgery = reasonForSurgery;
        this.rh = rh;
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
