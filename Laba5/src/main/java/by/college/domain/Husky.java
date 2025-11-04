package by.college.domain;

public class Husky extends Dog {
    public Husky(String name, int age) {
        super(name, age);

    }

    @Override
    public void bark() {
        System.out.println(getName() + " — хаски, лает: Вууу-вууу!");
    }

    public void howl() {
        System.out.println(getName() + " — хаски, воет: АУУУУУ!");
    }

    @Override
    public void prinInfo() {
        super.prinInfo();
        System.out.println( "Порода: хаски.");
    }
}