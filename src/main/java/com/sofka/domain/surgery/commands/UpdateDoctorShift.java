package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.*;

public class UpdateDoctorShift extends Command {

    private final SurgeryID surgeryID;
    private final DoctorID doctorID;
    private final Shift shift;

    public UpdateDoctorShift(SurgeryID surgeryID, DoctorID doctorID, Shift shift) {
        this.surgeryID = surgeryID;
        this.doctorID = doctorID;
        this.shift = shift;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public DoctorID getDoctorID() {
        return doctorID;
    }

    public Shift getShift() {
        return shift;
    }
}
