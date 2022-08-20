package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.InstrumentationID;
import com.sofka.domain.facility.values.Status;

public class InstrumentationStatusChanged extends DomainEvent {

    private final InstrumentationID instrumentationID;
    private final Status status;

    public InstrumentationStatusChanged(InstrumentationID instrumentationID, Status status) {
        super("sofka.domain.facility.InstrumentationStatusChanged");
        this.instrumentationID = instrumentationID;
        this.status = status;
    }


    public InstrumentationID getInstrumentationID() {
        return instrumentationID;
    }

    public Status getStatus() {
        return status;
    }
}
