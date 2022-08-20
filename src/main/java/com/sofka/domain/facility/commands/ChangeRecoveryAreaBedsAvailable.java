package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.*;

public class ChangeRecoveryAreaBedsAvailable extends Command {

    private final FacilityID facilityID;
    private final RecoveryAreaID recoveryAreaID;
    private final BedsAvailable bedsAvailable;

    public ChangeRecoveryAreaBedsAvailable(FacilityID facilityID, RecoveryAreaID recoveryAreaID, BedsAvailable bedsAvailable) {
        this.facilityID = facilityID;
        this.recoveryAreaID = recoveryAreaID;
        this.bedsAvailable = bedsAvailable;
    }

    public FacilityID getFacilityID() {
        return facilityID;
    }

    public RecoveryAreaID getRecoveryAreaID() {
        return recoveryAreaID;
    }

    public BedsAvailable getBedsAvailable() {
        return bedsAvailable;
    }
}
