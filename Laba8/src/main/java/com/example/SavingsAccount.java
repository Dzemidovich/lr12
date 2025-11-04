package com.example;


public class SavingsAccount extends BankAccount implements InterestBearing, Withdrawable {

    private static final double INTEREST_RATE = 0.05; // 5%

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}