package practicapoo;

import java.util.Scanner;

public class PracticaPOO {

    public static void main(String[] args) {
        Punto p1, p2, p3,p4, p5, p6;
//introducir el punto (3,4) con el constructor vacio e imprimirlo con el método estático Punto.ImprimePunto(p1)
        p1 = new Punto ();
        p1.setX(3);
        p1.setY(4);
        Punto.ImprimePunto(p1);
        //p1.ImprimePunto();
  
// Introduce el punto (7,4) con el constructo que recibe X,Y e imprimelo con el método no estático ImprimePunto()
        p2=new Punto(7,4);
        System.out.println(p2.ImprimePunto());
// Introduce el punto (3,7) con el constructor copia, partiendo de un punto ya creado y modificando su valor
// imprime su valor con el método toString        
        p3=new Punto(p1);
        p3.setY(7);
        System.out.println(p3.toString());
// Calcula e imprime la distancia entre p1 y p2 utilizando el método estático
        double d;
        d= Punto.Distancia(p1, p2);
       // d=p1.Distancia(p2);
        System.out.println("La distancia entre los puntos "+ p1.ImprimePunto() 
                + " y "+ p2.ImprimePunto()+ " vale " + d);
// Introduce tres puntos por teclado y utiliza distintos constructores y llama al metodo ImprimeArea
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.print("Primer punto X= ");
        x=sc.nextDouble();
        System.out.print("Primer punto Y= ");
        y=sc.nextDouble();
        System.out.println();
        p4= new Punto(); 
        p4.setX(x);
        p4.setY(y);
        
        System.out.print("Segundo punto X= ");
        x=sc.nextDouble();
        System.out.print("Segundo punto Y= ");
        y=sc.nextDouble();
        System.out.println();
        p5= new Punto(x,y); 

        System.out.print("Tercer punto X= ");
        x=sc.nextDouble();
        System.out.print("Tercer punto Y= ");
        y=sc.nextDouble();
        System.out.println();
        p6= new Punto(x,y); 
// Imprime los datos del triangulo generado        
        System.out.println(Punto.ImprimeArea(p4, p5, p6));
// Imprime el número de puntos
        System.out.println();
        System.out.println("El número de puntos que tenemos es de "+ Punto.getNumeroPuntos());
    }
}
