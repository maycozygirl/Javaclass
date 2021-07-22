
public class area  {
    public float Width, Height;

    public void setWidth(float Width){
        this.Width = Width;
        //พอมี this จะรู้ว่าตัวไหน เวลาตั้งซ้ำกัน
    }
    public float getWidth(){
        return Width;
    }
    public void setHeight(float Height){
        this.Height = Height;
        //พอมี this จะรู้ว่าตัวไหน เวลาตั้งซ้ำกัน
    }
    public float getHeight(){
        return Height;
    }

}
