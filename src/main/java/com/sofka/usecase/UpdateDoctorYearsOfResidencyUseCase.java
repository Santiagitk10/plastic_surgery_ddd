package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domain.surgery.Surgery;
import com.sofka.domain.surgery.commands.UpdateDoctorName;
import com.sofka.domain.surgery.commands.UpdateDoctorYearsOfResidency;

public class UpdateDoctorYearsOfResidencyUseCase extends UseCase<RequestCommand<UpdateDoctorYearsOfResidency>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<UpdateDoctorYearsOfResidency> updateDoctorYearsOfResidencyRequestCommand) {
        var command = updateDoctorYearsOfResidencyRequestCommand.getCommand();
        var surgery = Surgery.from(command.getSurgeryID(), retrieveEvents(command.getSurgeryID().value()));
        surgery.updateDoctorYearsOfResidency(command.getDoctorID(),command.getYearsOfResidency());
        emit().onResponse(new ResponseEvents(surgery.getUncommittedChanges()));
    }
}


