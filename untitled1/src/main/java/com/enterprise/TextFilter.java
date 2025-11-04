

// Записать в файл строки текста. В другой файл записать только строки,содержащие заданное слово.

package com.enterprise;


import java.io.*;
        import java.nio.file.*;
        import java.util.*;

public class TextFilter {
    private static final String INPUT_FILE = "C:\\Users\\Andrew Dzemidovich\\Desktop\\text_input.txt";
    private static final String OUTPUT_FILE = "C:\\Users\\Andrew Dzemidovich\\Desktop\\filtered_text.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            createInputTextFile();
            filterTextByWord(scanner);

        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void createInputTextFile() throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(INPUT_FILE))) {
            writer.write("Java является популярным языком программирования.\n");
            writer.write("Программирование на Java требует практики.\n");
            writer.write("Студенты изучают Java в колледже.\n");
            writer.write("Лабораторные работы помогают освоить Java.\n");
            writer.write("Колледж бизнеса и права готовит специалистов.\n");
            writer.write("Java используется для создания приложений.\n");
            writer.write("Программисты ценят Java за кроссплатформенность.\n");
        }
        System.out.println("Исходный текст записан в файл '" + INPUT_FILE + "'");
    }

    private static void filterTextByWord(Scanner scanner) throws IOException {
        System.out.print("\nВведите слово для фильтрации: ");
        String searchWord = scanner.nextLine().toLowerCase();

        int matchedLines = 0;

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(INPUT_FILE));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(OUTPUT_FILE))) {

            String line;
            System.out.println("\nСтроки содержащие слово '" + searchWord + "':");

            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(searchWord)) {
                    writer.write(line);
                    writer.newLine();
                    System.out.println("✓ " + line);
                    matchedLines++;
                }
            }
        }

        System.out.println("\nРезультат:");
        System.out.println("Найдено строк: " + matchedLines);
        System.out.println("Отфильтрованные строки записаны в файл '" + OUTPUT_FILE + "'");

        if (matchedLines > 0) {
            System.out.println("\nСодержимое файла '" + OUTPUT_FILE + "':");
            try (BufferedReader reader = Files.newBufferedReader(Paths.get(OUTPUT_FILE))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        }
    }
}