package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.RecoveryAreaID;
import com.sofka.domain.facility.values.Status;

public class RecoveryAreaStatusChanged extends DomainEvent {

    private final RecoveryAreaID recoveryAreaID;
    private final Status status;

    public RecoveryAreaStatusChanged(RecoveryAreaID recoveryAreaID, Status status) {
        super("sofka.domain.facility.RecoveryAreaStatusChanged");
        this.recoveryAreaID = recoveryAreaID;
        this.status = status;
    }


    public RecoveryAreaID getRecoveryAreaID() {
        return recoveryAreaID;
    }

    public Status getStatus() {
        return status;
    }
}
