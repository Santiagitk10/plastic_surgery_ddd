package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.shared.values.Name;

public class ClinicNameUpdated extends DomainEvent {

    private final Name clinicName;

    public ClinicNameUpdated(Name clinicName) {
        super("sofka.domain.facility.ClinicNameUpdated");
        this.clinicName = clinicName;
    }


    public Name getClinicName() {
        return clinicName;
    }
}
