import java.time.LocalDate;

// Class representing a full-time job, extending the Job abstract class
class FullTimeJob extends Job {
    private double hourlyWage;
    private int hoursPerWeek;

    // Constructor to initialize full-time job details
    public FullTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double hourlyWage, int hoursPerWeek) {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    // Method to assess job satisfaction for full-time jobs
    @Override
    public String assessJobSatisfaction() {
        // Simplified satisfaction evaluation
        return "Moderate"; // This could be based on various factors
    }

    // Method to calculate monthly salary based on hourly wage and hours worked
    public double calculateSalary() {
        return hourlyWage * hoursPerWeek * 4; // Assuming 4 weeks in a month
    }

    // Method to evaluate work-life balance based on hours worked per week
    public String evaluateWorkLifeBalance() {
        if (hoursPerWeek <= 40) return "Excellent";
        else if (hoursPerWeek <= 50) return "Moderate";
        else return "Poor";
    }
}
