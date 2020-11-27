package ejercicio0316;

public class Elemento {
    private String nombre="";
    public static int numero_elementos=0;

    public Elemento(String nombre){
        this.nombre=nombre;
        numero_elementos++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}
