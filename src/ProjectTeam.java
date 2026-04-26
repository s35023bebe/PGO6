import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    private ArrayList<Employee> employees;

    public ProjectTeam(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printTeamMembers() {
        System.out.println("Project: " + projectName);
        for (Employee e : employees) {
            // Polymorphism: toString() from the specific child class is called
            System.out.println(e);
        }
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Employee e : employees) {
            // Polymorphism: appropriate calculateMonthlyCost() is called
            total += e.calculateMonthlyCost();
        }
        return total;
    }

    // Requirements: Safe cast using instanceof
    public void printDevelopers() {
        System.out.println("Developers in team:");
        for (Employee e : employees) {
            if (e instanceof Developer) {
                Developer dev = (Developer) e; // Safe cast
                dev.printTechnologies();
            }
        }
    }
}