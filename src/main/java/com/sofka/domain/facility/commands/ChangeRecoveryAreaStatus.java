package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.FacilityID;
import com.sofka.domain.facility.values.RecoveryAreaID;
import com.sofka.domain.facility.values.Status;

public class ChangeRecoveryAreaStatus extends Command {

    private final FacilityID facilityID;
    private final RecoveryAreaID recoveryAreaID;
    private final Status status;

    public ChangeRecoveryAreaStatus(FacilityID facilityID, RecoveryAreaID recoveryAreaID, Status status) {
        this.facilityID = facilityID;
        this.recoveryAreaID = recoveryAreaID;
        this.status = status;
    }

    public FacilityID getFacilityID() {
        return facilityID;
    }

    public RecoveryAreaID getRecoveryAreaID() {
        return recoveryAreaID;
    }

    public Status getStatus() {
        return status;
    }
}
