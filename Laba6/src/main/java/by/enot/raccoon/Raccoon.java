package by.enot.raccoon;

public class Raccoon {
    private String name;
    private int age;
    protected double weight;
    boolean isHungry;
    public String color;

    private static int raccoonCount = 0;
    public static final String SPECIES = "Procyon lotor";

    public Raccoon() {
        this("Неизвестно", 0, 0.0, "серый");
    }

    public Raccoon(String name) {
        this(name, 0, 0.0, "серый");
    }

    public Raccoon(String name, int age) {
        this(name, age, 0.0, "серый");
    }

    public Raccoon(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isHungry = true;
        raccoonCount++;
    }

    public void eat() {
        if (isHungry) {
            System.out.println(name + " ест вкусную еду!");
            isHungry = false;
            weight += 0.1;
        } else {
            System.out.println(name + " не голоден.");
        }
    }

    public void play() {
        System.out.println(name + " играет и веселится!");
        isHungry = true;
    }

    protected void sleep() {
        System.out.println(name + " спит в своем укрытии...");
        isHungry = true;
    }

    void makeSound() {
        System.out.println(name + " издает звуки: трр-трр!");
    }

    private void washFood() {
        System.out.println(name + " моет еду перед употреблением.");
    }

    public void eatWithWashing() {
        washFood();
        eat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public static int getRaccoonCount() {
        return raccoonCount;
    }

    @Override
    public String toString() {
        return String.format("Енот: %s, возраст: %d лет, вес: %.2f кг, цвет: %s, голоден: %s",
                name, age, weight, color, isHungry ? "да" : "нет");
    }

    public void collectItems(String... items) {
        System.out.print(name + " собирает: ");
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}