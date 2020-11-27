package ejercicio0314;

/**
14. Escriba una clase de nombre Constantes que declare las siguientes constantes:

    a. Velocidad de la luz, c=2.9979x108 m/s
    b. Constante Universal de Gravitación, G=6.67x10-11 N m2/kg2
    c. Constante de Planck, h=6.6262x10-34 J*s

Escribe así mismo un programa llamado pruebeConstantes , que cree un objeto de la clase 
Constantes y luego imprima los valores de las constantes y sus dimensiones.

Modifica la clase para no tener que crear un objeto de la misma y poder imprimir
los valores de las constantes.

 */
public class Ejercicio0314 {

    public static void main(String[] args) {
        System.out.println("Creación de la clase Constantes con propiedades estaticas y publicas");
        System.out.println("c = "+Constantes.c+" m/s");
        System.out.println("G = "+Constantes.G+" N m^2/kg^2");
        System.out.println("h = "+Constantes.h+" J*s");
        System.out.println("");
    }
}
