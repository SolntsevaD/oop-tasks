package ru.vsu.cs.task1;

public class Patient extends Person {

    public Patient(String name, String surname) {
        super(name, surname);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + this.getName() + '\'' +
                "surname='" + this.getSurname() + '\'' +
                "age='" + this.getAge() + '\'' +
                '}';
    }
}
