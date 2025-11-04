package by.college.domain;

public class Poodle extends Dog {
    public Poodle(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " — пудель, тявкает: Тяф-тяф!");
    }

    public void doTrick() {
        System.out.println(getName() + " — пудель, делает сальто!");
    }
}