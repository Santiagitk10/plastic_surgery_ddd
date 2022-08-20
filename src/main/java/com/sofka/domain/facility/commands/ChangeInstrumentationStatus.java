package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.FacilityID;
import com.sofka.domain.facility.values.InstrumentationID;
import com.sofka.domain.facility.values.Status;

public class ChangeInstrumentationStatus extends Command {

    private final FacilityID facilityID;
    private final InstrumentationID instrumentationID;
    private final Status status;

    public ChangeInstrumentationStatus(FacilityID facilityID, InstrumentationID instrumentationID, Status status) {
        this.facilityID = facilityID;
        this.instrumentationID = instrumentationID;
        this.status = status;
    }

    public FacilityID getFacilityID() {
        return facilityID;
    }

    public InstrumentationID getInstrumentationID() {
        return instrumentationID;
    }

    public Status getStatus() {
        return status;
    }
}
