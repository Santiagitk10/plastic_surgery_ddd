package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.domain.facility.Facility;
import com.sofka.domain.facility.events.FacilityCreated;
import com.sofka.domain.facility.values.*;


public class AddInstrumentationUseCase extends UseCase<TriggeredEvent<FacilityCreated>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<FacilityCreated> facilityCreatedTriggeredEvent) {
        FacilityCreated event = facilityCreatedTriggeredEvent.getDomainEvent();
        Facility facility = Facility.from(FacilityID.of(event.aggregateRootId()), this.retrieveEvents());
        InstrumentationID instrumentationID = new InstrumentationID();
        Manufacturer manufacturer = new Manufacturer("Stanley");
        Status status = new Status(StatusE.NOT_READY);
        SanitationDate sanitationDate = new SanitationDate("August 31 2022");
        facility.addInstrumentation(instrumentationID, manufacturer, status, sanitationDate);
        emit().onResponse(new ResponseEvents(facility.getUncommittedChanges()));
    }
}



