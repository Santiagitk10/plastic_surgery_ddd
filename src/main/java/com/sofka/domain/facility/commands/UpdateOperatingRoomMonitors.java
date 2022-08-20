package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.*;
import com.sofka.domain.shared.values.Anesthesia;

public class UpdateOperatingRoomMonitors extends Command {

    private final FacilityID facilityID;
    private final OperatingRoomID operatingRoomID;
    private final Monitors monitors;

    public UpdateOperatingRoomMonitors(FacilityID facilityID, OperatingRoomID operatingRoomID, Monitors monitors) {
        this.facilityID = facilityID;
        this.operatingRoomID = operatingRoomID;
        this.monitors = monitors;
    }

    public FacilityID getFacilityID() {
        return facilityID;
    }

    public OperatingRoomID getOperatingRoomID() {
        return operatingRoomID;
    }

    public Monitors getMonitors() {
        return monitors;
    }
}
