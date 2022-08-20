package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.*;

public class DoctorAdded extends DomainEvent {

    private final DoctorID doctorID;
    private final Name name;
    private final Age age;
    private final YearsOfResidency yearsOfResidency;
    private final Shift shift;

    public DoctorAdded(DoctorID doctorID, Name name, Age age, YearsOfResidency yearsOfResidency, Shift shift) {
        super("sofka.domain.surgery.DoctorAdded");
        this.doctorID = doctorID;
        this.name = name;
        this.age = age;
        this.yearsOfResidency = yearsOfResidency;
        this.shift = shift;
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
