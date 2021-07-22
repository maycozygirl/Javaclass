
public class Student {

    //Attribute  ใช้ได้ทั้ง Class
    private String Id ; 
    private String StuFirstName ;
    private String StuLastName ;  
    private String Major ; 


    public void SetID(String num){
            Id = num;
    }

    public String getID(){
        System.out.println("Student ID : " +Id);
        return Id;
       
    }

    public void SetName(String Fname , String Lname){
        StuFirstName = Fname;
        StuLastName = Lname;
        System.out.print("Student Firstname : " +StuFirstName+"\t");
        System.out.println("Lastname : "+StuLastName);
    }

    public void SetMajor(String Ma){
        Major = Ma;
    }

    public String getMajor(){
        System.out.print("Student Major : " +Major);
        return Major;
    }
}




