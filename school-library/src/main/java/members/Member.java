package members;

public class Member {
    //Fields
    private String memberId;
    private String firstName;
    private String lastName;
    private Integer yearOfBirth;

    //Constructor

    public Member() {
    }

    public Member(String memberId, String firstName, String lastName, Integer yearOfBirth) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    //Getters and setters

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
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
                "memberId='" + memberId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
