package com.sofka.domain.surgery.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.surgery.values.IsFinished;

public class SurgeryFinished extends DomainEvent {

    private final IsFinished isFinished;

    public SurgeryFinished(IsFinished isFinished) {
        super("sofka.domain.surgery.SurgeryFinished");
        this.isFinished = isFinished;
    }


    public IsFinished getIsFinished() {
        return isFinished;
    }
}
