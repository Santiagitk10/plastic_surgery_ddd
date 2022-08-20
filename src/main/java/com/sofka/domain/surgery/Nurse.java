package com.sofka.domain.surgery;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.*;

import java.util.Objects;

public class Nurse extends Entity<NurseID> {

    private Name name;
    private YearsOfResidency yearsOfResidency;
    private Age age;
    private Shift shift;


    public Nurse(NurseID nurseID, Name name, YearsOfResidency yearsOfResidency, Age age, Shift shift) {
        super(nurseID);
        this.name = name;
        this.yearsOfResidency = yearsOfResidency;
        this.age = age;
        this.shift = shift;
    }


    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateYearsOfResidency(YearsOfResidency yearsOfResidency) {
        this.yearsOfResidency = Objects.requireNonNull(yearsOfResidency);
    }

    public void updateAge(Age age) {
        this.age = Objects.requireNonNull(age);
    }

    public void updateShift(Shift shift) {
        this.shift = Objects.requireNonNull(shift);
    }



    public Name name() {
        return name;
    }

    public YearsOfResidency getYearsOfResidency() {
        return yearsOfResidency;
    }

    public Age age() {
        return age;
    }

    public Shift shift() {
        return shift;
    }
}
