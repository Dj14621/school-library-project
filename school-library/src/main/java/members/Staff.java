package members;

public class Staff extends Member{
    //Fields
    private String jobTitle;
    private String department;

    //Constructor


    public Staff(String jobTitle, String department) {
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public Staff(String memberId, String firstName, String lastName, Integer yearOfBirth, String jobTitle, String department) {
        super(memberId, firstName, lastName, yearOfBirth);
        this.jobTitle = jobTitle;
        this.department = department;
    }

    //Getters and setters

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //Methods

    //ToString


    @Override
    public String toString() {
        return "Staff{" +
                "jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
