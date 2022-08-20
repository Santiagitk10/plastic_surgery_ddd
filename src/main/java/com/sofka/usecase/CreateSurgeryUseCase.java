package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domain.surgery.Surgery;
import com.sofka.domain.surgery.commands.CreateSurgery;

public class CreateSurgeryUseCase extends UseCase<RequestCommand<CreateSurgery>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateSurgery> createSurgeryRequestCommand) {
        var createSurgeryCommand =createSurgeryRequestCommand.getCommand();
        var surgery = new Surgery(
            createSurgeryCommand.getSurgeryID(),
                createSurgeryCommand.getSpecialty(),
                createSurgeryCommand.getAnesthesia(),
                createSurgeryCommand.getSurgeryDate(),
                createSurgeryCommand.getIsFinished()
        );

        emit().onResponse(new ResponseEvents(surgery.getUncommittedChanges()));
    }

}
