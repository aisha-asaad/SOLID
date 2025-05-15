package compliance;

public class SalaryCalculator {
    public double calculateNetSalary(Employee employee) {
        return employee.getSalary() - (employee.getSalary() * 0.2);
    }
}

