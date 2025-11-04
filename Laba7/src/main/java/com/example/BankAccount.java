package com.example;

public abstract class BankAccount {
    protected double balance;



    public BankAccount(double balance) {
        this.balance = balance;

    }




    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }


    public abstract double calculateInterest();
}