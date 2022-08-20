package com.sofka.domain.surgery;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.*;

import java.util.Objects;
import java.util.Set;

public class Patient extends Entity<PatientID> {

    private Name name;
    private Age age;
    private ReasonForSurgery reasonForSurgery;
    private Set<Allergy> allergies;
    private Rh rh;

    public Patient(PatientID patientID, Name name, Age age, ReasonForSurgery reasonForSurgery, Rh rh) {
        super(patientID);
        this.name = name;
        this.age = age;
        this.reasonForSurgery = reasonForSurgery;
        this.rh = rh;
    }


    public void updateName(Name name) {
        this.name = Objects.requireNonNull(name);
    }

    public void updateAge(Age age) {
        this.age = Objects.requireNonNull(age);
    }

    public void AddReasonForSurgery(ReasonForSurgery reasonForSurgery) {
        this.reasonForSurgery = Objects.requireNonNull(reasonForSurgery);
    }

    public void updateRh(Rh rh) {
        this.rh = Objects.requireNonNull(rh);
    }

    //TODO Revisar si si debo tener este método o mejor solo dejar el comportamiento como tal en el SurgeryChange Y SI NECESITO EL GETTER SIN "GET" ABAJO
    public void addAllergy(Allergy allergy) {
        var allergyToBeAdded = Objects.requireNonNull(allergy);
        this.allergies.add(allergyToBeAdded);
    }




    public Name name() {
        return name;
    }

    public Age age() {
        return age;
    }

    public ReasonForSurgery reasonForSurgery() {
        return reasonForSurgery;
    }

    public Rh rh() {
        return rh;
    }
}
