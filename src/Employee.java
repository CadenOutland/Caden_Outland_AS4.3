import java.util.ArrayList;
import java.util.List;

// Class representing an Employee with a job history
class Employee {
    private String name;
    private List<Job> jobHistory;

    // Constructor to initialize the employee's name and job history
    public Employee(String name) {
        this.name = name;
        this.jobHistory = new ArrayList<>();
    }

    // Method to add a job to the employee's job history
    public void addJob(Job job) {
        jobHistory.add(job);
    }

    // Method to display the job history of the employee
    public void displayJobHistory() {
        for (Job job : jobHistory) {
            job.displayJobDetails();
            System.out.println("Job Duration (months): " + job.calculateJobDuration());
            System.out.println("Job Satisfaction: " + job.assessJobSatisfaction());
            System.out.println();
        }
    }

    // Method to calculate total work experience in months across all jobs
    public int calculateTotalWorkExperience() {
        int totalMonths = 0;
        for (Job job : jobHistory) {
            totalMonths += job.calculateJobDuration();
        }
        return totalMonths;
    }
}
