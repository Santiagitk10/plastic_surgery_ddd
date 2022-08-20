package com.sofka.domain.facility;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domain.facility.values.*;

import java.util.Objects;

public class Instrumentation extends Entity<InstrumentationID> {

    private Manufacturer manufacturer;
    private Status status;
    private SanitationDate sanitationDate;

    public Instrumentation(InstrumentationID instrumentationID, Manufacturer manufacturer, Status status, SanitationDate sanitationDate) {
        super(instrumentationID);
        this.manufacturer = manufacturer;
        this.status = status;
        this.sanitationDate = sanitationDate;
    }


    public void changeManufacturer(Manufacturer manufacturer) {
        this.manufacturer = Objects.requireNonNull(manufacturer);
    }

    public void changeStatus(Status status) {
        this.status = Objects.requireNonNull(status);
    }

    public void changeSanitationDate(SanitationDate sanitationDate) {
        this.sanitationDate = Objects.requireNonNull(sanitationDate);
    }



    public Manufacturer manufacturer() {
        return manufacturer;
    }

    public Status status() {
        return status;
    }

    public SanitationDate sanitationDate() {
        return sanitationDate;
    }
}
