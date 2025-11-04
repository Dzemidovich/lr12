class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;


    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }


    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }


    public Tester(String name, String surname) {
        this(name, surname, 0, "A1");
    }


    public void printInfo() {
        System.out.println(name + " " + surname + " — опыт: " + experienceInYears + " лет");
    }


    public void printInfo(boolean detailed) {
        if (detailed) {
            System.out.println("Имя: " + name);
            System.out.println("Фамилия: " + surname);
            System.out.println("Опыт: " + experienceInYears + " лет");
            System.out.println("Английский: " + englishLevel);
            System.out.println("Зарплата: " + salary);
        } else {
            printInfo();
        }
    }


    public void printInfo(String prefix) {
        System.out.println(prefix + ": " + name + " " + surname);
    }


    public static double calculateBonus(double baseSalary) {
        return baseSalary * 0.1; // 10%
    }
}