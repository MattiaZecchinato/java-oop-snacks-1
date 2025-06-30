package org.lessons.java.contoBancario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContoBancario {
    private String numberBankAccount;
    private BigDecimal balance;

    public ContoBancario(String numberBankAccount) {
        this.numberBankAccount = numberBankAccount;
        this.balance = BigDecimal.ZERO;
    }

    public String getNumberBankAccount() {
        return this.numberBankAccount;
    }

    public void depositMoney(BigDecimal money) {
        this.balance = this.balance.add(money).setScale(2, RoundingMode.HALF_EVEN);

        System.out.println("Money successfully deposited!");
        System.out.println("New current balance: " + getCurrentBalance());
    }

    public void withdrawMoney(BigDecimal money) {
        // this.balance >= money --> true
        if (money.compareTo(this.balance) < 0 || money.compareTo(this.balance) == 0) {
            this.balance = this.balance.subtract(money);

            System.out.println("Money successfully withdrawn!");
            System.out.println("New current balance: " + getCurrentBalance());
        } else {
            System.out.println("Not enough money on the bank account!");
        }
    }

    public BigDecimal getCurrentBalance() {
        return this.balance;
    }
}
