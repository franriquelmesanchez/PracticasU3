package ejercicio0315;

/**
15. Escriba un programa para representar el consumo de energía de una instalación eléctrica. 
Para ello, se dispondrá de una clave que representa los aparatos conectados en la instalación.
Cada aparato tiene un consumo eléctrico determinado. Al encender un aparato el consumo
eléctrico se incrementa en la potencia de dicho aparato. Al apagarlo, se decrementa el consumo.
Inicialmente los aparatos están todos apagados. 
Hacer un programa que declare tres aparatos eléctricos, una bombilla de 100 watios, 
un radiador de 2000 watios y una plancha de 1200 watios. El programa imprimirá el consumo
nada más crear los objetos. Posteriormente, se enciende la bombilla y la plancha, y el
programa imprime el consumo. Luego se apaga la plancha y se enciende el radiador y se
vuelve a imprimir el consumo.
*/
public class Ejercicio0315 {

    public static void main(String[] args) {
        Consumo miconsumo = new Consumo();

        System.out.println("Todo apagado");
        System.out.println("El consumo es: "+miconsumo.consumo());
        miconsumo.encender("bombilla");
        miconsumo.encender("plancha");
        System.out.println("Bombilla y plancha encendidos");
        System.out.println("El consumo es: "+miconsumo.consumo());
        miconsumo.apagar("plancha");
        miconsumo.encender("radiador");
        System.out.println("Bombilla y radiador encendidos");
        System.out.println("El consumo es: "+miconsumo.consumo());
        System.out.println("");
    }
}
