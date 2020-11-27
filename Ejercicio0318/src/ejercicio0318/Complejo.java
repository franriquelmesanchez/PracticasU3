package ejercicio0318;

public class Complejo {
    private double real = 0;
    private double imaginaria = 0;

    public Complejo(){
    }

    public Complejo(double real, double imaginaria){
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public static Complejo suma(Complejo a, Complejo b){
        Complejo c = new Complejo();
        c.real = a.real + b.real;
        c.imaginaria = a.imaginaria + b.imaginaria;
        return c;
    }

    public static Complejo resta(Complejo a, Complejo b){
        Complejo c = new Complejo();
        c.real = a.real - b.real;
        c.imaginaria = a.imaginaria - b.imaginaria;
        return c;
    }


    public static void imprimir(Complejo a){
        System.out.print("("+a.real+","+a.imaginaria+")");
    }
    
}
