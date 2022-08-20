package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.NurseID;
import com.sofka.domain.surgery.values.YearsOfResidency;

public class NurseYearsOfResidencyUpdated extends DomainEvent {

    private final NurseID nurseID;
    private final YearsOfResidency yearsOfResidency;

    public NurseYearsOfResidencyUpdated(NurseID nurseID, YearsOfResidency yearsOfResidency) {
        super("sofka.domain.surgery.NurseYearsOfResidencyUpdated");
        this.nurseID = nurseID;
        this.yearsOfResidency = yearsOfResidency;
    }


    public NurseID getNurseID() {
        return nurseID;
    }

    public YearsOfResidency getYearsOfResidency() {
        return yearsOfResidency;
    }
}
