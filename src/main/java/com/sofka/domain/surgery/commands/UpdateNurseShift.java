package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.*;

public class UpdateNurseShift extends Command {

    private final SurgeryID surgeryID;
    private final NurseID nurseID;
    private final Shift shift;

    public UpdateNurseShift(SurgeryID surgeryID, NurseID nurseID, Shift shift) {
        this.surgeryID = surgeryID;
        this.nurseID = nurseID;
        this.shift = shift;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public NurseID getNurseID() {
        return nurseID;
    }

    public Shift getShift() {
        return shift;
    }
}
