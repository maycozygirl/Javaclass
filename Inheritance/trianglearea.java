public class trianglearea extends rectanglearea {
    public float base, areatriangle;
    
    public void setbase(float base) {
        this.base = base;
    }
    public float getbase(){
        return base;
    }
    
    public float gettrianglearea(){
        areatriangle =  ((0.5f)*base*Height);
        return areatriangle;
    }
}
