package org.example;

public abstract class Bank implements BankAccount {
    private String bankName;
    protected double balance;

    public Bank(String name, double initialBalance) {
        bankName = name;
        balance = initialBalance;
    }

    public Bank(String name) {
        bankName = name;
    }

    public String getName() {
        return bankName;
    }
}
