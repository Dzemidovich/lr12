package by.enot.raccoon;

public class MainRaccoon {
    public static void main(String[] args) {
        Raccoon raccoon1 = new Raccoon();
        Raccoon raccoon2 = new Raccoon("Рокки");
        Raccoon raccoon3 = new Raccoon("Бэнди", 3);
        Raccoon raccoon4 = new Raccoon("Стар", 2, 8.5, "черно-серый");

        System.out.println("=== Демонстрация работы класса Енот ===");

        raccoon2.eat();
        raccoon3.play();

        raccoon1.setName("Малыш");
        raccoon1.setAge(1);
        raccoon1.setWeight(5.2);
        raccoon1.color = "рыжий";

        System.out.println("\n--- Методы разных модификаторов ---");
        raccoon1.eat();
        raccoon1.makeSound();
        raccoon1.eatWithWashing();

        System.out.println("\n--- Сбор предметов ---");
        raccoon4.collectItems("яблоко", "орех", "монетка");

        System.out.println("\n--- Информация о енотах ---");
        System.out.println(raccoon1);
        System.out.println(raccoon2);
        System.out.println(raccoon3);
        System.out.println(raccoon4);

        System.out.println("\n--- Статическая информация ---");
        System.out.println("Вид енота: " + Raccoon.SPECIES);
        System.out.println("Всего создано енотов: " + Raccoon.getRaccoonCount());
    }
}