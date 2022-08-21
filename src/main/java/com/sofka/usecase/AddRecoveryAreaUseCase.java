package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domain.facility.Facility;
import com.sofka.domain.facility.commands.AddRecoveryArea;
import com.sofka.domain.surgery.Surgery;
import com.sofka.domain.surgery.commands.AddPatient;

public class AddRecoveryAreaUseCase extends UseCase<RequestCommand<AddRecoveryArea>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AddRecoveryArea> addRecoveryAreaRequestCommand) {
        var command = addRecoveryAreaRequestCommand.getCommand();
        var facility = Facility.from(command.getFacilityID(),retrieveEvents(command.getFacilityID().value()));
        facility.addRecoveryArea(command.getRecoveryAreaID(),command.getHospitalWing(),command.getStatus(),command.getBedsAvailable());
        emit().onResponse(new ResponseEvents(facility.getUncommittedChanges()));
    }
}
