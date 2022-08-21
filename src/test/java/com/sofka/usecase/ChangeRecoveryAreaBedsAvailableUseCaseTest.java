package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domain.facility.commands.ChangeRecoveryAreaBedsAvailable;
import com.sofka.domain.facility.events.*;
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
class ChangeRecoveryAreaBedsAvailableUseCaseTest {


    private final String ROOT_ID = "13579";

    @Mock
    private DomainEventRepository repository;


    @Test
    public void changeRecoveryAreaBedsAvailableUseCaseTest(){
        //Arrange
        var facilityId = new FacilityID().of(ROOT_ID);
        var recoveryAreaID = new RecoveryAreaID().of("1234");
        FacilityCreated facilityCreated = new FacilityCreated(new SurgeryID(),new Name("SaintPatrick Loyola"),new Ambulances(2),new Location("Montreal"));
        facilityCreated.setAggregateRootId(ROOT_ID);
        RecoveryAreaAdded recoveryAreaAdded = new RecoveryAreaAdded(recoveryAreaID,new HospitalWing("Francisco De Asis2 Wing"),new Status(StatusE.READY),new BedsAvailable(23));

        ChangeRecoveryAreaBedsAvailable command = new ChangeRecoveryAreaBedsAvailable(facilityId,recoveryAreaID,new BedsAvailable(20));
        ChangeRecoveryAreaBedsAvailableUseCase useCase = new ChangeRecoveryAreaBedsAvailableUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(facilityCreated,recoveryAreaAdded));
        useCase.addRepository(repository);
        //Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong Changing the Beds Available in the Recovering Area"))
                .getDomainEvents();

        RecoveryAreaBedsAvailableChanged event = (RecoveryAreaBedsAvailableChanged) events.get(0);
        //Assert
        Assertions.assertEquals(command.getBedsAvailable().value(), event.getBedsAvailable().value());


    }


}





