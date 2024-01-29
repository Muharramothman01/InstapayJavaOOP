package org.example;

public class NBE implements BankAccount {
    private double balance;
    public static final double MAX_WITHDRAWAL = 8000;
    public static final double MAX_DEPOSIT = 15000;

    private final String bankName = "NBE";

    public NBE() {

    }

    public NBE(double initialBalance) {
        balance = initialBalance;
    }
    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public void withDraw(double amount) {
        if (amount > MAX_WITHDRAWAL) {
            System.err.printf("Cannot withdraw more than %f in one transaction.%n", MAX_WITHDRAWAL);
        }

        if (amount > balance) {
            System.err.printf("Not enough balance");
        }

        balance -= amount;
        System.out.printf("Withdrew %f%nCurrent balance: %f%n", amount, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > MAX_DEPOSIT) {
            System.err.printf("Cannot deposit more than %f in one transaction.%n", MAX_DEPOSIT);
        }

        balance += amount;
        System.out.printf("Deposited %f%nCurrent balance: %f%n", amount, balance);
    }

    @Override
    public double showBalance() {
        return balance;
    }

    @Override
    public void exchangeMoney(double amount, String currency) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
