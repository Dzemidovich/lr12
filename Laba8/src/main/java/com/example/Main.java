package com.example;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(1000);
        CurrentAccount current = new CurrentAccount(2000);


        System.out.println("=== Проценты ===");
        InterestBearing[] interestAccounts = {savings, current};
        for (InterestBearing acc : interestAccounts) {
            System.out.printf("Проценты: $%.2f%n", acc.calculateInterest());
        }


        System.out.println("\n=== Снятие средств ===");
        Withdrawable w1 = savings;
        Withdrawable w2 = current;

        System.out.println("Сберегательный счёт: снятие $300 → " +
                (w1.withdraw(300) ? "успешно" : "отказано"));
        System.out.println("Текущий счёт: снятие $500 → " +
                (w2.withdraw(500) ? "успешно" : "отказано"));


        System.out.println("\n=== Балансы после снятия ===");
        System.out.printf("Сберегательный: $%.2f%n", savings.getBalance());
        System.out.printf("Текущий: $%.2f%n", current.getBalance());
    }
}