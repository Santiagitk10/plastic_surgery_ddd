package com.sofka.domain.surgery;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.*;

import java.util.Objects;
import java.util.Set;

public class Doctor extends Entity<DoctorID> {

    private Name name;
    private Age age;
    private Set<Specialty> specialties;
    private YearsOfResidency yearsOfResidency;
    private Shift shift;

    public Doctor(DoctorID doctorID, Name name, Age age, YearsOfResidency yearsOfResidency, Shift shift) {
        super(doctorID);
        this.name = name;
        this.age = age;
        this.yearsOfResidency = yearsOfResidency;
        this.shift = shift;
    }


    public void updateName(Name name) {
        this.name = Objects.requireNonNull(name);
    }

    public void updateAge(Age age) {
        this.age = Objects.requireNonNull(age);
    }

    public void updateYearsOfResidency(YearsOfResidency yearsOfResidency) {
        this.yearsOfResidency = Objects.requireNonNull(yearsOfResidency);
    }

    public void updateShift(Shift shift) {
        this.shift = Objects.requireNonNull(shift);
    }


    public void addSpecialty(Specialty specialty) {
        var specialtyToBeAdded = Objects.requireNonNull(specialty);
        this.specialties.add(specialtyToBeAdded);
    }






    public Name name() {
        return name;
    }

    public Age age() {
        return age;
    }

    public YearsOfResidency yearsOfResidency() {
        return yearsOfResidency;
    }

    public Shift shift() {
        return shift;
    }
}
