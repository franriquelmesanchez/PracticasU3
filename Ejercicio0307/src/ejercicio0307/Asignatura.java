package ejercicio0307;

public class Asignatura {
    private String nombre="";
    private int codigo=0;
    private String curso="";

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Curso: "+curso);
    }
}
