package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.*;

public class UpdateNurseAge extends Command {

    private final SurgeryID surgeryID;
    private final NurseID nurseID;
    private final Age age;

    public UpdateNurseAge(SurgeryID surgeryID, NurseID nurseID, Age age) {
        this.surgeryID = surgeryID;
        this.nurseID = nurseID;
        this.age = age;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public NurseID getNurseID() {
        return nurseID;
    }

    public Age getAge() {
        return age;
    }
}
