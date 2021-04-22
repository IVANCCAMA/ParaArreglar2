
public class Calculadora{
    public String valoresDeX(double a, double b, double c){
        double x1 = 0;
        double x2 = 0;
        if(a != 0){
            double dem = a*2;
            double aux1 = Math.sqrt(Math.pow(b,2) - (4*a*c));
            double num = -b+aux1;
            double num2 = -b-aux1;
            x1 = num/ dem;
            x2 =  num2/ dem;
        }else{
             return "no se puede";
        }
        return "Valores de x1 = " + x1 + ", x2 = " + x2;
    }
    public String ecuacionRecta(Punto a, Punto b){
        String ecuacion;
        double m;
        double numerico;
        m =(a.getY()-b.getY()) / (a.getX() - b.getX());
        numerico = (m * (-1*a.getX())) + a.getY();
        if(numerico > 0){
            ecuacion = "y = " + m + "x" + " + " + numerico;
        } else if(numerico < 0){
            ecuacion = "y = " + m + "x" + " " + numerico;
        } else {
            ecuacion = "y = " + m + "x";
        }
        return ecuacion;
    }
    public double catetoFaltante(double hip, double cateto){
        double x;
        if(hip > cateto){
            x = Math.sqrt(Math.pow(hip,2) - Math.pow(cateto,2));
        } else{
            x = 0;
        }
        return x;
    }
}
