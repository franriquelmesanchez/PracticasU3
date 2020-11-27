package ejercicio0319;

public class Biblioteca_Disco extends Biblioteca{
    private String discografica;

    public Biblioteca_Disco(int codigo, String titulo, String autor, String discografica){
        super(codigo,titulo,autor);
        this.discografica = discografica;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public void imprimir(){
        System.out.println(super.getCodigo()+": "+super.getTitulo()+" ("+super.getAutor()+" - "+discografica+")");
    }
}

