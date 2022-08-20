package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.*;

public class UpdateDoctorYearsOfResidency extends Command {

    private final SurgeryID surgeryID;
    private final DoctorID doctorID;
    private final YearsOfResidency yearsOfResidency;

    public UpdateDoctorYearsOfResidency(SurgeryID surgeryID, DoctorID doctorID, YearsOfResidency yearsOfResidency) {
        this.surgeryID = surgeryID;
        this.doctorID = doctorID;
        this.yearsOfResidency = yearsOfResidency;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public DoctorID getDoctorID() {
        return doctorID;
    }

    public YearsOfResidency getYearsOfResidency() {
        return yearsOfResidency;
    }
}
