package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.SurgeryDate;

public class SurgeryDateChanged extends DomainEvent {

    private final SurgeryDate surgeryDate;

    public SurgeryDateChanged(SurgeryDate surgeryDate) {
        super("sofka.domain.surgery.SurgeryDateChanged");
        this.surgeryDate = surgeryDate;
    }



    public SurgeryDate getSurgeryDate() {
        return surgeryDate;
    }
}
