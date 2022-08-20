package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.Surgery;
import com.sofka.domain.surgery.events.SurgeryCreated;
import com.sofka.domain.surgery.values.*;

public class AddDoctorUseCase extends UseCase<TriggeredEvent<SurgeryCreated>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<SurgeryCreated> surgeryCreatedTriggeredEvent) {

        SurgeryCreated event =surgeryCreatedTriggeredEvent.getDomainEvent();
        Surgery surgery = Surgery.from(SurgeryID.of(event.aggregateRootId()), this.retrieveEvents());
        DoctorID doctorID = new DoctorID();
        Name name = new Name("Santiago Sierra");
        Age age = new Age(55);
        YearsOfResidency yearsOfResidency = new YearsOfResidency(23);
        Shift shift = new Shift(ShiftE.NIGHT);
        surgery.addDoctor(doctorID,name,age,yearsOfResidency,shift);
        emit().onResponse(new ResponseEvents(surgery.getUncommittedChanges()));

    }
}
