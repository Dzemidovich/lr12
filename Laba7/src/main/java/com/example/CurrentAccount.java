package com.example;

public class CurrentAccount extends BankAccount {
    private static final double CURRENT_INTEREST_RATE = 0.01;

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * CURRENT_INTEREST_RATE;
    }
}