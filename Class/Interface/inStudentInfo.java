package Interface;

public class inStudentInfo implements interfaceStudent{

    private String stuName, major;
    private int age;
    private char grade;

    public void setName() {
        stuName = "Paveetida";
        System.out.println("Student Name = " + stuName);
    }

    public void setAge() {
        age = 10;
        System.out.println("Age = " + age);
    }

    public void setMajor() {
        major = "Computer ";
        System.out.println("Major = " + major);
    }

    public void setGrade() {
        grade = 'A';
        System.out.println("Grade = " + grade);
    }
    
}
