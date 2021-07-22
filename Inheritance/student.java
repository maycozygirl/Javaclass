
public class student extends person {
    
    private String  maJor;

    public void setmaJor(String maJor){
        this.maJor = maJor;
        //พอมี this จะรู้ว่าตัวไหน เวลาตั้งซ้ำกัน
    }

    public String getmaJor(){
        return maJor;
    }
}
