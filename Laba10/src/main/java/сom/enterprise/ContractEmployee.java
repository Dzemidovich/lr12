package сom.enterprise;

public class ContractEmployee extends Employee {
    public ContractEmployee(String fullName, String position, double salary) {
        super(fullName, position, salary);
    }

    @Override
    public double calculateSalary() {
        try {
            return getSalary() * 1.2;
        } catch (Exception e) {
            System.err.println("Ошибка при расчёте зарплаты контрактного сотрудника: " + e.getMessage());
            return getSalary();
        }
    }
}