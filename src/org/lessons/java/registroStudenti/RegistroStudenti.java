package org.lessons.java.registroStudenti;

import org.lessons.java.studente.Studente;

public class RegistroStudenti {
    private Studente[] studentRegister = new Studente[1];

    public void printStudentRegister() {
        for (Studente student : studentRegister) {
            if (student != null) {
                System.out.println("First name: " + student.getFirstName());
                System.out.println("Last name: " + student.getLastName());
                System.out.println("Age: " + student.getAge());
                System.out.println("-------------------");
            }
        }
    }

    public void addStudent(String firstName, String lastName, int age) {
        // add new student to studentRegister
        this.studentRegister[this.studentRegister.length - 1] = new Studente(firstName, lastName, age);

        // create new array with 1 more slot
        Studente[] newStudentRegister = new Studente[this.studentRegister.length + 1];

        // copy all the element from the old array into the new one
        for (int i = 0; i < this.studentRegister.length; i++) {
            newStudentRegister[i] = this.studentRegister[i];
        }

        // set the old array with the new one
        this.studentRegister = newStudentRegister;

        System.out.println("New student added!");
    }
}
