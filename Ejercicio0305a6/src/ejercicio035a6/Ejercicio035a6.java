package ejercicio035a6;

public class Ejercicio035a6 {

/*
3.5.	Escriba una clase que represente un Semáforo, que podrá estar rojo, ámbar o verde.
        La clase tendrá un atributo llamado color inicialmente a rojo. También dispondrá 
        de un atributo que determine si el semáforo está parpadeando. Inicialmente, el 
        semáforo no está parpadeando.

3.6.	Escriba un programa que instancia un semáforo de la clase Semáforo del ejercicio anterior. 
        El programa escribirá por pantalla el color del semáforo. Luego pondrá el semáforo en ámbar 
        y volverá a imprimir el color.
*/
    public static void main(String[] args) {
        Semaforo misemaforo = new Semaforo();
        System.out.println("Creación de la clase Semaforo (solo propiedades)");
        System.out.println("");

        System.out.println("Ampliación de la clase Semaforo (añadimos métodos set y get), inserción de datos y extracción de datos");
        System.out.println("El color del semáforo es: "+misemaforo.getColor());
        misemaforo.setColor(color_semaforo.ambar);
        System.out.println("El color del semáforo es: "+misemaforo.getColor());
        System.out.println("");
    }
}
