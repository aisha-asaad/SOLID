package compliance;

public class EmployeeRepository {
    public void save(Employee employee) {
        System.out.println("Saving employee " + employee.getName() + " to database...");
        // هنا تقدر تضيف كود JDBC أو ORM زي Hibernate
    }
}
