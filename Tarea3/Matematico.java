
public class Matematico{
    Calculadora calculadora;
    
    public String usarCalculadora(Calculadora calcu){
        String reporte;
        calculadora = calcu;
        reporte= "usando calculadora";
        return reporte;
    }
    public String valoresDeX(double a, double b, double c){
        String valores;
        if(calculadora != null){
            valores = calculadora.valoresDeX(a,b,c);
        }else{
            valores = "añada una calculadora";
        }
        return valores; 
    }
    public String ecuacionRecta(Punto a, Punto b){
        String ecuacion;
        if(calculadora != null){
            ecuacion = calculadora.ecuacionRecta(a,b);
        }else{
            ecuacion = "añada calculdaora";
        }
        return ecuacion;
    }
    public String catetoFaltante(double hip, double cateto){
        String x;
        if(calculadora != null){
            x = "cateto faltante = " + calculadora.catetoFaltante(hip,cateto);
        }else{
            x = "anañada calculadora";
        }
        return x;
    }
}
