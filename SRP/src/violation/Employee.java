package violation;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateNetSalary() {
        return salary - (salary * 0.2);
    }

    public void saveToDatabase() {
        System.out.println("Employee saved to database");
    }
}
