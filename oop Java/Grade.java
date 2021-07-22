public class Grade {
    
    private float ScoreBo1,ScoreBo2,ScoreMid,Scorefinal,Scorepsy,Total,grade;

    public void setScoreBo1(float Bo1){
        ScoreBo1 = Bo1;
    }

    public float getScoreBo1(){
        System.out.print("Score Bo1 : "+ScoreBo1);
        return ScoreBo1;
    }

    public void SetScoreBo2(float Bo2){
        ScoreBo2 = Bo2;
    }

    public float getScoreBo2(){
        System.out.print("Score Bo2 : "+ScoreBo2);
        return ScoreBo2;
    }

    public void SetScoreMid(float mid){
        ScoreMid = mid;
    }

    public float getScoreMid(){
        System.out.print("Score Mid : "+ScoreMid);
        return ScoreMid;
    }

    public void SetScoreFinal(float fi){
        Scorefinal = fi;
    }

    public float getScoreFinal(){
        System.out.print("Score Mid : "+Scorefinal);
        return Scorefinal;
    }

    public void SetScorePsy(float psy){
        Scorepsy = psy;
    }

    public float getScorepsy(){
        System.out.print("Score Mid : "+Scorepsy);
        return Scorepsy;
    }

    public float getTotal(){
        Total = ScoreBo1+ScoreBo2+ScoreMid+Scorefinal+Scorepsy;
        System.out.println("Total : "+Total + "คะแนน");
        return Total;
    }

    public float getGrade(){
        if (Total>80 && Total<100){
            grade = 4.00f;
            System.out.println("คุณได้เกรด 4.00");
        }else if (Total>75 && Total<79.99){
            grade = 3.50f;
            System.out.println("คุณได้เกรด 3.50");
        }else if (Total>70 && Total<74.99){
            grade = 3.00f;
            System.out.println("คุณได้เกรด 3.00");
        }else if (Total>65 && Total<69.99){
            grade = 2.50f;
            System.out.println("คุณได้เกรด 2.50");
        }else if (Total>60 && Total<64.99){
            grade = 2.00f;
            System.out.println("คุณได้เกรด 2.00");
        }else if (Total>55 && Total<59.99){
            grade = 1.50f;
            System.out.println("คุณได้เกรด 1.50");
        }else if (Total>50 && Total<49.99){
            grade = 1.00f;
            System.out.println("คุณได้เกรด 1.50");
        }else {
            grade = 0;
            System.out.println("คุณได้เกรด 0");
        }
        return grade;
    }
        
}
