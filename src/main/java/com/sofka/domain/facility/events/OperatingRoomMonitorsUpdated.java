package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.Monitors;
import com.sofka.domain.facility.values.OperatingRoomID;

public class OperatingRoomMonitorsUpdated extends DomainEvent {

    private final OperatingRoomID operatingRoomID;
    private final Monitors monitors;

    public OperatingRoomMonitorsUpdated(OperatingRoomID operatingRoomID, Monitors monitors) {
        super("sofka.domain.facility.OperatingRoomMonitorsUpdated");
        this.operatingRoomID = operatingRoomID;
        this.monitors = monitors;
    }


    public OperatingRoomID getOperatingRoomID() {
        return operatingRoomID;
    }

    public Monitors getMonitors() {
        return monitors;
    }
}
