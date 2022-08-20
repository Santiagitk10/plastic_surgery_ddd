package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domain.shared.values.Anesthesia;
import com.sofka.domain.shared.values.AnesthesiaE;
import com.sofka.domain.surgery.commands.CreateSurgery;
import com.sofka.domain.surgery.events.SurgeryCreated;
import com.sofka.domain.surgery.values.IsFinished;
import com.sofka.domain.surgery.values.Specialty;
import com.sofka.domain.surgery.values.SurgeryDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateSurgeryUseCaseTest {

    @Test
    public void createSurgeryUseCaseTest(){

        //Arrange
        CreateSurgery command = new CreateSurgery(
            new Specialty("Liposuction"),
            new Anesthesia(AnesthesiaE.GENERAL),
            new SurgeryDate("September 01 2022"),
            new IsFinished(false)
        );
        CreateSurgeryUseCase useCase = new CreateSurgeryUseCase();
        //Act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating the surgery"))
                .getDomainEvents();

        SurgeryCreated event = (SurgeryCreated) events.get(0);
        //Assert
        Assertions.assertEquals(command.getSpecialty().value(), event.getSpecialty().value());

    }

}