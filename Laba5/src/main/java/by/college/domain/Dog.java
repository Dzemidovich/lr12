package by.college.domain;

public class Dog {
    private String name;
    private int age;

    public Dog() {}

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark() {
        System.out.println(name + " говорит: Гав!");
    }

    public void prinInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + " лет");
    }
}