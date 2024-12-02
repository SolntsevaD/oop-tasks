package ru.vsu.cs.task1;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Ivan", "Ivanov");
        Illness illness = new Illness("Headache", "hard");
        Doctor doctor = new Doctor("Peter", "Petrov", "pro");

        MedicalCard medicalCard = new MedicalCard(doctor, illness, patient);

        System.out.println(medicalCard);

        Illness equalIllness = new Illness("Headache");
        Illness notEqualIllness = new Illness("Depression");
        System.out.println("Is " + illness + " is equal to " + equalIllness + "? - " + illness.equals(equalIllness));
        System.out.println("Is " + illness + " is equal to " + notEqualIllness + "? - " + illness.equals(notEqualIllness));
    }
}
