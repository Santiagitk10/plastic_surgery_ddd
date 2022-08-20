package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.OperatingRoomID;
import com.sofka.domain.facility.values.Status;

public class OperatingRoomStatusChanged extends DomainEvent {

    private final OperatingRoomID operatingRoomID;
    private final Status status;

    public OperatingRoomStatusChanged(OperatingRoomID operatingRoomID, Status status) {
        super("sofka.domain.facility.OperatingRoomStatusChanged");
        this.operatingRoomID = operatingRoomID;
        this.status = status;
    }


    public OperatingRoomID getOperatingRoomID() {
        return operatingRoomID;
    }

    public Status getStatus() {
        return status;
    }
}
