import java.util.Objects;
public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private double baseSalary;
    public Employee(String employeeId, String firstName, String lastName, double baseSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }
    // Requirements: final method in parent class
    public final String getEmployeeId() {
        return employeeId;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double calculateMonthlyCost() {
        return baseSalary;
    }
    public String introduceYourself() {
        return "I am an employee: " + firstName + " " + lastName;
    }
    // Requirements: Overridden toString() for readable output
    @Override
    public String toString() {
        return "ID: " + employeeId + ", Name: " + firstName + " " + lastName + ", Salary: " + baseSalary;
    }
    // Requirements: Overridden equals() comparing by employeeId
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId);
    }
}