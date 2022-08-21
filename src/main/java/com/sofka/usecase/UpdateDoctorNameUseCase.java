package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domain.surgery.Surgery;
import com.sofka.domain.surgery.commands.UpdateDoctorName;

public class UpdateDoctorNameUseCase extends UseCase<RequestCommand<UpdateDoctorName>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<UpdateDoctorName> updateDoctorNameRequestCommand) {
        var command = updateDoctorNameRequestCommand.getCommand();
        var surgery = Surgery.from(command.getSurgeryID(), retrieveEvents(command.getSurgeryID().value()));
        surgery.updateDoctorName(command.getDoctorID(), command.getName());
        emit().onResponse(new ResponseEvents(surgery.getUncommittedChanges()));
    }
}
