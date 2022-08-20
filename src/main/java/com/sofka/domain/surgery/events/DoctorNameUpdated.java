package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.DoctorID;

public class DoctorNameUpdated extends DomainEvent {

    private final DoctorID doctorID;
    private final Name name;

    public DoctorNameUpdated(DoctorID doctorID, Name name) {
        super("sofka.domain.surgery.DoctorNameUpdated");
        this.doctorID = doctorID;
        this.name = name;
    }


    public DoctorID getDoctorID() {
        return doctorID;
    }

    public Name getName() {
        return name;
    }
}
