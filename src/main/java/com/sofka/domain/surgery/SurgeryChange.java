package com.sofka.domain.surgery;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.domain.surgery.events.*;

import java.util.HashSet;

public class SurgeryChange extends EventChange {

    public SurgeryChange(Surgery surgery){


        apply((SurgeryCreated event) -> {
            surgery.specialty = event.getSpecialty();
            surgery.anesthesia = event.getAnesthesia();
            surgery.surgeryDate = event.getSurgeryDate();
            surgery.isFinished = event.getIsFinished();
            surgery.nurses = new HashSet<>();
        });


        apply((SpecialtyUpdated event) -> {
            surgery.specialty = event.getSpecialty();
        });


        apply((AnesthesiaChanged event) -> {
            surgery.anesthesia = event.getAnesthesia();
        });


        apply((SurgeryDateChanged event) -> {
            surgery.surgeryDate = event.getSurgeryDate();
        });


        apply((SurgeryFinished event) -> {
            surgery.isFinished = event.getIsFinished();
        });


        apply((NurseAdded event)->{
            var numberOfNurses = surgery.nurses.size();
            if(numberOfNurses == 4){
                throw new IllegalArgumentException("You cannot add more Nurses to the Surgery");
            }
            surgery.nurses.add(new Nurse(
                    event.getNurseID(),
                    event.getName(),
                    event.getYearsOfResidency(),
                    event.getAge(),
                    event.getShift()
            ));
        });



        apply((PatientAdded event)->{
            surgery.patient = new Patient(
                    event.getPatientID(),
                    event.getName(),
                    event.getAge(),
                    event.getReasonForSurgery(),
                    event.getRh()
            );
        });


        apply((DoctorAdded event)->{
            surgery.doctor = new Doctor(
                    event.getDoctorID(),
                    event.getName(),
                    event.getAge(),
                    event.getYearsOfResidency(),
                    event.getShift()
            );
        });


        apply((NurseNameUpdated event)->{
            var nurse = surgery.getNurseByNurseID(event.getNurseID()).orElseThrow(()->new IllegalArgumentException("Invalid id to retrieve the Nurse"));
            nurse.updateName(event.getName());
        });


        apply((NurseYearsOfResidencyUpdated event)->{
            var nurse = surgery.getNurseByNurseID(event.getNurseID()).orElseThrow(()->new IllegalArgumentException("Invalid id to retrieve the Nurse"));
            nurse.updateYearsOfResidency(event.getYearsOfResidency());
        });

        apply((NurseShiftUpdated event)->{
            var nurse = surgery.getNurseByNurseID(event.getNurseID()).orElseThrow(()->new IllegalArgumentException("Invalid id to retrieve the Nurse"));
            nurse.updateShift(event.getShift());
        });

        apply((NurseAgeUpdated event)->{
            var nurse = surgery.getNurseByNurseID(event.getNurseID()).orElseThrow(()->new IllegalArgumentException("Invalid id to retrieve the Nurse"));
            nurse.updateAge(event.getAge());
        });

        apply((PatientNameUpdated event) -> {
            surgery.patient.updateName(event.getName());
        });


        apply((PatientAgeUpdated event) -> {
            surgery.patient.updateAge(event.getAge());
        });

        apply((PatientReasonForSurgeryAdded event) -> {
            surgery.patient.AddReasonForSurgery(event.getReasonForSurgery());
        });

        apply((PatientAllergyAdded event) -> {
            surgery.patient.addAllergy(event.getAllergy());
        });

        apply((PatientRhChanged event) -> {
            surgery.patient.updateRh(event.getRh());
        });

        apply((DoctorNameUpdated event) -> {
            surgery.doctor.updateName(event.getName());
        });

        apply((DoctorAgeUpdated event) -> {
            surgery.doctor.updateAge(event.getAge());
        });

        apply((DoctorSpecialtyAdded event) -> {
            surgery.doctor.addSpecialty(event.getSpecialty());
        });

        apply((DoctorYearsOfResidencyUpdated event) -> {
            surgery.doctor.updateYearsOfResidency(event.getYearsOfResidency());
        });

        apply((DoctorShiftUpdated event) -> {
            surgery.doctor.updateShift(event.getShift());
        });


    }

}
