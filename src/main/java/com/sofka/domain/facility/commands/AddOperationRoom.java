package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.*;
import com.sofka.domain.shared.values.Anesthesia;

public class AddOperationRoom extends Command {

    private final FacilityID facilityID;
    private final OperatingRoomID operatingRoomID;
    private final HospitalWing hospitalWing;
    private final Status status;
    private final Anesthesia anesthesia;
    private final Monitors monitors;

    public AddOperationRoom(FacilityID facilityID, OperatingRoomID operatingRoomID, HospitalWing hospitalWing, Status status, Anesthesia anesthesia, Monitors monitors) {
        this.facilityID = facilityID;
        this.operatingRoomID = operatingRoomID;
        this.hospitalWing = hospitalWing;
        this.status = status;
        this.anesthesia = anesthesia;
        this.monitors = monitors;
    }

    public FacilityID getFacilityID() {
        return facilityID;
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
