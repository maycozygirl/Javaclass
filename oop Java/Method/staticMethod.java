package Method;

public class staticMethod {

    public static void main(String[] args) {
        staticMethod1();
        System.out.println(staticMethod2());
        area();
    }
    
    static void staticMethod1() {
        int age = 18;
        System.out.println("Age = " + age);
    }
    static int staticMethod2() {
        int age = 20;
        return  age ;
    }
    static float area() {
        int age =20;
        return age; 
    }
    float area(float a){
        float age = a;
        return age;
    }
}
