package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.surgery.values.Specialty;
import com.sofka.domain.surgery.values.SurgeryID;

public class UpdateSpecialty extends Command {

    private final SurgeryID surgeryID;
    private final Specialty specialty;

    public UpdateSpecialty(SurgeryID surgeryID, Specialty specialty) {
        this.surgeryID = surgeryID;
        this.specialty = specialty;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public Specialty getSpecialty() {
        return specialty;
    }
}
