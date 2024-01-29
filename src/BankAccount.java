package org.example;

public interface BankAccount {
    String getBankName();
    void withDraw(double amount);
    void deposit(double amount);
    double showBalance();
    void exchangeMoney(double amount, String currency);

}
