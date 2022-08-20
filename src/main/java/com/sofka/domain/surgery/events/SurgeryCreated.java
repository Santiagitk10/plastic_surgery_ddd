package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.shared.values.Anesthesia;
import com.sofka.domain.surgery.values.IsFinished;
import com.sofka.domain.surgery.values.Specialty;
import com.sofka.domain.surgery.values.SurgeryDate;

public class SurgeryCreated extends DomainEvent {

    private final Specialty specialty;
    private final Anesthesia anesthesia;
    private final SurgeryDate surgeryDate;
    private final IsFinished isFinished;

    public SurgeryCreated(Specialty specialty, Anesthesia anesthesia, SurgeryDate surgeryDate, IsFinished isFinished) {
        super("sofka.domain.surgery.SurgeryCreated");
        this.specialty = specialty;
        this.anesthesia = anesthesia;
        this.surgeryDate = surgeryDate;
        this.isFinished = isFinished;
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
