
public class areacircle extends area {
    public float radius , areacircle;

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getRadius(){
        return radius;
    }
    
    public float getCirclearea(){
        areacircle = (3.14f)*(radius*radius);
        return areacircle;
    }




}
