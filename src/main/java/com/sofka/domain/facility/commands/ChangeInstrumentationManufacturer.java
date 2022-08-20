package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.FacilityID;
import com.sofka.domain.facility.values.InstrumentationID;
import com.sofka.domain.facility.values.Manufacturer;

public class ChangeInstrumentationManufacturer extends Command {

    private final FacilityID facilityID;
    private final InstrumentationID instrumentationID;
    private final Manufacturer manufacturer;

    public ChangeInstrumentationManufacturer(FacilityID facilityID, InstrumentationID instrumentationID, Manufacturer manufacturer) {
        this.facilityID = facilityID;
        this.instrumentationID = instrumentationID;
        this.manufacturer = manufacturer;
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
}
