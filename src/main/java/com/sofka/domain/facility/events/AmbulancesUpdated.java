package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.Ambulances;

public class AmbulancesUpdated extends DomainEvent {

    private final Ambulances ambulances;

    public AmbulancesUpdated(Ambulances ambulances) {
        super("sofka.domain.facility.AmbulancesUpdated");
        this.ambulances = ambulances;
    }


    public Ambulances getAmbulances() {
        return ambulances;
    }
}