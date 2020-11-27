package practicapoo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Punto {
    private double x;
    private double y;
    private static int numeroPuntos;
// Constructores
    Punto(){
        this.x=0;
        this.y=0;
        numeroPuntos++;
    }    
    Punto(double x, double y){
        this.x=x;
        this.y=y;
        numeroPuntos++;
    }
    Punto (Punto p){
        this.x=p.x;
        this.y=p.y;
        numeroPuntos++;
    }
    public double getX() {
        return x;
    }
//get y set de campos encapsulados
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public static int getNumeroPuntos() {
        return numeroPuntos;
    }
//Métodos
    
    public static double Distancia(Punto p1, Punto p2){
        double d;
        d=Math.sqrt( Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
        return d;
    }
    //pasamos un punto como objeto que llama al método y el otro como parámetro
    public double Distancia (Punto p){
        double d;
        d= Distancia(this, p);
        return d;
    }
    public static double  AreaTriangulo (Punto p1, Punto p2, Punto p3){
        double area=0, lon1, lon2, lon3, p;
        lon1 = Distancia (p1,p2);
        lon2 = Distancia (p2,p3);
        lon3 = Distancia (p3,p1);
        p=(lon1+lon2+lon3)/2;
        area=Math.sqrt(p*(p-lon1)*(p-lon2)*(p-lon3));
        return area;
    }
//Metodos imprimir resultados    
    public static void ImprimePunto (Punto p){
        System.out.println("("+ p.x + "," + p.y+ ")");
    }    
/*    public static void ImprimePunto (Punto p){
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();//no funciona bien
        simbolos.setDecimalSeparator(',');
        DecimalFormat f = new DecimalFormat("##,#");
        System.out.println("("+ f.format(p.x) + "," + f.format(p.y)+ ")");
    }*/
    
    public String ImprimePunto (){
        String resultado;
        resultado= "("+ this.x + "," +this.y + ")";     
        return resultado;
    }
    @Override
    public String toString (){
        String resultado;
        resultado= "("+ this.x + "," +this.y + ")";     
        return resultado;
    }
    
    public static String ImprimeArea (Punto p1, Punto p2, Punto p3){
        String resultado;
        resultado = "El area del triángulo formada por los puntos: ";
        resultado= resultado+ p1.ImprimePunto();
        resultado= resultado+ p2.ImprimePunto();
        resultado= resultado+ p3.ImprimePunto();
        resultado = resultado + "cuyos lados miden "+ Punto.Distancia(p1,p2) + " , " 
                                                    + Punto.Distancia(p2,p3) + " , "
                                                    + Punto.Distancia(p1,p3); 
        resultado= resultado + " vale "+ Punto.AreaTriangulo(p1,p2,p3); 
        return resultado;
    }
}

