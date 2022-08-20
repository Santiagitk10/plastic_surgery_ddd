package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.DoctorID;
import com.sofka.domain.surgery.values.YearsOfResidency;

public class DoctorYearsOfResidencyUpdated extends DomainEvent {

    private final DoctorID doctorID;
    private final YearsOfResidency yearsOfResidency;

    public DoctorYearsOfResidencyUpdated(DoctorID doctorID, YearsOfResidency yearsOfResidency) {
        super("sofka.domain.surgery.DoctorYearsOfResidencyUpdated");
        this.doctorID = doctorID;
        this.yearsOfResidency = yearsOfResidency;
    }


    public DoctorID getDoctorID() {
        return doctorID;
    }

    public YearsOfResidency getYearsOfResidency() {
        return yearsOfResidency;
    }
}
