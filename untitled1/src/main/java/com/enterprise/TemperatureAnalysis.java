package com.enterprise;

import java.io.*;
import java.util.*;
import java.nio.file.*;

public class TemperatureAnalysis {
    private static final String FILE_NAME = "C:\\Users\\Andrew Dzemidovich\\Desktop\\temperatures.txt";
    private static final int TEMPERATURE_COUNT = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            inputTemperatures(scanner);
            calculateAverageTemperature();

        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Ошибка формата числа: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void inputTemperatures(Scanner scanner) throws IOException {
        System.out.println("Введите " + TEMPERATURE_COUNT + " вещественных значений температуры воздуха:");

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_NAME))) {
            for (int i = 1; i <= TEMPERATURE_COUNT; i++) {
                System.out.print("Температура " + i + ": ");

                try {
                    double temperature = scanner.nextDouble();
                    writer.write(String.format(Locale.US, "%.2f", temperature));
                    if (i < TEMPERATURE_COUNT) {
                        writer.write(" ");
                    }
                } catch (InputMismatchException e) {
                    System.err.println("Ошибка! Введите вещественное число.");
                    scanner.next();
                    i--;
                }
            }
        }
        System.out.println("Температуры успешно записаны в файл '" + FILE_NAME + "'");
    }

    private static void calculateAverageTemperature() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(FILE_NAME))) {
            String line = reader.readLine();
            if (line == null || line.trim().isEmpty()) {
                System.err.println("Файл пуст!");
                return;
            }

            String[] temperatureStrings = line.split(" ");
            double sum = 0;
            int count = 0;

            System.out.println("\nСчитанные температуры:");
            for (String tempStr : temperatureStrings) {
                try {
                    double temperature = Double.parseDouble(tempStr);
                    System.out.printf("%.2f°C ", temperature);
                    sum += temperature;
                    count++;
                } catch (NumberFormatException e) {
                    System.err.println("\nНекорректное значение: " + tempStr);
                }
            }

            if (count > 0) {
                double average = sum / count;
                System.out.printf("\n\nСредняя температура: %.2f°C", average);
                System.out.printf("\nОбщее количество значений: %d", count);
                System.out.printf("\nСумма температур: %.2f°C", sum);
            } else {
                System.err.println("Нет корректных значений температуры для расчета.");
            }
        }
    }
}