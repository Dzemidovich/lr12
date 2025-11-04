package lab.task3;

// Сотрудник с фиксированной зарплатой
public class FixedSalaryEmployee extends Employee {
    private double monthlySalary;

    public FixedSalaryEmployee(String id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getMonthlySalary() {
        return monthlySalary;
    }
}