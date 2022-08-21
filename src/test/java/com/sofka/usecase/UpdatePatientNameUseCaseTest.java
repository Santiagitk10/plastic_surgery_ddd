package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domain.shared.values.Anesthesia;
import com.sofka.domain.shared.values.AnesthesiaE;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.commands.UpdateDoctorName;
import com.sofka.domain.surgery.commands.UpdatePatientName;
import com.sofka.domain.surgery.events.*;
import com.sofka.domain.surgery.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UpdatePatientNameUseCaseTest {


    private final String ROOT_ID = "13579";

    @Mock
    private DomainEventRepository repository;


    @Test
    public void updatePatientNameUseCaseTest(){
        //Arrange
        var surgeryId = new SurgeryID().of(ROOT_ID);
        var patientID = new PatientID().of("1234");
        SurgeryCreated surgery = new SurgeryCreated(new Specialty("Liposuction"), new Anesthesia(AnesthesiaE.GENERAL), new SurgeryDate("November 02 2022"), new IsFinished(false));
        surgery.setAggregateRootId(ROOT_ID);
        PatientAdded patientAdded = new PatientAdded(patientID, new Name("Federico Santodomingo"),new Age(67),new ReasonForSurgery("Overweight"),new Rh("O-"));

        UpdatePatientName command = new UpdatePatientName(surgeryId,patientID,new Name("Juan Carlos Ferrero"));
        UpdatePatientNameUseCase useCase = new UpdatePatientNameUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(surgery,patientAdded));
        useCase.addRepository(repository);
        //Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong updating the Doctor name"))
                .getDomainEvents();

        PatientNameUpdated event = (PatientNameUpdated) events.get(0);
        //Assert
        Assertions.assertEquals(command.getName().value(), event.getName().value());


    }


}