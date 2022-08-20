package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.shared.values.Anesthesia;

public class AnesthesiaChanged extends DomainEvent {

    private final Anesthesia anesthesia;

    public AnesthesiaChanged(Anesthesia anesthesia) {
        super("sofka.domain.surgery.AnesthesiaChanged");
        this.anesthesia = anesthesia;
    }



    public Anesthesia getAnesthesia() {
        return anesthesia;
    }
}
