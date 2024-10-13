import java.time.LocalDate;

public class HRAppOOPCoding {
    public static void main(String[] args) {
        // Create an Employee Object
        Employee employee = new Employee("John Doe");

        // Create instances of different job types
        FullTimeJob fullTimeJob = new FullTimeJob("Tech Corp", "Software Engineer", LocalDate.of(2020, 1, 1), LocalDate.of(2023, 1, 1), 30.0, 40);
        PartTimeJob partTimeJob = new PartTimeJob("Retail Store", "Sales Associate", LocalDate.of(2019, 6, 1), LocalDate.of(2020, 12, 1), 15.0, 20);
        ContractJob contractJob = new ContractJob("Consulting Agency", "Project Manager", LocalDate.of(2023, 2, 1), LocalDate.of(2024, 2, 1), 50.0, 160);

        // Add jobs to the employee's job history
        employee.addJob(fullTimeJob);
        employee.addJob(partTimeJob);
        employee.addJob(contractJob);

        // Display the job history and total work experience
        employee.displayJobHistory();
        System.out.println("Total Work Experience (months): " + employee.calculateTotalWorkExperience());
    }
}
