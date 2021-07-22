import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ID,fname,lname,major;
        float Unit;

        Student stu = new Student();
        Subject sub = new Subject();

        //input ID
        System.out.print("Enter ID Student = ");
        ID = scan.nextLine();
        stu.SetID(ID);
        stu.getID();
        //input Name
        System.out.print("Enter Student Firstname = ");
        fname = scan.nextLine();
        System.out.print("Enter Student Lastname = ");
        lname = scan.nextLine();
        stu.SetName(fname, lname);
        //input Major
        System.out.print("Enter Major = ");
        major = scan.nextLine();
        stu.SetMajor(major);
        stu.getMajor();

        //input ID Subject
        sub.SetIdSubject();
        System.out.print("ID Subject : " +sub.getIdSubject());
        //input namesubject
        sub.SetNameSubject();
        System.out.print("Name Subject : " +sub.getNameSubject());
        //input Unit 
        System.out.print("Enter Unit = ");
        Unit = scan.nextFloat();
        sub.SetUnit(Unit);
        sub.getUnit();

        
    }
}
