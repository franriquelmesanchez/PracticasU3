package ejercicio0319;

public class Biblioteca_Libro extends Biblioteca {
    private int paginas;

    public Biblioteca_Libro(int codigo, String titulo, String autor, int paginas){
        super(codigo,titulo,autor);
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void imprimir(){
        System.out.println(super.getCodigo()+": "+super.getTitulo()+
                " ("+super.getAutor()+" - "+paginas+" páginas)");
    }
}
