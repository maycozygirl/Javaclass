package Method;

public class overload {
    public static String firstname,lastname;
    public static int Age ;

    public static void Student(String fname , String lname){
        firstname = fname;
        lastname = lname;
        System.out.println("Firstname :  "+firstname + "   " + "lastname :  "+lastname);

    }
    public static void Student(int age){
        Age = age;
        System.out.println("Age : " + Age);
    }
}
