package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.FacilityID;
import com.sofka.domain.facility.values.HospitalWing;
import com.sofka.domain.facility.values.OperatingRoomID;

public class UpdateOperatingRoomHospitalWing extends Command {

    private final FacilityID facilityID;
    private final OperatingRoomID operatingRoomID;
    private final HospitalWing hospitalWing;

    public UpdateOperatingRoomHospitalWing(FacilityID facilityID, OperatingRoomID operatingRoomID, HospitalWing hospitalWing) {
        this.facilityID = facilityID;
        this.operatingRoomID = operatingRoomID;
        this.hospitalWing = hospitalWing;
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
}
