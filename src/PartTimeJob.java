import java.time.LocalDate;

// Class representing a part-time job, extending the Job abstract class
class PartTimeJob extends Job {
    private double hourlyWage;
    private int hoursPerWeek;

    // Constructor to initialize part-time job details
    public PartTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double hourlyWage, int hoursPerWeek) {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    // Method to assess job satisfaction for part-time jobs
    @Override
    public String assessJobSatisfaction() {
        return "High"; // Assume part-time jobs are often considered more satisfying
    }

    // Method to calculate weekly income based on hourly wage and hours worked
    public double calculateWeeklyIncome() {
        return hourlyWage * hoursPerWeek;
    }

    // Method to evaluate flexibility based on hours worked per week
    public String evaluateFlexibility() {
        return hoursPerWeek < 20 ? "High Flexibility" : "Low Flexibility";
    }
}
