package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domain.shared.values.Anesthesia;
import com.sofka.domain.shared.values.AnesthesiaE;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.commands.AddPatient;
import com.sofka.domain.surgery.events.PatientAdded;
import com.sofka.domain.surgery.events.SurgeryCreated;
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
class AddPatientUseCaseTest {


    private final String ROOT_ID = "13579";

    @Mock
    private DomainEventRepository repository;


    @Test
    public void addPatientUseCaseTest(){
        //Arrange
        var surgeryId = new SurgeryID().of(ROOT_ID);
        SurgeryCreated surgery = new SurgeryCreated(new Specialty("Liposuction"), new Anesthesia(AnesthesiaE.GENERAL), new SurgeryDate("November 02 2022"), new IsFinished(false));
        surgery.setAggregateRootId(ROOT_ID);

        AddPatient command = new AddPatient(surgeryId,new PatientID(),new Name("Juan Carlos Ferrero"), new Age(25),new ReasonForSurgery("Wanted to be pretier"),new Rh("A+"));
        AddPatientUseCase useCase = new AddPatientUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(surgery));
        useCase.addRepository(repository);
        //Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong Adding the Patient"))
                .getDomainEvents();

        PatientAdded event = (PatientAdded) events.get(0);
        //Assert
        Assertions.assertEquals(command.getName().value(), event.getName().value());

    }
}










