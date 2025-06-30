package org.lessons.java.studente;

public class Studente {

    private static int ageMin = 15;

    private String firstName;
    private String lastName;
    private int age;

    public Studente(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int age) {
        if (age >= ageMin) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getStudentData() {
        return this.firstName + " " + this.lastName + ", " + this.age + " anni";
    }
}
