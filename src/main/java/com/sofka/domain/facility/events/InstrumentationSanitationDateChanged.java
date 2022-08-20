package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.InstrumentationID;
import com.sofka.domain.facility.values.SanitationDate;

public class InstrumentationSanitationDateChanged extends DomainEvent {

    private final InstrumentationID instrumentationID;
    private final SanitationDate sanitationDate;

    public InstrumentationSanitationDateChanged(InstrumentationID instrumentationID, SanitationDate sanitationDate) {
        super("sofka.domain.facility.InstrumentationSanitationDateChanged");
        this.instrumentationID = instrumentationID;
        this.sanitationDate = sanitationDate;
    }


    public InstrumentationID getInstrumentationID() {
        return instrumentationID;
    }

    public SanitationDate getSanitationDate() {
        return sanitationDate;
    }
}