package com.sofka.domain.surgery.commands;


import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.*;

public class UpdateNurseYearsOfResidency extends Command {

    private final SurgeryID surgeryID;
    private final NurseID nurseID;
    private final YearsOfResidency yearsOfResidency;

    public UpdateNurseYearsOfResidency(SurgeryID surgeryID, NurseID nurseID, YearsOfResidency yearsOfResidency) {
        this.surgeryID = surgeryID;
        this.nurseID = nurseID;
        this.yearsOfResidency = yearsOfResidency;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public NurseID getNurseID() {
        return nurseID;
    }

    public YearsOfResidency getYearsOfResidency() {
        return yearsOfResidency;
    }
}
