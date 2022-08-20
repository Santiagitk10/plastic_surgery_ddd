package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.*;

public class AddNurse extends Command {

    private final SurgeryID surgeryID;
    private final NurseID nurseID;
    private final Name name;
    private final YearsOfResidency yearsOfResidency;
    private final Age age;
    private final Shift shift;


    public AddNurse(SurgeryID surgeryID, NurseID nurseID, Name name, YearsOfResidency yearsOfResidency, Age age, Shift shift) {
        this.surgeryID = surgeryID;
        this.nurseID = nurseID;
        this.name = name;
        this.yearsOfResidency = yearsOfResidency;
        this.age = age;
        this.shift = shift;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
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
