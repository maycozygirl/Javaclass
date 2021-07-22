package Method;

public class instanceMethod {
    public static void main(String[] args) {
        //เรียกตรงๆไม่ได้ ต้องประกาศObject เผื่อที่จะไปเรียกใช้
        instanceMethod insant = new instanceMethod();
        insant.instanceMethod1();
        System.out.println("Age : " + insant.instanceMethod2(19));
    }
    
    void instanceMethod1(){
        String Stu_name = "May";
        System.out.println("Student name : " + Stu_name);
    }
   
    int instanceMethod2(int a){
        int age = a ;
        return age;
    }
    

}

