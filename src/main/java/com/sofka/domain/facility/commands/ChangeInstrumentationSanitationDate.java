package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.*;

public class ChangeInstrumentationSanitationDate extends Command {

    private final FacilityID facilityID;
    private final InstrumentationID instrumentationID;
    private final SanitationDate sanitationDate;

    public ChangeInstrumentationSanitationDate(FacilityID facilityID, InstrumentationID instrumentationID, SanitationDate sanitationDate) {
        this.facilityID = facilityID;
        this.instrumentationID = instrumentationID;
        this.sanitationDate = sanitationDate;
    }

    public FacilityID getFacilityID() {
        return facilityID;
    }

    public InstrumentationID getInstrumentationID() {
        return instrumentationID;
    }

    public SanitationDate getSanitationDate() {
        return sanitationDate;
    }
}
