package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domain.facility.Facility;
import com.sofka.domain.facility.commands.CreateFacility;


public class CreateFacilityUseCase extends UseCase<RequestCommand<CreateFacility>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateFacility> createFacilityRequestCommand) {
        var createFacilityCommand = createFacilityRequestCommand.getCommand();
        var facility = new Facility(
                createFacilityCommand.getFacilityID(),
                createFacilityCommand.getSurgeryID(),
                createFacilityCommand.getClinicName(),
                createFacilityCommand.getAmbulances(),
                createFacilityCommand.getLocation()
        );

        emit().onResponse(new ResponseEvents(facility.getUncommittedChanges()));
    }

}




