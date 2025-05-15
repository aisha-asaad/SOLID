package compliance;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Salma", 10000);

        SalaryCalculator calculator = new SalaryCalculator();
        double net = calculator.calculateNetSalary(emp);
        System.out.println("Net salary: " + net);

        EmployeeRepository repo = new EmployeeRepository();
        repo.save(emp);
    }
}
