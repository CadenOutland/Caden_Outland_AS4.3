import java.time.LocalDate;

// Class representing a contract job, extending the Job abstract class
class ContractJob extends Job {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor to initialize contract job details
    public ContractJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double hourlyRate, int hoursWorked) {
        super(companyName, position, startDate, endDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Method to assess job satisfaction for contract jobs
    @Override
    public String assessJobSatisfaction() {
        return "Variable"; // Job satisfaction can vary significantly in contract roles
    }

    // Method to calculate total payment based on hourly rate and hours worked
    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }

    // Method to evaluate job security based on contract duration and company stability
    public String evaluateJobSecurity() {
        return "Medium"; // Job security can depend on various external factors
    }
}
