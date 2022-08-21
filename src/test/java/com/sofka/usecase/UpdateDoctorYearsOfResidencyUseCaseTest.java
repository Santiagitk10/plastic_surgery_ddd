package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domain.shared.values.Anesthesia;
import com.sofka.domain.shared.values.AnesthesiaE;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.commands.UpdateDoctorYearsOfResidency;
import com.sofka.domain.surgery.events.DoctorAdded;
import com.sofka.domain.surgery.events.DoctorYearsOfResidencyUpdated;
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
class UpdateDoctorYearsOfResidencyUseCaseTest {


    private final String ROOT_ID = "13579";

    @Mock
    private DomainEventRepository repository;


    @Test
    public void updateDoctorNameUseCaseTest(){
        //Arrange
        var surgeryId = new SurgeryID().of(ROOT_ID);
        var doctorID = new DoctorID().of("1234");
        SurgeryCreated surgery = new SurgeryCreated(new Specialty("Liposuction"), new Anesthesia(AnesthesiaE.GENERAL), new SurgeryDate("November 02 2022"), new IsFinished(false));
        surgery.setAggregateRootId(ROOT_ID);
        DoctorAdded doctorAdded = new DoctorAdded(doctorID, new Name("Francisco de Asis"), new Age(45), new YearsOfResidency(23), new Shift(ShiftE.NIGHT));

        UpdateDoctorYearsOfResidency command = new UpdateDoctorYearsOfResidency(surgeryId,doctorID, new YearsOfResidency(24));
        UpdateDoctorYearsOfResidencyUseCase useCase = new UpdateDoctorYearsOfResidencyUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(surgery,doctorAdded));
        useCase.addRepository(repository);
        //Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong updating the Doctor name"))
                .getDomainEvents();

        DoctorYearsOfResidencyUpdated event = (DoctorYearsOfResidencyUpdated) events.get(0);
        //Assert
        Assertions.assertEquals(command.getYearsOfResidency().value(), event.getYearsOfResidency().value());


    }


}