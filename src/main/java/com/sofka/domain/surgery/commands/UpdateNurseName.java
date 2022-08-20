package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.*;

public class UpdateNurseName extends Command {

    private final SurgeryID surgeryID;
    private final NurseID nurseID;
    private final Name name;

    public UpdateNurseName(SurgeryID surgeryID, NurseID nurseID, Name name) {
        this.surgeryID = surgeryID;
        this.nurseID = nurseID;
        this.name = name;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public NurseID getNurseID() {
        return nurseID;
    }

    public Name getName() {
        return name;
    }
}
