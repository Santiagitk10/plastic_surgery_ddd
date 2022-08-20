package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.HospitalWing;
import com.sofka.domain.facility.values.OperatingRoomID;

public class OperatingRoomHospitalWingUpdated extends DomainEvent {

    private final OperatingRoomID operatingRoomID;
    private final HospitalWing hospitalWing;

    public OperatingRoomHospitalWingUpdated(OperatingRoomID operatingRoomID, HospitalWing hospitalWing) {
        super("sofka.domain.facility.OperatingRoomHospitalWingUpdated");
        this.operatingRoomID = operatingRoomID;
        this.hospitalWing = hospitalWing;
    }


    public OperatingRoomID getOperatingRoomID() {
        return operatingRoomID;
    }

    public HospitalWing getHospitalWing() {
        return hospitalWing;
    }
}
