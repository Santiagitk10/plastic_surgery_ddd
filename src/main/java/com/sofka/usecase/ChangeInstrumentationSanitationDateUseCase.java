package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domain.facility.Facility;
import com.sofka.domain.facility.commands.ChangeInstrumentationManufacturer;
import com.sofka.domain.facility.commands.ChangeInstrumentationSanitationDate;

public class ChangeInstrumentationSanitationDateUseCase extends UseCase<RequestCommand<ChangeInstrumentationSanitationDate>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<ChangeInstrumentationSanitationDate> changeInstrumentationSanitationDateRequestCommand) {
        var command = changeInstrumentationSanitationDateRequestCommand.getCommand();
        var facility = Facility.from(command.getFacilityID(), retrieveEvents(command.getFacilityID().value()));
        facility.changeInstrumentationSanitationDate(command.getInstrumentationID(),command.getSanitationDate());
        emit().onResponse(new ResponseEvents(facility.getUncommittedChanges()));
    }
}
