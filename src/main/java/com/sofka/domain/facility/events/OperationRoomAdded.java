package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.*;
import com.sofka.domain.shared.values.Anesthesia;

public class OperationRoomAdded extends DomainEvent {

    private final OperatingRoomID operatingRoomID;
    private final HospitalWing hospitalWing;
    private final Status status;
    private final Anesthesia anesthesia;
    private final Monitors monitors;

    public OperationRoomAdded(OperatingRoomID operatingRoomID, HospitalWing hospitalWing, Status status, Anesthesia anesthesia, Monitors monitors) {
        super("sofka.domain.facility.OperationRoomAdded");
        this.operatingRoomID = operatingRoomID;
        this.hospitalWing = hospitalWing;
        this.status = status;
        this.anesthesia = anesthesia;
        this.monitors = monitors;
    }


    public OperatingRoomID getOperatingRoomID() {
        return operatingRoomID;
    }

    public HospitalWing getHospitalWing() {
        return hospitalWing;
    }

    public Status getStatus() {
        return status;
    }

    public Anesthesia getAnesthesia() {
        return anesthesia;
    }

    public Monitors getMonitors() {
        return monitors;
    }
}
