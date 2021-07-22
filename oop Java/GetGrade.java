import java.util.Scanner;

public class GetGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float Bo1,Bo2,mid,fin,psy;
        Grade grade = new Grade();

       //รับค่าคะแนน
       System.out.print("Enter Bo1Score : ");
       Bo1 = scan.nextFloat();
       grade.setScoreBo1(Bo1);
       System.out.print("Enter Bo2Score :");
       Bo2 = scan.nextFloat();
       grade.SetScoreBo2(Bo2);
       System.out.print("Enter MidtermScore :");
       mid = scan.nextFloat();
       grade.SetScoreMid(mid);
       System.out.print("Enter FinalScore :");
       fin = scan.nextFloat();
       grade.SetScoreFinal(fin);
       System.out.print("Enter PsycheScore :");
       psy = scan.nextFloat();
       grade.SetScorePsy(psy);
    
       grade.getTotal();
       grade.getGrade();

    }
   


}