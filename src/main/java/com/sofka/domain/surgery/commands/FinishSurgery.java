package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.IsFinished;
import com.sofka.domain.surgery.values.SurgeryID;

public class FinishSurgery extends Command {

    private final SurgeryID surgeryID;
    private final IsFinished isFinished;

    public FinishSurgery(SurgeryID surgeryID, IsFinished isFinished) {
        this.surgeryID = surgeryID;
        this.isFinished = isFinished;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public IsFinished getIsFinished() {
        return isFinished;
    }
}
