public class bmi {

    private int hight;
    private float weight;
    private float bmi;
    private String calbmi;


    public void calbmi(int hight, float weight){
        this.hight = hight;
        this.weight = weight;

        hight = hight/100;
        bmi = (weight/(hight*hight));
    }
    public String getbmi(){
        calbmi = String.format("%.2f",bmi);
        return calbmi;
    }
}