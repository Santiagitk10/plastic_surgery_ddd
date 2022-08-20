package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.domain.facility.events.FacilityCreated;
import com.sofka.domain.facility.events.InstrumentationAdded;
import com.sofka.domain.facility.values.Ambulances;
import com.sofka.domain.facility.values.Location;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.values.SurgeryID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AddInstrumentationUseCaseTest {

    private final String ROOT_ID = "13579";

    @Mock
    private DomainEventRepository repository;

    @Test
    void addInstrumentationUseCaseTest(){
        //Arrange
        FacilityCreated event = new FacilityCreated(new SurgeryID(), new Name("Salazar Restrepo Clinic"), new Ambulances(4), new Location("GeorgeTown North"));
        event.setAggregateRootId(ROOT_ID);
        var useCase = new AddInstrumentationUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(event));
        useCase.addRepository(repository);
        //Act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();

        InstrumentationAdded responseEvent = (InstrumentationAdded) events.get(0);
        //Assert
        Assertions.assertEquals(responseEvent.getManufacturer().value(), "Stanley");
        Mockito.verify(repository).getEventsBy(ROOT_ID);

    }

}