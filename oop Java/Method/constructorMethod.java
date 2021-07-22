package Method;

// Method ทีชื่อเดียวกับคลาส จะเรียกใช้ได้เลย

public class constructorMethod {

    public String fname,lname;
    public int Age;

    public String name(String N){
        fname = N;
        return fname;
    }
    public String lname(String L){
        lname = L;
        return lname;
    }
    public int age(int A){
        Age = A;
        return Age;
    }

    constructorMethod(){
        fname =" ";
        lname = " ";

        System.out.println(fname+ " "+lname);
    }
}
