public class Developer extends Employee {
    private String mainLanguage;
    private int repositoryCount;

    public Developer(String employeeId, String firstName, String lastName, double baseSalary, String mainLanguage, int repositoryCount) {
        // Calling parent constructor
        super(employeeId, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }

    @Override
    public double calculateMonthlyCost() {
        // Let's say developers get a small bonus per repository
        return getBaseSalary() + (repositoryCount * 50);
    }

    @Override
    public String introduceYourself() {
        return "Hi, I'm a Developer. I code in " + mainLanguage + ".";
    }

    // Specific method for Developer
    public void printTechnologies() {
        System.out.println("Developer's main stack: " + mainLanguage);
    }
}