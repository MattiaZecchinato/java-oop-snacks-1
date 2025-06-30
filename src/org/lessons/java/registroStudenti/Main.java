package org.lessons.java.registroStudenti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RegistroStudenti studentRegister = new RegistroStudenti();

        boolean exitChoice = true;

        while (exitChoice) {
            System.out.println(
                    "1)Show student register\n2)Add new to student\n3)Exit");

            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    studentRegister.printStudentRegister();
                    break;
                case 2:
                    sc.nextLine(); // consume the leftover newline
                    System.out.println("Insert student first name:");
                    String studentFirstName = sc.nextLine();

                    System.out.println("Insert student last name:");
                    String studentLastName = sc.nextLine();

                    System.out.println("Insert student age:");
                    int studentAge = sc.nextInt();

                    studentRegister.addStudent(studentFirstName, studentLastName, studentAge);
                    break;
                case 3:
                    exitChoice = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }

        sc.close();
    }
}
