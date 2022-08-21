package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domain.surgery.Surgery;
import com.sofka.domain.surgery.commands.UpdateDoctorName;
import com.sofka.domain.surgery.commands.UpdatePatientName;

public class UpdatePatientNameUseCase extends UseCase<RequestCommand<UpdatePatientName>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<UpdatePatientName> updatePatientNameRequestCommand) {
        var command = updatePatientNameRequestCommand.getCommand();
        var surgery = Surgery.from(command.getSurgeryID(), retrieveEvents(command.getSurgeryID().value()));
        surgery.updatePatientName(command.getPatientID(),command.getName());
        emit().onResponse(new ResponseEvents(surgery.getUncommittedChanges()));
    }
}
