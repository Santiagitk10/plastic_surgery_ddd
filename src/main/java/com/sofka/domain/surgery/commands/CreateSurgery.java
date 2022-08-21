package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.shared.values.Anesthesia;
import com.sofka.domain.surgery.values.IsFinished;
import com.sofka.domain.surgery.values.Specialty;
import com.sofka.domain.surgery.values.SurgeryDate;
import com.sofka.domain.surgery.values.SurgeryID;

public class CreateSurgery extends Command {

    private final SurgeryID surgeryID;
    private final Specialty specialty;
    private final Anesthesia anesthesia;
    private final SurgeryDate surgeryDate;
    private final IsFinished isFinished;


    public CreateSurgery(Specialty specialty, Anesthesia anesthesia, SurgeryDate surgeryDate, IsFinished isFinished) {
        this.surgeryID = new SurgeryID();
        this.specialty = specialty;
        this.anesthesia = anesthesia;
        this.surgeryDate = surgeryDate;
        this.isFinished = isFinished;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public Anesthesia getAnesthesia() {
        return anesthesia;
    }

    public SurgeryDate getSurgeryDate() {
        return surgeryDate;
    }

    public IsFinished getIsFinished() {
        return isFinished;
    }
}
