package org.lessons.java.studente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        System.out.println("Insert student's first name:");
        String studentFirstName = sc.nextLine();

        System.out.println("Insert student's last name:");
        String studentLastName = sc.nextLine();

        System.out.println("Insert student's age:");
        int studentAge = sc.nextInt();

        Studente student1 = new Studente(studentFirstName, studentLastName, studentAge);

        System.out.println(student1.getStudentData());

        sc.close();
    }
}
