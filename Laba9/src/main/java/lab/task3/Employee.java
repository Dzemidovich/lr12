package lab.task3;


public abstract class Employee implements Comparable<Employee> {
    protected String id;
    protected String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public abstract double getMonthlySalary();


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Employee other) {


        int salaryComparison = Double.compare(other.getMonthlySalary(), this.getMonthlySalary());
        if (salaryComparison != 0) {
            return salaryComparison;
        }
        // Если зарплаты равны — сравниваем по имени (алфавит, по возрастанию)
        return this.name.compareTo(other.name);
    }
}