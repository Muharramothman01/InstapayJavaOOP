package org.example;

public class CIB extends Bank {
    public CIB() {
        super("CIB", 0);
    }

    public CIB(double balance) {
        super("CIB", balance);
    }

    @Override
    public String getBankName() {
        return getName();
    }

    @Override
    public void withDraw(double amount) {
        if (amount==0) {
            System.out.println("Invaild transaction");

        }
        else if(amount > balance){
            System.out.println("account money not enough ");

        }
        else if (amount <= balance && amount > 8000) {
            System.out.println("You cannot withdraw more than 8000 in one move");

        }
        else {
            balance-=amount;
            System.out.println("you withdraw " + amount + " successfully ");
            System.out.println("THANK YOU FOR USING IT ");
        }
    }

    @Override
    public double getWithdrawLimit() {
        return 7000;
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("you deposit " + amount + " successfully ");
        System.out.println("THANK YOU FOR USING IT ");
    }

    @Override
    public double getDepositLimit() {
        return 25000;
    }

    @Override
    public double showBalance() {
        return balance;
    }

    @Override
    public void exchangeMoney(double amount, String currency) {

        if (amount > balance){
            System.out.println("account money not enough ");
        }
        else if (amount <= balance && currency.equals("Dollar")) {
            double result_after_exchange=amount / 30.8500;
            balance-=amount;
            System.out.println("you exhange " + amount + " EGP " + " successfully to " + result_after_exchange + " USD");

        }
        else if (amount <= balance && currency.equals("Euro")) {
            double result_after_exchange=amount / 33.4815;
            balance-=amount;
            System.out.println("you exhange " + amount + " EGP " + " successfully to " + result_after_exchange  + " EUR");

        }
        else if (amount <= balance && currency.equals("Sar")) {
            double result_after_exchange=amount / 8.2262;
            balance-=amount;
            System.out.println("you exhange " + amount + " EGP " + " successfully to " + result_after_exchange  + " Sar");

        }

    }}
