import java.util.Scanner;

public class Arraywork {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int Row = 2;
        int Colum  = 1;
        String [][]name = new String[Row][Colum];
        String [][]room = new String[Row][Colum];
        String [][]Subject = new String[Row][Colum];
        String [][]Score = new String[Row][Colum];
     
        for (int i = 0; i < Row; i++ ){
            for(int j = 0; j < Colum; j++){
                System.out.print("Name : ");
                name[i][j] = Scanner.next(); 
                System.out.print("room: ");
                room[i][j] = Scanner.next();
                System.out.print("Subject : ");
                Subject[i][j] = Scanner.next();
                System.out.print("Score : ");
                Score[i][j] = Scanner.next();
            }
        }
        
        for (int i = 0; i < Row; i++ ){
            for(int j = 0; j < Colum; j++){
                System.out.print(""+name[i][j]); 
                System.out.print(""+room[i][j]);  
                System.out.print(""+Subject[i][j]); 
                System.out.print(""+Score[i][j]);
            }

            System.out.println("");
            
        }




        
    }
}
