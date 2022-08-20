package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.Specialty;

public class SpecialtyUpdated extends DomainEvent {

    private final Specialty specialty;

    public SpecialtyUpdated(Specialty specialty) {
        super("sofka.domain.surgery.SpecialtyUpdated");
        this.specialty = specialty;
    }


    public Specialty getSpecialty() {
        return specialty;
    }
}
