package org.example;

public class BanqueMisr extends Bank {
    
    public BanqueMisr(double balance){
        super("BM", balance);
    }
    @Override
    public String getBankName() {
        return getName();
    }

    @Override
    public void withDraw(double amount) {
        
        if (amount > 5000){
            System.out.println("Invalid amount \n TRY AGAIN!!");
        } else {
            if (amount <= balance ) {
                balance -= amount;
                System.out.println(" Amount withdrawal: " + amount + "\n Balance after withdrawal: " + balance);
            } else {
                System.out.println("Your balance is less than " + amount + "\t Transaction failed...!!" );
            }
        }
    }

    @Override
    public double getWithdrawLimit() {
        return 5000;
    }
    @Override
    public void deposit(double amount) {
        if (amount <= 8000) {
            balance += amount;
            System.out.println(" Amount Deposit: " + amount + "\n Balance after withdrawal: " + balance);

        } else {
            System.out.println(" Deposit Transaction Failed!");
        }
    }


    @Override
    public double getDepositLimit() {
        return 8000;
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
    }
}
