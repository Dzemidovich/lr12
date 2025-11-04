
package by.collegee;

import by.college.domain.Husky;
import by.college.domain.Poodle;
import by.college.domain.Bulldog;

public class DogTest {
    public static void main(String[] args) {
        Husky husky = new Husky("Бальто", 4);
        Poodle poodle = new Poodle("Фифи", 2);
        Bulldog bulldog = new Bulldog("Рокки", 5);

        husky.bark();
        poodle.bark();
        bulldog.bark();

        System.out.println();

        husky.howl();
        poodle.doTrick();
        bulldog.snore();
    }
}