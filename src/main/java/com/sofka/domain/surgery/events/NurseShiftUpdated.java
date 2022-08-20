package com.sofka.domain.surgery.events;


import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.NurseID;
import com.sofka.domain.surgery.values.Shift;

public class NurseShiftUpdated extends DomainEvent {

    private final NurseID nurseID;
    private final Shift shift;

    public NurseShiftUpdated(NurseID nurseID, Shift shift) {
        super("sofka.domain.surgery.NurseShiftUpdated");
        this.nurseID = nurseID;
        this.shift = shift;
    }


    public NurseID getNurseID() {
        return nurseID;
    }

    public Shift getShift() {
        return shift;
    }
}
