package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.domain.shared.values.Anesthesia;
import com.sofka.domain.shared.values.AnesthesiaE;
import com.sofka.domain.surgery.events.DoctorAdded;
import com.sofka.domain.surgery.events.SurgeryCreated;
import com.sofka.domain.surgery.values.IsFinished;
import com.sofka.domain.surgery.values.Specialty;
import com.sofka.domain.surgery.values.SurgeryDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AddDoctorUseCaseTest {

    private final String ROOT_ID = "24680";

    @Mock
    private DomainEventRepository repository;

    @Test
    void addDoctorUseCaseTest(){
        //Arrange
        SurgeryCreated event = new SurgeryCreated(new Specialty("Liposuction"),new Anesthesia(AnesthesiaE.GENERAL), new SurgeryDate("September  03 2022"), new IsFinished(false));
        event.setAggregateRootId(ROOT_ID);
        var useCase = new AddDoctorUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(event));
        useCase.addRepository(repository);
        //Act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();

        DoctorAdded responseEvent = (DoctorAdded) events.get(0);
        //Assert
        Assertions.assertEquals(responseEvent.getName().value(), "Santiago Sierra");
        Mockito.verify(repository).getEventsBy(ROOT_ID);

    }

}