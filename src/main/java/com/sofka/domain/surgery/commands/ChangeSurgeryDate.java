package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.SurgeryDate;
import com.sofka.domain.surgery.values.SurgeryID;

public class ChangeSurgeryDate extends Command {

    private final SurgeryID surgeryID;
    private final SurgeryDate surgeryDate;

    public ChangeSurgeryDate(SurgeryID surgeryID, SurgeryDate surgeryDate) {
        this.surgeryID = surgeryID;
        this.surgeryDate = surgeryDate;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public SurgeryDate getSurgeryDate() {
        return surgeryDate;
    }
}
