package lab.task3;

import java.util.*;

public class Task3Runner {

    public static String getMiddleTwoChars(String s) {
        if (s == null || s.length() % 2 != 0 || s.length() < 2) {
            throw new IllegalArgumentException("Длина строки должна быть чётной и >=2");
        }
        int mid = s.length() / 2;
        return s.substring(mid - 1, mid + 1);
    }

    public static void main(String[] args) {
        System.out.println("=== ЗАДАНИЕ 3: СОТРУДНИКИ И СТРОКИ ===");

        List<Employee> employees = new ArrayList<>();
        employees.add(new FixedSalaryEmployee("E001", "Анна", 70000));
        employees.add(new HourlyEmployee("E002", "Борис", 500, 160));   // 80 000
        employees.add(new FixedSalaryEmployee("E003", "Виктор", 70000));
        employees.add(new HourlyEmployee("E004", "Алексей", 400, 150)); // 60 000
        employees.add(new FixedSalaryEmployee("E005", "Зоя", 80000));
        employees.add(new FixedSalaryEmployee("E006", "Елена", 80000));



        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {

                int salaryCompare = Double.compare(e2.getMonthlySalary(), e1.getMonthlySalary());
                if (salaryCompare != 0) {
                    return salaryCompare;
                }

                return e1.getName().compareTo(e2.getName());
            }
        });


        System.out.println("\nA) Отсортированные сотрудники:");
        System.out.printf("%-6s %-12s %12s%n", "ID", "Имя", "ЗП (мес)");
        System.out.println("-------------------------------------------------");
        for (Employee e : employees) {
            System.out.printf("%-6s %-12s %12.0f%n",
                    e.getId(), e.getName(), e.getMonthlySalary());
        }


        System.out.println("\nB) Первые 5 имён:");
        int limit = 5;
        for (int i = 0; i < Math.min(limit, employees.size()); i++) {
            System.out.println(employees.get(i).getName());
        }


        System.out.println("\nC) Последние 3 ID:");
        List<String> allIds = new ArrayList<>();
        for (Employee e : employees) {
            allIds.add(e.getId());
        }
        int total = allIds.size();
        int start = Math.max(0, total - 3);
        for (int i = start; i < total; i++) {
            System.out.println(allIds.get(i));
        }


        System.out.println("\nДоп: средние символы строк:");
        String[] tests = {"string", "code", "Practice"};
        for (String s : tests) {
            System.out.println(s + " → " + getMiddleTwoChars(s));
        }


        Employee[] arr = employees.toArray(new Employee[0]);
        Report.generateReport(arr);
    }
}


class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("\nОтчёт по зарплатам:");
        System.out.printf("%-20s %12s%n", "Сотрудник", "Зарплата");
        System.out.println("----------------------------------------");
        for (Employee emp : employees) {
            System.out.printf("%-20s %12.2f%n",
                    emp.getName(), emp.getMonthlySalary());
        }
    }
}