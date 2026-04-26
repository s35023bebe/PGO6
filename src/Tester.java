public class Tester extends Employee {
    private boolean automationTester;
    private int scenarioCount;

    public Tester(String employeeId, String firstName, String lastName, double baseSalary, boolean automationTester, int scenarioCount) {
        super(employeeId, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    @Override
    public double calculateMonthlyCost() {
        // Automation testers might have a higher cost/bonus structure
        double bonus = automationTester ? 500.0 : 0.0;
        return getBaseSalary() + bonus;
    }

    @Override
    public String introduceYourself() {
        return "Hello, I'm a Tester. I've covered " + scenarioCount + " test scenarios.";
    }

    public void runTestingReport() {
        System.out.println("Running report for " + scenarioCount + " scenarios. Automation: " + automationTester);
    }
}