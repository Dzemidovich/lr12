package com.enterprise;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PersonalInfoFile {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
        String fileName = desktopPath + File.separator + "demidovich_info.txt";

        try {
            createPersonalInfoFile(fileName);
            displayFileInfo(fileName);
            displayFileContent(fileName);

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }

    private static void createPersonalInfoFile(String fileName) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            writer.write("Личная информация: Демидович Андрей\n");
            writer.write("Возраст: 20 лет\n");
            writer.write("Любимая серия игр: Mafia\n");
            writer.write("Любимая часть: Mafia: Definitive Edition\n");
            writer.write("Любимый персонаж: Томми Анджело\n");
            writer.write("Нравится: атмосфера 30-х годов, сюжет, музыка\n");
            writer.write("Дата создания: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")) + "\n");
        }
        System.out.println("Файл '" + fileName + "' успешно создан на рабочем столе!");
    }

    private static void displayFileInfo(String fileName) throws IOException {
        Path filePath = Paths.get(fileName);
        File file = filePath.toFile();

        System.out.println("\n=== ИНФОРМАЦИЯ О ФАЙЛЕ ===");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Последнее изменение: " + new java.util.Date(file.lastModified()));
        System.out.println("Существует: " + (file.exists() ? "да" : "нет"));
        System.out.println("Можно читать: " + (file.canRead() ? "да" : "нет"));
        System.out.println("Можно писать: " + (file.canWrite() ? "да" : "нет"));
        System.out.println("Это директория: " + (file.isDirectory() ? "да" : "нет"));
    }

    private static void displayFileContent(String fileName) throws IOException {
        System.out.println("\n=== СОДЕРЖИМОЕ ФАЙЛА ===");
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        }
    }
}