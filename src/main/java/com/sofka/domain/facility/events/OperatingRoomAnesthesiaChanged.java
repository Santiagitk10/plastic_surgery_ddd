package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.OperatingRoomID;
import com.sofka.domain.shared.values.Anesthesia;

public class OperatingRoomAnesthesiaChanged extends DomainEvent {

    private final OperatingRoomID operatingRoomID;
    private final Anesthesia anesthesia;

    public OperatingRoomAnesthesiaChanged(OperatingRoomID operatingRoomID, Anesthesia anesthesia) {
        super("sofka.domain.facility.OperatingRoomAnesthesiaChanged");
        this.operatingRoomID = operatingRoomID;
        this.anesthesia = anesthesia;
    }


    public OperatingRoomID getOperatingRoomID() {
        return operatingRoomID;
    }

    public Anesthesia getAnesthesia() {
        return anesthesia;
    }
}
