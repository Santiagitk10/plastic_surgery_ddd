package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.*;

public class NurseAdded extends DomainEvent {

    private final NurseID nurseID;
    private final Name name;
    private final YearsOfResidency yearsOfResidency;
    private final Age age;
    private final Shift shift;


    public NurseAdded(NurseID nurseID, Name name, YearsOfResidency yearsOfResidency, Age age, Shift shift) {
        super("sofka.domain.surgery.NurseAdded");
        this.nurseID = nurseID;
        this.name = name;
        this.yearsOfResidency = yearsOfResidency;
        this.age = age;
        this.shift = shift;
    }


    public NurseID getNurseID() {
        return nurseID;
    }

    public Name getName() {
        return name;
    }

    public YearsOfResidency getYearsOfResidency() {
        return yearsOfResidency;
    }

    public Age getAge() {
        return age;
    }

    public Shift getShift() {
        return shift;
    }
}
