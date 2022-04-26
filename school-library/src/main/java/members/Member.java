package members;

import interfaces.SchoolLogo;

public class Member implements SchoolLogo {
    //Fields
    private String userId;
    private String firstName;
    private String lastName;
    private Integer yearOfBirth;

    //Constructor

    public Member() {
    }

    public Member(String memberId, String firstName, String lastName, Integer yearOfBirth) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    //Getters and setters


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    //Methods
    public Integer maxOfBooksAllowed(){
        return  12;
    }

    //ToString


    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    @Override
    public String deerLogo() {
        System.out.println("Logo: DeerLogo");
        return null;
    }

    @Override
    public String color() {
        System.out.println("Color: Brown");
        return null;
    }
}
