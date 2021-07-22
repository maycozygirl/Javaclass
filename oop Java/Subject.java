import java.util.Scanner;

public class Subject {
    Scanner scan = new Scanner(System.in);
    private String IdSubject,NameSubject;
    private Float Unit;

    public void SetIdSubject(){
        System.out.println("Enter Subject ID: ");
        IdSubject = scan.next();
    }
    public String getIdSubject(){
        return IdSubject;
    }

    public void SetNameSubject(){
        System.out.print("Enter Subject name : ");
        NameSubject = scan.next();
    }
    public String getNameSubject(){
        return NameSubject;
    }

    public void SetUnit(float U){
        Unit = U;
    }

    public float getUnit(){
        System.out.print("Student Major : " +Unit);
        return Unit;
    }
  
}
