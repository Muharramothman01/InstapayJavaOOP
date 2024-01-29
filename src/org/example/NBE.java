package org.example;

public class NBE extends Bank {
    public static final double MAX_WITHDRAWAL = 8000;
    public static final double MAX_DEPOSIT = 15000;

    public NBE() {
        super("NBE", 0);
    }

    public NBE(double initialBalance) {
        super("NBE", initialBalance);
    }

    @Override
    public String getBankName() {
        return getName();
    }

    @Override
    public void withDraw(double amount) {
        if (amount > MAX_WITHDRAWAL) {
            System.err.printf("Cannot withdraw more than %f in one transaction.%n", MAX_WITHDRAWAL);
        } else if (amount > balance) {
            System.err.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.printf("Withdrew %f%nCurrent balance: %f%n", amount, balance);
        }
    }

    @Override
    public double getWithdrawLimit() {
        return MAX_WITHDRAWAL;
    }

    @Override
    public void deposit(double amount) {
        if (amount > MAX_DEPOSIT) {
            System.err.printf("Cannot deposit more than %f in one transaction.%n", MAX_DEPOSIT);
        } else {
            balance += amount;
            System.out.printf("Deposited %f%nCurrent balance: %f%n", amount, balance);
        }
    }

    @Override
    public double getDepositLimit() {
        return MAX_DEPOSIT;
    }

    @Override
    public double showBalance() {
        return balance;
    }

    @Override
    public void exchangeMoney(double amount, String currency) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else if (amount <= balance && currency.equals("Dollar")) {
            double resultAfterExchange = amount / 30.8500;
            balance -= amount;
            System.out.printf("You exchanged %f EGP to %f USD%n", amount, resultAfterExchange);
        } else if (amount <= balance && currency.equals("Euro")) {
            double resultAfterExchange = amount / 33.4815;
            balance -= amount;
            System.out.printf("You exchanged %f EGP to %f EUR%n", amount, resultAfterExchange);
        } else if (amount <= balance && currency.equals("Sar")) {
            double resultAfterExchange = amount / 8.2262;
            balance -= amount;
            System.out.printf("You exchanged %f EGP to %f SAR%n", amount, resultAfterExchange);
        }
    }
}
