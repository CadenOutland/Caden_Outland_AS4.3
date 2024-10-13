import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Abstract class representing a Job
abstract class Job {
    protected String companyName;
    protected String position;
    protected LocalDate startDate;
    protected LocalDate endDate;

    // Constructor to initialize job details
    public Job(String companyName, String position, LocalDate startDate, LocalDate endDate) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Method to display job details
    public void displayJobDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Position: " + position);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }

    // Method to calculate job duration in months
    public long calculateJobDuration() {
        return ChronoUnit.MONTHS.between(startDate, endDate);
    }

    // Abstract method to assess job satisfaction; must be implemented by subclasses
    public abstract String assessJobSatisfaction();
}
