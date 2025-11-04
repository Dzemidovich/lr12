package сom.enterprise;


public class Department {
    private String name;
    private int employeeCount;

    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название отдела не может быть пустым");
        }
        this.name = name;
    }

    public int getEmployeeCount() { return employeeCount; }
    public void setEmployeeCount(int employeeCount) {
        if (employeeCount < 0) {
            throw new IllegalArgumentException("Количество сотрудников не может быть отрицательным");
        }
        this.employeeCount = employeeCount;
    }
}