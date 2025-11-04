package by.college.domain;

public class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " — бульдог, рычит: ГРРР... гав!");
    }

    public void snore() {
        System.out.println(getName() + " — бульдог, громко храпит: ХРРР... ХРРР...");
    }
}