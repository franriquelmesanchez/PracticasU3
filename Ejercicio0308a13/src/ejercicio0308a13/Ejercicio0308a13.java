package ejercicio0308a13;

/*
8.Definir una clase que represente un punto en un espacio bidimensional. La clase 
  debe disponer de un constructor con las coordenadas del punto y métodos accesores
  a las coordenadas.

9.Escriba un programa que instancie cuatro puntos: el primero situado en el origen, 
  el segundo situado en (5, 3), el tercero en (2, -1) y para el cuarto como punto 
  medio entre el segundo y el tercero.

10. Añada a la clase Punto un constructor sin parámetros que permita construir puntos
    en el origen de coordenadas.

11. Añada un método a la clase Punto que calcule la distancia a otro punto.   

12. Escriba un programa que cree un punto en (4, 3) e imprima la distancia del punto
    al origen de coordenadas. Para calcular la distancia de un punto al origen, se aplica
    el teorema de Pitágoras, resultando  .No obstante, dado que se dispone del método 
    distancia a otro punto, se puede calcular la distancia al punto origen de coordenadas. 

Escribe: Se escribe el mensaje "Distancia de p al origen" seguido del valor.


13. Escriba la clase Punto con dos métodos llamados distancia. Uno de ellos calcula
    la distancia a otro punto y el otro calcula la distancia al origen.
 */
public class Ejercicio0308a13 {

    public static void main(String[] args) 
    {
        //8 primero creamos la clase dentro del paquete
        System.out.println("Creación de la clase Punto");
        System.out.println("");
        //9 creamos varios objetos de la clase llamando al constructor por defecto
        Punto mipunto1 = new Punto();  
        Punto mipunto2 = new Punto();  
        Punto mipunto3 = new Punto();  
        Punto mipunto4 = new Punto();  
        
        
        System.out.println("Creación de Objetos Punto e impresión del último");
        mipunto1.setXY(0,0);
        mipunto2.setXY(5,3);
        mipunto3.setXY(2,-1);
        mipunto4.setXY((mipunto2.getX()+mipunto3.getX())/2,(mipunto2.getY()+mipunto3.getY())/2);
        System.out.println("Punto 4: X="+mipunto4.getX()+" Y="+mipunto4.getY());
        System.out.println("");

        // 10 creamos el constructor Punto()
        System.out.println("Creación del constructor sin parámetros en el origen");
        System.out.println("");

        //11 creación del método distancia
        System.out.println("Creación del método distancia y ejemplo");
        mipunto1.setXY(0,0);
        mipunto2.setXY(3,3);
        System.out.println("Distancia: "+Punto.distancia(mipunto1, mipunto2));
        System.out.println("");
 
        //12
        double dist;
        mipunto1.setXY(0,0);
        mipunto2.setXY(4,3);
        dist=Punto.distancia(mipunto1, mipunto2);
        System.out.println("Distancia: "+ dist);
        System.out.println("");

        //13
        System.out.println("Creación del método distancia al origen y ejemplo");
        mipunto1.setXY(4,3);
        System.out.println("Distancia: "+Punto.distancia_origen(mipunto1));
        System.out.println("");
        
        //Creación de un punto con el segundo constructor
        Punto mipunto5 = new Punto(30,50);// segundo constructor
        System.out.println("Punto 5: X="+mipunto5.getX()+" Y="+mipunto5.getY());
        System.out.println("");

        //copiamos mipunto6=mipunto5
        Punto mipunto6 = new Punto(mipunto5);
        System.out.println("Punto 6: X="+mipunto6.getX()+" Y="+mipunto6.getY());
        System.out.println("");
    }
}
