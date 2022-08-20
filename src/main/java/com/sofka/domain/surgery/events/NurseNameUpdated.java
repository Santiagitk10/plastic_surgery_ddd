package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.NurseID;

public class NurseNameUpdated extends DomainEvent {

    private final NurseID nurseID;
    private final Name name;

    public NurseNameUpdated(NurseID nurseID, Name name) {
        super("sofka.domain.surgery.NurseNameUpdated");
        this.nurseID = nurseID;
        this.name = name;
    }


    public NurseID getNurseID() {
        return nurseID;
    }

    public Name getName() {
        return name;
    }
}
