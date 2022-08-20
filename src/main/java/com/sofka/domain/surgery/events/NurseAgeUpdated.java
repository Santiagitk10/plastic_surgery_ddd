package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.Age;
import com.sofka.domain.surgery.values.NurseID;

public class NurseAgeUpdated extends DomainEvent {

    private final NurseID nurseID;
    private final Age age;

    public NurseAgeUpdated(NurseID nurseID, Age age) {
        super("sofka.domain.surgery.NurseAgeUpdated");
        this.nurseID = nurseID;
        this.age = age;
    }


    public NurseID getNurseID() {
        return nurseID;
    }

    public Age getAge() {
        return age;
    }
}
