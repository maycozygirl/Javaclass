import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Row = 3;
        int Colum = 3;
        String [][]name = new String[Row][Colum];

        for (int i = 0; i < Row; i++ ){
            for(int j = 0; j < Colum; j++){
                System.out.println("Name : ");
                name[i][j] = scanner.next(); 
            }
        }

        for (int i = 0; i < Row; i++ ){
            for(int j = 0; j < Colum; j++){
                System.out.println(""+name[i][j]);
            }
            System.out.println();
        }
    }
}
