package Abstract;
import java.util.Scanner;


public class saleproduct extends product {
    private String Id ,Name;
    private int Price ,Amount ,sale ;
    private float total,discount;
    Scanner scanner = new Scanner(System.in);

    public void detialProduct () {
        System.out.print("Id Product  : " );
        Id = scanner.nextLine();
        System.out.print("Name Product  : " );
        Name = scanner.nextLine();
        System.out.print("Price Product : ");
        Price = scanner.nextInt();
        System.out.print("Amount Product  : " );
        Amount = scanner.nextInt();
    }

    public void buyProduct() {
        total = Price*Amount;
        System.out.println("Total price  : " +total);

        if (total>= 10000){
            discount = total*(0.01f);
            System.out.println("Discount :  "+discount);
            total = total-discount;
            System.out.println("Total Discount :  "+total);
        }else if (total>8000 && total<= 9999){
            discount = total*(0.05f);
            System.out.println("Discount :  "+discount);
            total = total-discount;
            System.out.println("Total Discount :  "+total);
        }else if (total>6000 && total<= 7999){
            discount = total*(0.03f);
            System.out.println("Discount :  "+discount);
            total = total-discount;
            System.out.println("Total Discount :  "+total);
        }else 
          System.out.println("Don't have Discount");
        }
    
}
