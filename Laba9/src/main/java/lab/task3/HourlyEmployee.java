package lab.task3;


public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursPerMonth;

    public HourlyEmployee(String id, String name, double hourlyRate, int hoursPerMonth) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursPerMonth = hoursPerMonth;
    }

    @Override
    public double getMonthlySalary() {
        return hourlyRate * hoursPerMonth;
    }
}