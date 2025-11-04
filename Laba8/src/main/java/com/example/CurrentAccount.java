package com.example;


public class CurrentAccount extends BankAccount implements InterestBearing, Withdrawable {

    private static final double INTEREST_RATE = 0.01; // 1%
    private static final double WITHDRAWAL_FEE = 1.5;  // комиссия $1.5

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        double total = amount + WITHDRAWAL_FEE;
        if (total <= balance) {
            balance -= total;
            return true;
        }
        return false;
    }
}