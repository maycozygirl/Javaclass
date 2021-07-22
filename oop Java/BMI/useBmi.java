package BMI;

import java.util.Scanner;


public class useBmi {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fname,lname;
        float weight,height;

        student stu = new student();
        calBmi bmi = new calBmi();

        //รับชื่อ
        System.out.print("กรอกชื่อจริง :  ");
        fname = scan.nextLine();
        System.out.print("กรอกนามสกุล : ");
        lname = scan.nextLine();
        
        //ส่งชื่อ
        stu.SetName(fname, lname);

        //รับความสูง+น้ำหนัก
        System.out.print("กรอกน้ำหนัก : ");
        weight = scan.nextFloat();
        System.out.print("กรอกส่วนสูง : ");
        height = scan.nextFloat();


        //คำนวณBMI
        bmi.SetBMI(weight, height);
        //ปริ้น BMI
        System.out.println("*******************************");
        System.out.println("คุณ " + fname+ "  " +lname);
        bmi.GetBMI();
        System.out.println("*******************************");
    }
}
