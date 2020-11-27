package ejercicio0319;

public class Biblioteca_Usuarios {
    private String dni;
    private String nombre;
    private int codigos[] = new int[5];         //Codigos de libros o discos reservados

    public Biblioteca_Usuarios(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void reservar(int codigo){
        int i,cont=5;
        for(i=0;i<5;i++){
            if(codigos[i]==0){//Si el codigo es 0 es que no ha pedido esa posicion
                cont=i;
                break;      //Salimos
            }
        }
        if(cont==5){
            System.out.println("Error: No puedes pedir más libros");
        }else{
            codigos[cont]=codigo;
        }
    }

    public void devolver(int codigo){
        int i;
        boolean encontrado=false;
        for(i=0;i<5;i++){
            if(codigos[i]==codigo){//Si encontramos el codigo lo ponemos a 0
                codigos[i]=0;
                encontrado=true;
                break;      //Salimos
            }
        }
        if(!encontrado){
            System.out.println("Error: No puedes devolver el libro porque no lo tienes");
        }
    }

    public int[] getCodigos(){
        return codigos;
    }    
}
