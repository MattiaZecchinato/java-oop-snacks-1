package org.lessons.java.contoBancario;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContoBancario bankAccount1 = new ContoBancario("12543");

        boolean exitBank = true;

        while (exitBank) {
            System.out.println(
                    "1)Show bank account number\n2)Show current balance\n3)Deposit Money\n4)Withdraw money\n5)Exit");

            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Your bank account number is: " + bankAccount1.getNumberBankAccount());
                    break;
                case 2:
                    System.out.println("Your current balance is: " + bankAccount1.getCurrentBalance());
                    break;
                case 3:
                    BigDecimal moneyDeposit = sc.nextBigDecimal();
                    bankAccount1.depositMoney(moneyDeposit);
                    break;
                case 4:
                    BigDecimal moneyWithdraw = sc.nextBigDecimal();
                    bankAccount1.depositMoney(moneyWithdraw);
                    break;
                case 5:
                    exitBank = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }

        sc.close();
    }
}
