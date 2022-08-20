package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.BedsAvailable;
import com.sofka.domain.facility.values.RecoveryAreaID;

public class RecoveryAreaBedsAvailableChanged extends DomainEvent {

    private final RecoveryAreaID recoveryAreaID;
    private final BedsAvailable bedsAvailable;

    public RecoveryAreaBedsAvailableChanged(RecoveryAreaID recoveryAreaID, BedsAvailable bedsAvailable) {
        super("sofka.domain.facility.RecoveryAreaBedsAvailableChanged");
        this.recoveryAreaID = recoveryAreaID;
        this.bedsAvailable = bedsAvailable;
    }


    public RecoveryAreaID getRecoveryAreaID() {
        return recoveryAreaID;
    }

    public BedsAvailable getBedsAvailable() {
        return bedsAvailable;
    }
}
