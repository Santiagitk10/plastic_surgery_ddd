package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.FacilityID;
import com.sofka.domain.facility.values.OperatingRoomID;
import com.sofka.domain.facility.values.Status;

public class ChangeOperatingRoomStatus extends Command {

    private final FacilityID facilityID;
    private final OperatingRoomID operatingRoomID;
    private final Status status;

    public ChangeOperatingRoomStatus(FacilityID facilityID, OperatingRoomID operatingRoomID, Status status) {
        this.facilityID = facilityID;
        this.operatingRoomID = operatingRoomID;
        this.status = status;
    }

    public FacilityID getFacilityID() {
        return facilityID;
    }

    public OperatingRoomID getOperatingRoomID() {
        return operatingRoomID;
    }

    public Status getStatus() {
        return status;
    }
}
