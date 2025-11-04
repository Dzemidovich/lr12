

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Андрей");


        Tester t1 = new Tester("Максим", "Балахомский", 5, "B2", 2000.0);
        t1.printInfo(true);


        double bonus = Tester.calculateBonus(2000.0);
        System.out.println("Бонус: " + bonus);
    }
}