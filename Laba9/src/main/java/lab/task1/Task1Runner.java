package lab.task1;

import java.util.*;

public class Task1Runner {
    public static void main(String[] args) {

        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("Анна Каренина", new Fiction("Анна Каренина", "Лев Толстой"));
        bookMap.put("На распутье", new NonFiction("На распутье", "Мария Соколова"));
        bookMap.put("Знак бяды", new Fiction("Знак бяды", "Василь Быков")); // опечатка сохранена по вашему тексту

        System.out.println("=== ЗАДАНИЕ 1: КЛЮЧИ (названия книг) ===");

        for (String key : bookMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n=== ДОПОЛНИТЕЛЬНО: ИНФОРМАЦИЯ О КНИГАХ ЧЕРЕЗ ГЕТТЕРЫ ===");
        for (Book book : bookMap.values()) {

            System.out.println(book);
        }
    }
}