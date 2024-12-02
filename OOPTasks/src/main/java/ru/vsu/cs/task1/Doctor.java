package ru.vsu.cs.task1;

import java.util.Objects;

public class Doctor extends Person{
    private String qualification;

    public Doctor(String name, String surname, String qualification) {
        super(name, surname);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(qualification, doctor.qualification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), qualification);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + this.getName() + '\'' +
                "surname='" + this.getSurname() + '\'' +
                "age='" + this.getAge() + '\'' +
                "qualification='" + qualification + '\'' +
                '}';
    }
}
