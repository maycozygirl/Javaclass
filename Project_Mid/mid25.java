import java.util.Scanner;


public class mid25 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
        int Row = 5;
        int Colum  = 1;
        int buy;
        int amount;
        float sale;
        int [][]ID = new int[Row][Colum];
        String [][]Name = new String[Row][Colum];
        int [][]Price = new int[Row][Colum];
        
        for (int i = 0; i < Row; i++ ){
            for(int j = 0; j < Colum; j++){
                System.out.println(".................................. ");
                System.out.print("Enter ID Product  : ");
                ID [i][j] = scanner.nextInt(); 
                System.out.print("Enter Name Product : ");
                Name[i][j] = scanner.next();
                System.out.print("Enter Price Product : ");
                Price[i][j] = scanner.nextInt();
              }
              
            }

            System.out.println("..........................................."); 
            System.out.println("ID"+"\t\t"+"Name"+"\t\t"+"Price"); 
            System.out.println("..........................................."); 

             for (int i = 0; i < Row; i++ ){
                for(int j = 0; j < Colum; j++){
                    System.out.println(""+ID[i][j]+"\t\t"+Name[i][j]+"\t\t"+Price[i][j]); 
                }
            }

            /*System.out.println("..........................................."); 
            System.out.print("กรอกรหัสสินค้าที่ต้องการ = "); 
            buy = scanner.nextInt(); 
            System.out.print("กรอกจำนวนสินค้า = "); 
            amount = scanner.nextInt(); */

            System.out.println("..........................................."); 
            System.out.print("กรอกรหัสสินค้าที่ต้องการ = "); 
            buy = scanner.nextInt(); 
            System.out.print("กรอกจำนวนสินค้า = "); 
            amount = scanner.nextInt(); 

            if (amount >= 2){
                if (buy == ID[0][0]){
                    sale = Price[0][0]*amount*10/100;
                    System.out.print(sale);
                }
                else if (buy == ID[1][0]){
                    sale = Price[1][0]*amount*10/100;
                    System.out.print(sale); 
                }
                else if (buy == ID[2][0]){
                    sale = Price[2][0]*amount*10/100;
                    System.out.print(sale); 
                }
                else if (buy == ID[3][0]){
                    sale = Price[3][0]*amount*10/100;
                    System.out.print(sale); 
                }
                else if (buy == ID[4][0]){
                    sale = Price[4][0]*amount*10/100;
                    System.out.print(sale); 
                } 
                
                if (buy == ID[0][0]){
                    sale = Price[0][0]*5/100;
                    System.out.print(sale);
                }
                else if (buy == ID[1][0]){
                    sale = Price[1][0]*5/100;
                    System.out.print(sale); 
                }
                else if (buy == ID[2][0]){
                    sale = Price[2][0]*5/100;
                    System.out.print(sale); 
                }
                else if (buy == ID[3][0]){
                    sale = Price[3][0]*5/100;
                    System.out.print(sale); 
                }
                else if (buy == ID[4][0]){
                    sale = Price[4][0]*5/100;
                    System.out.print(sale); 
            } 
        
            
        }
            
    
    }
}
        
        
        
    

    

