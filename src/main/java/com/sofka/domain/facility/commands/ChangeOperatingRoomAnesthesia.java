package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.*;
import com.sofka.domain.shared.values.Anesthesia;

public class ChangeOperatingRoomAnesthesia extends Command {

    private final FacilityID facilityID;
    private final OperatingRoomID operatingRoomID;
    private final Anesthesia anesthesia;

    public ChangeOperatingRoomAnesthesia(FacilityID facilityID, OperatingRoomID operatingRoomID, Anesthesia anesthesia) {
        this.facilityID = facilityID;
        this.operatingRoomID = operatingRoomID;
        this.anesthesia = anesthesia;
    }

    public FacilityID getFacilityID() {
        return facilityID;
    }

    public OperatingRoomID getOperatingRoomID() {
        return operatingRoomID;
    }

    public Anesthesia getAnesthesia() {
        return anesthesia;
    }
}
