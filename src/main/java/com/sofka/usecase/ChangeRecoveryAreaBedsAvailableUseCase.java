package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domain.facility.Facility;
import com.sofka.domain.facility.commands.ChangeRecoveryAreaBedsAvailable;

public class ChangeRecoveryAreaBedsAvailableUseCase extends UseCase<RequestCommand<ChangeRecoveryAreaBedsAvailable>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<ChangeRecoveryAreaBedsAvailable> changeRecoveryAreaBedsAvailableRequestCommand) {
        var command = changeRecoveryAreaBedsAvailableRequestCommand.getCommand();
        var facility = Facility.from(command.getFacilityID(), retrieveEvents(command.getFacilityID().value()));
        facility.changeRecoveryAreaBedsAvailable(command.getRecoveryAreaID(),command.getBedsAvailable());
        emit().onResponse(new ResponseEvents(facility.getUncommittedChanges()));
    }
}



