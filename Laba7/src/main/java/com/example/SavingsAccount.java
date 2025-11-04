package com.example;

public class SavingsAccount extends BankAccount {
    private static final double SAVINGS_INTEREST_RATE = 0.05; // 5%

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * SAVINGS_INTEREST_RATE;
    }
}