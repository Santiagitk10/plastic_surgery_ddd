package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.DoctorID;
import com.sofka.domain.surgery.values.Shift;

public class DoctorShiftUpdated extends DomainEvent {

    private final DoctorID doctorID;
    private final Shift shift;

    public DoctorShiftUpdated(DoctorID doctorID, Shift shift) {
        super("sofka.domain.surgery.DoctorShiftUpdated");
        this.doctorID = doctorID;
        this.shift = shift;
    }


    public DoctorID getDoctorID() {
        return doctorID;
    }

    public Shift getShift() {
        return shift;
    }
}
