package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domain.facility.commands.CreateFacility;
import com.sofka.domain.facility.events.FacilityCreated;
import com.sofka.domain.facility.values.Ambulances;
import com.sofka.domain.facility.values.Location;
import com.sofka.domain.shared.values.Anesthesia;
import com.sofka.domain.shared.values.AnesthesiaE;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.commands.CreateSurgery;
import com.sofka.domain.surgery.events.SurgeryCreated;
import com.sofka.domain.surgery.values.IsFinished;
import com.sofka.domain.surgery.values.Specialty;
import com.sofka.domain.surgery.values.SurgeryDate;
import com.sofka.domain.surgery.values.SurgeryID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateFacilityUseCaseTest {

    @Test
    public void createFacilityUseCaseTest(){

        //Arrange
        CreateFacility command = new CreateFacility(
                new SurgeryID(),
                new Name("Saint Germain Clinic"),
                new Ambulances(5),
                new Location("Toronto Mississauga")
        );
        CreateFacilityUseCase useCase = new CreateFacilityUseCase();
        //Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating the Facility"))
                .getDomainEvents();

        FacilityCreated event = (FacilityCreated) events.get(0);
        //Assert
        Assertions.assertEquals(command.getClinicName().value(), event.getClinicName().value());

    }

}