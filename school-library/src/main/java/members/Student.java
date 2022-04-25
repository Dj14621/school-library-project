package members;

public class Student extends Member{

    //Fields
    private Integer grade;
    private Character gender;

    //Constructor

    public Student(Integer grade, Character gender) {
        this.grade = grade;
        this.gender = gender;
    }

    public Student(String memberId, String firstName, String lastName, Integer yearOfBirth, Integer grade, Character gender) {
        super(memberId, firstName, lastName, yearOfBirth);
        this.grade = grade;
        this.gender = gender;
    }

    //Getters and Setters

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    //Methods
    public String AddBookTitle(){
        return "";
    }
    //ToSTRING


    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", gender=" + gender +
                '}';
    }
}
