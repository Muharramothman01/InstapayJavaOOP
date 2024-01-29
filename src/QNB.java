package org.example;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class QNB implements BankAccount{
int current_amount=0;
    private double balance;

    private final String bankName = "QNB";

    public QNB() {

    }

    public QNB(double balance) {
        balance = balance;
    }
    @Override
    public String getBankName() {
        return bankName;
    }


    @Override
    public void withDraw(double amount) {
        if (amount==0) {
      System.out.println("Invaild transaction");

        }
        else if(amount > current_amount){
                  System.out.println("account money not enough ");

        }
        else if (amount <= current_amount && amount > 8000) {
      System.out.println("You cannot withdraw more than 8000 in one move");

        }
        else {
           current_amount-=amount;    
        System.out.println("you withdraw " + amount + " successfully ");    
        System.out.println("THANK YOU FOR USING IT ");  
        }
 
   
    
     }

    @Override
    public void deposit(double amount) {
    current_amount+=amount;    
        System.out.println("you deposit " + amount + " successfully ");    
        System.out.println("THANK YOU FOR USING IT ");

    }

    @Override
    public double showBalance() {

    return current_amount;
    }

    @Override
    public void exchangeMoney(double amount, String currency) {
 
        if         (amount > current_amount){
                  System.out.println("account money not enough ");
    }
        else if (amount <= current_amount && currency.equals("Dollar")) {
            double result_after_exchange=amount / 30.8500;
            current_amount-=amount;
            System.out.println("you exhange " + amount + " EGP " + " successfully to " + result_after_exchange + " USD");
            
        }
    else if (amount <= current_amount && currency.equals("Euro")) {
            double result_after_exchange=amount / 33.4815;
            current_amount-=amount;
            System.out.println("you exhange " + amount + " EGP " + " successfully to " + result_after_exchange  + " EUR");
            
        }
         else if (amount <= current_amount && currency.equals("Sar")) {
            double result_after_exchange=amount / 8.2262;
            current_amount-=amount;
            System.out.println("you exhange " + amount + " EGP " + " successfully to " + result_after_exchange  + " Sar");
            
        }
    
}}
