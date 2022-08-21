package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domain.facility.commands.AddRecoveryArea;
import com.sofka.domain.facility.events.FacilityCreated;
import com.sofka.domain.facility.events.RecoveryAreaAdded;
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
class AddRecoveryAreaUseCaseTest {


    private final String ROOT_ID = "13579";

    @Mock
    private DomainEventRepository repository;


    @Test
    public void addRecoveryAreaUseCaseTest(){
        //Arrange
        var facilityId = new FacilityID().of(ROOT_ID);
        FacilityCreated facilityCreated = new FacilityCreated(new SurgeryID(),new Name("Leon de Bedut Rocha"),new Ambulances(3), new Location("Campos Orientales"));
        facilityCreated.setAggregateRootId(ROOT_ID);

        AddRecoveryArea command = new AddRecoveryArea(facilityId,new RecoveryAreaID(),new HospitalWing("Sureste Media"),new Status(StatusE.READY),new BedsAvailable(17));
        AddRecoveryAreaUseCase useCase = new AddRecoveryAreaUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(facilityCreated));
        useCase.addRepository(repository);
        //Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong Adding the Recovery Area"))
                .getDomainEvents();

        RecoveryAreaAdded event = (RecoveryAreaAdded) events.get(0);
        //Assert
        Assertions.assertEquals(command.getHospitalWing().value(), event.getHospitalWing().value());

    }
}