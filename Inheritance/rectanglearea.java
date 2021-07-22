
public class rectanglearea extends areacircle{
    public float length, arearectangle;
    
    public void setlength(float length) {
        this.length = length;
    }
    public float getlength(){
        return length;
    }
    
    public float getRectanglearea(){
        arearectangle =  Width*length;
        return arearectangle;
    }


}
