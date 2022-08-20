package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.InstrumentationID;
import com.sofka.domain.facility.values.Manufacturer;

public class InstrumentationManufacturerChanged extends DomainEvent {

    private final InstrumentationID instrumentationID;
    private final Manufacturer manufacturer;

    public InstrumentationManufacturerChanged(InstrumentationID instrumentationID, Manufacturer manufacturer) {
        super("sofka.domain.facility.");
        this.instrumentationID = instrumentationID;
        this.manufacturer = manufacturer;
    }


    public InstrumentationID getInstrumentationID() {
        return instrumentationID;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}
