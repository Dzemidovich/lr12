
package сom.enterprise;

public class SalariedEmployee extends Employee {
    private double bonus;

    public SalariedEmployee(String fullName, String position, double salary, double bonus) {
        super(fullName, position, salary);
        setBonus(bonus);
    }

    public double getBonus() { return bonus; }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            throw new InvalidBonusException("Премия не может быть отрицательной: " + bonus);
        }
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        try {
            // Защита на случай прямого изменения через рефлексию
            if (getBonus() < 0) {
                throw new InvalidBonusException("Премия не может быть отрицательной при расчете зарплаты");
            }
            return getSalary() + getBonus();
        } catch (InvalidBonusException e) {
            System.err.println("Ошибка при расчёте зарплаты штатного сотрудника: " + e.getMessage());
            return getSalary(); // возвращаем только оклад
        } catch (Exception e) {
            System.err.println("Неожиданная ошибка: " + e.getMessage());
            return getSalary();
        }
    }
}