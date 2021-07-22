import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        trianglearea area = new trianglearea();
        
        System.out.print("width :  ");
        area.setWidth(scan.nextFloat());
        System.out.print("Height :  ");
        area.setHeight(scan.nextFloat());
        System.out.print("Radius :  ");
        area.setRadius(scan.nextFloat());
        System.out.print("length :  ");
        area.setlength(scan.nextFloat());
        System.out.print("base :  ");
        area.setbase(scan.nextFloat());


        /*System.out.println(area.Width);
        System.out.println(area.Height);
        System.out.println(area.radius);
        System.out.println(area.length);
        System.out.println(area.base);*/

        System.out.println("**********************************");
        System.out.println("Circle Area :  "+area.getCirclearea());
        System.out.println("Rectangle Area :  "+area.getRectanglearea());
        System.out.println("triangle Area :  "+area.gettrianglearea());
        System.out.println("**********************************");
    }
    

}
