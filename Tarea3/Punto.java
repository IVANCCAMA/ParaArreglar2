
public class Punto{
    private double a,b;
    public Punto(double x, double y){
        a = (double)x;
        b = (double)y;
    }
    
    public double getX(){
        return a;
    }
    
    public void setX(double x){
        a = x;
    }
    
    public double getY(){
        return b;
    }
    
    public void setY(double y){
        b = y;
    }
}
