package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.*;

public class InstrumentationAdded extends DomainEvent {

    private final InstrumentationID instrumentationID;
    private final Manufacturer manufacturer;
    private final Status status;
    private final SanitationDate sanitationDate;

    public InstrumentationAdded(InstrumentationID instrumentationID, Manufacturer manufacturer, Status status, SanitationDate sanitationDate) {
        super("sofka.domain.facility.InstrumentationAdded");
        this.instrumentationID = instrumentationID;
        this.manufacturer = manufacturer;
        this.status = status;
        this.sanitationDate = sanitationDate;
    }


    public InstrumentationID getInstrumentationID() {
        return instrumentationID;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Status getStatus() {
        return status;
    }

    public SanitationDate getSanitationDate() {
        return sanitationDate;
    }
}
