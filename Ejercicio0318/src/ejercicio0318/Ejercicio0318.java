package ejercicio0318;

/**
18. Implemente una clase llamada Complejo para realizar aritmética con números complejos 
sabiendo que los números complejos tienen la forma:
    parteReal + parteImaginaria * i
    donde i es la raíz cuadrada de -1.
La clase deberá proporcionar un constructor que permita inicializar un objeto cuando se declare. 
Dicho constructor debe contener valores predeterminados. También deberá proporcionar funciones 
miembro de tipo public para cada una de las siguientes operaciones:
• Suma de dos números Complejos: las partes reales se suman y las partes imaginarias se suman.
• Resta de dos números Complejos: la parte real de operando derecho se resta a la parte real 
  del operando izquierdo, y la parte imaginaria del operando derecho se resta a la parte
  imaginaria del operando izquierdo.
• Impresión de números Complejos de la forma (a, b), en donde a es la parte real y b 
  es la parte imaginaria.
NOTA: Utilice variables double para representar datos miembros de la clase.

b) Escriba un método main cuya ejecución muestre el siguiente resultado en pantalla:
        Se crean cuatro números complejos
        a(1,1), b(2,2), c y d(3,5)
        La suma de a + b almacenada en c es:
            (3,3)
        La resta de b - d almacenada en c es:
             (1,3)
 */
public class Ejercicio0318 {

    public static void main(String[] args) {
        Complejo micomplejo1 = new Complejo(1,1);       
        Complejo micomplejo2 = new Complejo(2,2);       
        Complejo micomplejo3 = new Complejo();          
        Complejo micomplejo4 = new Complejo(3,5);    
        
        micomplejo3 = Complejo.suma(micomplejo1,micomplejo2);
        System.out.print("Suma  --> ");
        Complejo.imprimir(micomplejo1);
        System.out.print(" + ");
        Complejo.imprimir(micomplejo2);
        System.out.print(" = ");
        Complejo.imprimir(micomplejo3);
        micomplejo3 = Complejo.resta(micomplejo4,micomplejo2);
        System.out.println("");
        System.out.print("Resta --> ");
        Complejo.imprimir(micomplejo4);
        System.out.print(" - ");
        Complejo.imprimir(micomplejo2);
        System.out.print(" = ");
        Complejo.imprimir(micomplejo3);
        System.out.println("");
    }
}
