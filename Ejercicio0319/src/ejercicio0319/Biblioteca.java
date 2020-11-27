package ejercicio0319;

public class Biblioteca {
    private int codigo;
    private String titulo;
    private String autor;
    private boolean prestado;     //True: no se puede reservar -- False: Si

    public Biblioteca(int codigo, String titulo, String autor){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }    
}
