package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.*;

public class AddInstrumentation extends Command {

    private final FacilityID facilityID;
    private final InstrumentationID instrumentationID;
    private final Manufacturer manufacturer;
    private final Status status;
    private final SanitationDate sanitationDate;

    public AddInstrumentation(FacilityID facilityID, InstrumentationID instrumentationID, Manufacturer manufacturer, Status status, SanitationDate sanitationDate) {
        this.facilityID = facilityID;
        this.instrumentationID = instrumentationID;
        this.manufacturer = manufacturer;
        this.status = status;
        this.sanitationDate = sanitationDate;
    }

    public FacilityID getFacilityID() {
        return facilityID;
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
