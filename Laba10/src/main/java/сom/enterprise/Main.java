package сom.enterprise;

public class Main {
    public static void main(String[] args) {

        try {
            createEmployeeWithNegativeSalary();
        } catch (IllegalArgumentException e) {
            System.err.println("Невозможно создать сотрудника – " + e.getMessage());
        }


        try {
            var emp2 = new SalariedEmployee("Демидович А.И", "Аналитик", 60000, 5000);
            System.out.println("Зарплата штатного сотрудника: " + emp2.calculateSalary());
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка при создании сотрудника: " + e.getMessage());
        }


        try {
            var emp3 = new ContractEmployee("Гаврук А.А.", "Тестировщик", 50000);
            System.out.println("Зарплата контрактника: " + emp3.calculateSalary());
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }


        testSalaryCalculationExceptions();
    }

    private static void createEmployeeWithNegativeSalary() {
        try {
            var emp1 = new SalariedEmployee("Слыш Д.В.", "Программист", -50000, 10000);
            System.out.println("Создан сотрудник: " + emp1.getFullName());
        } catch (IllegalArgumentException e) {
            System.err.println("Перехвачено исключение: " + e.getMessage());
            throw e;
        }
    }

    private static void testSalaryCalculationExceptions() {
        System.out.println("\n=== Тестирование обработки исключений в calculateSalary() ===");


        try {
            var emp = new SalariedEmployee("Тестовый Сотрудник", "Тестер", 50000, 10000);


            var field = SalariedEmployee.class.getDeclaredField("bonus");
            field.setAccessible(true);
            field.set(emp, -1000.0);

            System.out.println("Результат расчета с отрицательной премией: " + emp.calculateSalary());

        } catch (Exception e) {
            System.err.println("Ошибка при тестировании: " + e.getMessage());
        }
    }
}