package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.Age;
import com.sofka.domain.surgery.values.DoctorID;

public class DoctorAgeUpdated extends DomainEvent {

    private final DoctorID doctorID;
    private final Age age;

    public DoctorAgeUpdated(DoctorID doctorID, Age age) {
        super("sofka.domain.surgery.DoctorAgeUpdated");
        this.doctorID = doctorID;
        this.age = age;
    }


    public DoctorID getDoctorID() {
        return doctorID;
    }

    public Age getAge() {
        return age;
    }
}
