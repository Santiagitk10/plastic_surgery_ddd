package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domain.surgery.Surgery;
import com.sofka.domain.surgery.commands.AddPatient;

public class AddPatientUseCase extends UseCase<RequestCommand<AddPatient>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddPatient> addPatientRequestCommand) {
        var command = addPatientRequestCommand.getCommand();
        var surgery = Surgery.from(command.getSurgeryID(), retrieveEvents(command.getSurgeryID().value()));
        surgery.addPatient(command.getPatientID(),command.getName(),command.getAge(),command.getReasonForSurgery(),command.getRh());
        emit().onResponse(new ResponseEvents(surgery.getUncommittedChanges()));
    }

}
