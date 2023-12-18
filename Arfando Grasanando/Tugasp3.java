
package com.mycompany.tugasp3;

class Job {
    String jobTitle;
    String companyName;
    int salary;
    int experienceYears;
    
    public Job() {

    }

    public Job(String jobTitle, String companyName, int salary, int experienceYears) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.experienceYears = experienceYears;
    }

    public int displayJobDetails() {
        salary = salary * experienceYears;
        
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company Name: " + companyName);
        System.out.println("Salary: " + salary);
        return salary;
    }

    public static void main(String[] args) {
        Job softwareEngineer = new Job("Software Engineer", "TechCorp", 80000, 3);

        System.out.println("Job Details:");
        softwareEngineer.displayJobDetails();
    }
}
