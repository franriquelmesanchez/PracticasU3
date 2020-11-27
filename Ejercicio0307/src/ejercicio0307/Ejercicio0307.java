package ejercicio0307;

public class Ejercicio0307 {

/*
7.Escriba un programa que disponga de una clase para representar las asignaturas de una carrera.
  Una asignatura tiene un nombre, un código numérico y el curso en el cual se imparte.
  Los valores iniciales han de proporcionarse en el constructor  La clase ha de tener métodos
  para obtener los valores de los atributos. El programa ha de construir un objeto con
  los siguientes valores: nombre "Matemáticas", código 1017, curso l.
  A continuación, el programa ha de imprimir los valores del objeto por pantalla.
 */
    public static void main(String[] args) {
        Asignatura miasignatura = new Asignatura();
        System.out.println("Creación de la clase Asignatura (propiedades y métodos), inserción y utilización de método");
        miasignatura.setNombre("Matemáticas");
        miasignatura.setCodigo(1017);
        miasignatura.setCurso("I");
        miasignatura.imprimir();
        System.out.println("");
    }
}
