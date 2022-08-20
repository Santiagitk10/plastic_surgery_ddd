package com.sofka.domain.surgery.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.shared.values.Anesthesia;
import com.sofka.domain.surgery.values.SurgeryID;

public class ChangeAnesthesia extends Command {

    private final SurgeryID surgeryID;
    private final Anesthesia anesthesia;

    public ChangeAnesthesia(SurgeryID surgeryID, Anesthesia anesthesia) {
        this.surgeryID = surgeryID;
        this.anesthesia = anesthesia;
    }

    public SurgeryID getSurgeryID() {
        return surgeryID;
    }

    public Anesthesia getAnesthesia() {
        return anesthesia;
    }
}
