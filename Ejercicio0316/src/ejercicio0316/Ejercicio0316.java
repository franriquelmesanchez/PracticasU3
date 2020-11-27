package ejercicio0316;

/*
16. Escriba una clase llamada Elemento, que disponga de un atributo con su nombre. 
La clase debe contener un método llamado numeroDeElementos que devuelva el número total
de elementos que se han creado. Crea tres elementos para probarlo.
 */
public class Ejercicio0316 {

    public static void main(String[] args) {
        Elemento mielemento1 = new Elemento("a");
        Elemento mielemento2 = new Elemento("b");
        Elemento mielemento3 = new Elemento("c");
        System.out.println("El número de elementos creados es: "+Elemento.numero_elementos);
        System.out.println("");
    }
}
