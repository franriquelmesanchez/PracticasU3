package ejercicio0308a13;

public class Punto {
    private int x;
    private int y;

    Punto(){
        x=0;
        y=0;
    }
    Punto (int x,int y)//constructor sobrecargado
    {
        this.x=x;
        this.y=y;
    }
    Punto (Punto p)//constructor copia
    {
        this.x=p.x;
        this.y=p.y;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static double distancia(Punto punto1, Punto punto2){
        double distancia=0;
        distancia=Math.sqrt(((punto1.getX()-punto2.getX())*(punto1.getX()-punto2.getX()))+
                ((punto1.getY()-punto2.getY())*(punto1.getY()-punto2.getY())));
        return distancia;
    }

    public static double distancia_origen(Punto punto1){
        double distancia=0;
        distancia=Math.sqrt((punto1.getX()*punto1.getX())+(punto1.getY()*punto1.getY()));
        return distancia;
    }

    
}
