//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main import java.util.Scanner;

public class StudentTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1: Проверка делимости числа
        System.out.println("=== Задание 1: Проверка делимости ===");
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        System.out.print("Введите делитель: ");
        int n = scanner.nextInt();

        if (num % n == 0) {
            System.out.println(num + " делится на " + n);
        } else {
            System.out.println(num + " НЕ делится на " + n);
        }
        System.out.println();

        // Задание 3: День недели по номеру
        System.out.println("=== Задание 3: День недели ===");
        System.out.print("Введите номер дня недели (1-7): ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1: System.out.println("Понедельник"); break;
            case 2: System.out.println("Вторник"); break;
            case 3: System.out.println("Среда"); break;
            case 4: System.out.println("Четверг"); break;
            case 5: System.out.println("Пятница"); break;
            case 6: System.out.println("Суббота"); break;
            case 7: System.out.println("Воскресенье"); break;
            default: System.out.println("Неверный номер дня");
        }
        System.out.println();

        // Задание 4: Страна по столице
        System.out.println("=== Задание 4: Страна по столице ===");
        System.out.print("Введите столицу (Москва, Париж, Берлин, Токио, Лондон): ");
        scanner.nextLine(); // очистка буфера
        String capital = scanner.nextLine();

        switch (capital) {
            case "Москва": System.out.println("Россия"); break;
            case "Париж": System.out.println("Франция"); break;
            case "Берлин": System.out.println("Германия"); break;
            case "Токио": System.out.println("Япония"); break;
            case "Лондон": System.out.println("Великобритания"); break;
            default: System.out.println("Страна не найдена");
        }
        System.out.println();

        // Задание 6: Произведение четных чисел
        System.out.println("=== Задание 6: Произведение четных чисел ===");
        System.out.print("Введите число n: ");
        int number = scanner.nextInt();
        long product = 1;
        int i = 2;

        while (i <= number) {
            if (i % 2 == 0) {
                product *= i;
            }
            i++;
        }
        System.out.println("Произведение четных чисел от 1 до " + number + " = " + product);
        System.out.println();

        // Задание 7: Проверка веса и роста
        System.out.println("=== Задание 7: Проверка веса и роста ===");
        System.out.print("Введите рост (в см): ");
        int height = scanner.nextInt();
        System.out.print("Введите вес (в кг): ");
        int weight = scanner.nextInt();

        int normalWeight = height - 100;
        double minNormal = normalWeight * 0.9;
        double maxNormal = normalWeight * 1.1;

        if (weight >= minNormal && weight <= maxNormal) {
            System.out.println("Вес в норме");
        } else if (weight < minNormal) {
            System.out.println("Нужно поправиться");
        } else {
            System.out.println("Нужно похудеть");
        }

        scanner.close();
    }
}
