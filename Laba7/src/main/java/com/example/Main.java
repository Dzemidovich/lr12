package com.example;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000);
        CurrentAccount current = new CurrentAccount(2000);


        System.out.println("Сберегательный процент: " + savings.calculateInterest()); // 50.0
        System.out.println("Проценты по текущему счёту: " + current.calculateInterest()); // 20.0
    }
}