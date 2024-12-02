package ru.vsu.cs.task1;

import java.util.Objects;

public class MedicalCard {
    private Doctor doctor;
    private Illness illness;
    private Patient patient;

    public MedicalCard(Doctor doctor, Illness illness, Patient patient) {
        this.doctor = doctor;
        this.illness = illness;
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalCard that = (MedicalCard) o;
        return Objects.equals(doctor, that.doctor) && Objects.equals(illness, that.illness) && Objects.equals(patient, that.patient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctor, illness, patient);
    }

    @Override
    public String toString() {
        return "MedicalCard{" +
                "doctor=" + doctor +
                ", illness=" + illness +
                ", patient=" + patient +
                '}';
    }
}
