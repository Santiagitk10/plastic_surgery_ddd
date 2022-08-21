package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domain.facility.Facility;
import com.sofka.domain.facility.commands.ChangeInstrumentationManufacturer;

public class ChangeInstrumentationManufacturerUseCase extends UseCase<RequestCommand<ChangeInstrumentationManufacturer>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<ChangeInstrumentationManufacturer> changeInstrumentationManufacturerRequestCommand) {
        var command = changeInstrumentationManufacturerRequestCommand.getCommand();
        var facility = Facility.from(command.getFacilityID(), retrieveEvents(command.getFacilityID().value()));
        facility.changeInstrumentationManufacturer(command.getInstrumentationID(),command.getManufacturer());
        emit().onResponse(new ResponseEvents(facility.getUncommittedChanges()));
    }
}


