package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.*;

public class AddDoctor extends Command {

    private final SurgeryID surgeryID;
    private final DoctorID doctorID;
    private final Name name;
    private final Age age;
    private final YearsOfResidency yearsOfResidency;
    private final Shift shift;

    public AddDoctor(SurgeryID surgeryID, DoctorID doctorID, Name name, Age age, YearsOfResidency yearsOfResidency, Shift shift) {
        this.surgeryID = surgeryID;
        this.doctorID = doctorID;
        this.name = name;
        this.age = age;
        this.yearsOfResidency = yearsOfResidency;
        this.shift = shift;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public DoctorID getDoctorID() {
        return doctorID;
    }

    public Name getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }


    public YearsOfResidency getYearsOfResidency() {
        return yearsOfResidency;
    }

    public Shift getShift() {
        return shift;
    }
}
