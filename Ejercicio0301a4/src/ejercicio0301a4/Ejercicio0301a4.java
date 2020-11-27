package ejercicio0301a4;

import java.util.Scanner;

public class Ejercicio0301a4 {

/*
3.1.	Definir una clase que represente a un coche. En la definición se debe incluir:
	El modelo 
	El color
	Si la pintura es metalizada o no
	La matrícula
	El tipo de coche, que puede ser MINI, UTILITARIO, FAMILIAR o DEPORTIVO
	El año de fabricación
	La modalidad del seguro, que puede ser a terceros o a todo riesgo

3.2.	Se desea imprimir el modelo y el color de un coche dado. Para ello, 
        se pide escribir un método, que acepte un objeto de la clase Coche. 
        Si dicha referencia no es null, el método deberá imprimir el modelo y el color.
        Si es null, el método no hará nada.

3.3.	Añadir a la clase Coche del Ejercicio 1 un método de nombre imprimecoche 
        que imprima el modelo y el color del coche.

3.4.	Escribir un programa que tenga una instancia de mi coche, que es un Rolls Royce dolor dorado.
        El programa debe ha de imprimir un mensaje que diga de qué modelo y color es mi coche.
*/
public static void main(String[] args) {
        Coche micoche = new Coche();
        System.out.println("Creación de la clase Coche (solo propiedades)");
        System.out.println("");

        System.out.println("Ampliación de la clase Coche (añadimos métodos set y get), inserción de datos y extracción de datos");
        micoche.setModelo("Ferrari");
        micoche.setColor("Rojo");
        System.out.println("El modelo del coche es: "+micoche.getModelo());
        System.out.println("El color del coche es: "+micoche.getColor());
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ampliación de la clase Coche (añadimos método imprimircoche) y prueba de esta tomando datos");
        System.out.print("Introduce modelo: ");
        String modelo =  sc.nextLine();
        System.out.print("Introduce color: ");
        String color = sc.nextLine();
        micoche.setModelo(modelo);
        micoche.setColor(color);
        micoche.imprimecoche();

        System.out.println("Prueba de impremecoche con datos fijos");
        micoche.setModelo("Rolls Royce");
        micoche.setColor("dorado");
        micoche.imprimecoche();
        System.out.println("");

    }
}
