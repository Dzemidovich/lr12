package сom.enterprise;

public abstract class Employee {
    private String fullName;
    private String position;
    private double salary;

    public Employee(String fullName, String position, double salary) {
        setFullName(fullName);
        setPosition(position);
        setSalary(salary);
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("ФИО не может быть пустым");
        }
        this.fullName = fullName;
    }

    public String getPosition() { return position; }
    public void setPosition(String position) {
        if (position == null || position.trim().isEmpty()) {
            throw new IllegalArgumentException("Должность не может быть пустой");
        }
        this.position = position;
    }

    public double getSalary() { return salary; }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new InvalidSalaryException("Оклад не может быть отрицательным: " + salary);
        }
        this.salary = salary;
    }

    public abstract double calculateSalary();
}