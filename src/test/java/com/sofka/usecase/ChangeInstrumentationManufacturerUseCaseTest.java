package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domain.facility.commands.ChangeInstrumentationManufacturer;
import com.sofka.domain.facility.events.FacilityCreated;
import com.sofka.domain.facility.events.InstrumentationAdded;
import com.sofka.domain.facility.events.InstrumentationManufacturerChanged;
import com.sofka.domain.facility.values.*;
import com.sofka.domain.shared.values.Name;
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
class ChangeInstrumentationManufacturerUseCaseTest {


    private final String ROOT_ID = "13579";

    @Mock
    private DomainEventRepository repository;


    @Test
    public void changeInstrumentationManufacturerUseCaseTest(){
        //Arrange
        var facilityId = new FacilityID().of(ROOT_ID);
        var instrumentationID = new InstrumentationID().of("1234");
        FacilityCreated facilityCreated = new FacilityCreated(new SurgeryID(),new Name("SaintPatrick Loyola"),new Ambulances(2),new Location("Montreal"));
        facilityCreated.setAggregateRootId(ROOT_ID);
        InstrumentationAdded instrumentationAdded = new InstrumentationAdded(instrumentationID,new Manufacturer("Milkwakee"),new Status(StatusE.NOT_READY),new SanitationDate("July 24 2022"));

        ChangeInstrumentationManufacturer command = new ChangeInstrumentationManufacturer(facilityId,instrumentationID,new Manufacturer("Medical Industries"));
        ChangeInstrumentationManufacturerUseCase useCase = new ChangeInstrumentationManufacturerUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(facilityCreated,instrumentationAdded));
        useCase.addRepository(repository);
        //Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong Changing the Instrumentation Manufacturer"))
                .getDomainEvents();

        InstrumentationManufacturerChanged event = (InstrumentationManufacturerChanged) events.get(0);
        //Assert
        Assertions.assertEquals(command.getManufacturer().value(), event.getManufacturer().value());


    }


}




