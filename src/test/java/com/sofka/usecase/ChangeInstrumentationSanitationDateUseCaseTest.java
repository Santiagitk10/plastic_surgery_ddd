package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domain.facility.commands.ChangeInstrumentationManufacturer;
import com.sofka.domain.facility.commands.ChangeInstrumentationSanitationDate;
import com.sofka.domain.facility.events.FacilityCreated;
import com.sofka.domain.facility.events.InstrumentationAdded;
import com.sofka.domain.facility.events.InstrumentationManufacturerChanged;
import com.sofka.domain.facility.events.InstrumentationSanitationDateChanged;
import com.sofka.domain.facility.values.*;
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
class ChangeInstrumentationSanitationDateUseCaseTest {


    private final String ROOT_ID = "13579";

    @Mock
    private DomainEventRepository repository;


    @Test
    public void changeInstrumentationSanitationDateUseCaseTest(){
        //Arrange
        var facilityId = new FacilityID().of(ROOT_ID);
        var instrumentationID = new InstrumentationID().of("1234");
        FacilityCreated facilityCreated = new FacilityCreated(new SurgeryID(),new Name("SaintPatrick Loyola"),new Ambulances(2),new Location("Montreal"));
        facilityCreated.setAggregateRootId(ROOT_ID);
        InstrumentationAdded instrumentationAdded = new InstrumentationAdded(instrumentationID,new Manufacturer("Milkwakee"),new Status(StatusE.NOT_READY),new SanitationDate("July 24 2022"));

        ChangeInstrumentationSanitationDate command = new ChangeInstrumentationSanitationDate(facilityId,instrumentationID,new SanitationDate("July 31 2022"));
        ChangeInstrumentationSanitationDateUseCase useCase = new ChangeInstrumentationSanitationDateUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(facilityCreated,instrumentationAdded));
        useCase.addRepository(repository);
        //Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong Changing the Instrumentation Sanitation Date"))
                .getDomainEvents();

        InstrumentationSanitationDateChanged event = (InstrumentationSanitationDateChanged) events.get(0);
        //Assert
        Assertions.assertEquals(command.getSanitationDate().value(), event.getSanitationDate().value());


    }


}




