package com.sofka.domain.surgery;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.shared.values.Anesthesia;
import com.sofka.domain.shared.values.Name;
import com.sofka.domain.surgery.events.*;
import com.sofka.domain.surgery.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Surgery extends AggregateEvent<SurgeryID> {

    protected Specialty specialty;
    protected Anesthesia anesthesia;
    protected SurgeryDate surgeryDate;
    protected IsFinished isFinished;
    protected Set<Nurse> nurses;
    protected Doctor doctor;
    protected Patient patient;

    public Surgery(SurgeryID surgeryID, Specialty specialty, Anesthesia anesthesia, SurgeryDate surgeryDate, IsFinished isFinished) {
        super(surgeryID);
        appendChange(new SurgeryCreated(specialty,anesthesia,surgeryDate,isFinished));
    }

    private Surgery(SurgeryID surgeryID){
        super(surgeryID);
        subscribe(new SurgeryChange(this));
    }

    public static Surgery from(SurgeryID surgeryID, List<DomainEvent> events){
        var surgery = new Surgery(surgeryID);
        events.forEach(surgery::applyEvent);
        return surgery;
    }

    public void updateSpecialty(Specialty specialty){
        Objects.requireNonNull(specialty);
        appendChange(new SpecialtyUpdated(specialty)).apply();
    }

    public void changeAnesthesia(Anesthesia anesthesia){
        Objects.requireNonNull(anesthesia);
        appendChange(new AnesthesiaChanged(anesthesia)).apply();
    }

    public void changeSurgeryDate(SurgeryDate surgeryDate){
        Objects.requireNonNull(surgeryDate);
        appendChange(new SurgeryDateChanged(surgeryDate)).apply();
    }

    public void finishSurgery(IsFinished isFinished){
        Objects.requireNonNull(isFinished);
        appendChange(new SurgeryFinished(isFinished)).apply();
    }

    public void addNurse(NurseID nurseID, Name name, YearsOfResidency yearsOfResidency, Age age, Shift shift){
        Objects.requireNonNull(nurseID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(yearsOfResidency);
        Objects.requireNonNull(age);
        Objects.requireNonNull(shift);
        appendChange(new NurseAdded(nurseID, name, yearsOfResidency, age, shift)).apply();
    }


    public void addPatient(PatientID patientID, Name name, Age age, ReasonForSurgery reasonForSurgery, Rh rh){
        Objects.requireNonNull(patientID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(age);
        Objects.requireNonNull(reasonForSurgery);
        Objects.requireNonNull(rh);
        appendChange(new PatientAdded(patientID, name, age, reasonForSurgery, rh)).apply();
    }

    public void addDoctor(DoctorID doctorID, Name name, Age age, YearsOfResidency yearsOfResidency, Shift shift){
        Objects.requireNonNull(doctorID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(age);
        Objects.requireNonNull(yearsOfResidency);
        Objects.requireNonNull(shift);
        appendChange(new DoctorAdded(doctorID, name, age, yearsOfResidency, shift)).apply();
    }

    public void updateNurseName(NurseID nurseID, Name name){
        Objects.requireNonNull(nurseID);
        Objects.requireNonNull(name);
        appendChange(new NurseNameUpdated(nurseID, name)).apply();
    }

    public void updateNurseYearsOfResidency(NurseID nurseID, YearsOfResidency yearsOfResidency){
        Objects.requireNonNull(nurseID);
        Objects.requireNonNull(yearsOfResidency);
        appendChange(new NurseYearsOfResidencyUpdated(nurseID, yearsOfResidency)).apply();
    }

    public void updateNurseShift(NurseID nurseID, Shift shift){
        Objects.requireNonNull(nurseID);
        Objects.requireNonNull(shift);
        appendChange(new NurseShiftUpdated(nurseID, shift)).apply();
    }

    public void updateNurseAge(NurseID nurseID, Age age){
        Objects.requireNonNull(nurseID);
        Objects.requireNonNull(age);
        appendChange(new NurseAgeUpdated(nurseID, age)).apply();
    }

    public void updatePatientName(PatientID patientID, Name name){
        Objects.requireNonNull(patientID);
        Objects.requireNonNull(name);
        appendChange(new PatientNameUpdated(patientID, name)).apply();
    }

    public void updatePatientAge(PatientID patientID, Age age){
        Objects.requireNonNull(patientID);
        Objects.requireNonNull(age);
        appendChange(new PatientAgeUpdated(patientID, age)).apply();
    }

    public void addPatientReasonForSurgery(PatientID patientID, ReasonForSurgery reasonForSurgery){
        Objects.requireNonNull(patientID);
        Objects.requireNonNull(reasonForSurgery);
        appendChange(new PatientReasonForSurgeryAdded(patientID, reasonForSurgery)).apply();
    }

    public void addPatientAllergy(PatientID patientID, Allergy allergy){
        Objects.requireNonNull(patientID);
        Objects.requireNonNull(allergy);
        appendChange(new PatientAllergyAdded(patientID, allergy)).apply();
    }

    public void changePatientRh(PatientID patientID, Rh rh){
        Objects.requireNonNull(patientID);
        Objects.requireNonNull(rh);
        appendChange(new PatientRhChanged(patientID, rh)).apply();
    }

    public void updateDoctorName(DoctorID doctorID, Name name){
        Objects.requireNonNull(doctorID);
        Objects.requireNonNull(name);
        appendChange(new DoctorNameUpdated(doctorID, name)).apply();
    }

    public void updateDoctorAge(DoctorID doctorID, Age age){
        Objects.requireNonNull(doctorID);
        Objects.requireNonNull(age);
        appendChange(new DoctorAgeUpdated(doctorID, age)).apply();
    }

    public void addDoctorSpecialty(DoctorID doctorID, Specialty specialty){
        Objects.requireNonNull(doctorID);
        Objects.requireNonNull(specialty);
        appendChange(new DoctorSpecialtyAdded(doctorID, specialty)).apply();
    }

    public void updateDoctorYearsOfResidency(DoctorID doctorID, YearsOfResidency yearsOfResidency){
        Objects.requireNonNull(doctorID);
        Objects.requireNonNull(yearsOfResidency);
        appendChange(new DoctorYearsOfResidencyUpdated(doctorID, yearsOfResidency)).apply();
    }

    public void updateDoctorShift(DoctorID doctorID, Shift shift){
        Objects.requireNonNull(doctorID);
        Objects.requireNonNull(shift);
        appendChange(new DoctorShiftUpdated(doctorID, shift)).apply();
    }


    //TODO PENDIENTE OPTIONALS PARA BUSQUEDAS POR ID


    public Specialty specialty() {
        return specialty;
    }

    public Anesthesia anesthesia() {
        return anesthesia;
    }

    public SurgeryDate surgeryDate() {
        return surgeryDate;
    }

    public IsFinished isFinished() {
        return isFinished;
    }

    public Set<Nurse> nurses() {
        return nurses;
    }

    public Doctor doctor() {
        return doctor;
    }

    public Patient patient() {
        return patient;
    }
}
