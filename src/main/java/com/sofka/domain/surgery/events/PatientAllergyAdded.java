package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.Allergy;
import com.sofka.domain.surgery.values.PatientID;

public class PatientAllergyAdded extends DomainEvent {

    private final PatientID patientID;
    private final Allergy allergy;

    public PatientAllergyAdded(PatientID patientID, Allergy allergy) {
        super("sofka.domain.surgery.PatientAllergyAdded");
        this.patientID = patientID;
        this.allergy = allergy;
    }


    public PatientID getPatientID() {
        return patientID;
    }

    public Allergy getAllergy() {
        return allergy;
    }
}
