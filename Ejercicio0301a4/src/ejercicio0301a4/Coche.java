package ejercicio0301a4;

//Definicion de las enumeraciones
enum tipo_coche{mini,utilitario,familiar,deportivo};
enum modo_seguro{a_terceros,a_todo_riesgo};

public class Coche 
{
    // Propiedades de la clase
    private String modelo;
    private String color;
    private boolean metalizado;
    private String matricula;
    private tipo_coche tipocoche;
    private int fecha_fabricacion;
    private modo_seguro modoseguro;
    
// Metodos de la clase get y set que encapsulan las propiedades

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMetalizado() {
        return metalizado;
    }

    public void setMetalizado(boolean metalizado) {
        this.metalizado = metalizado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public tipo_coche getTipocoche() {
        return tipocoche;
    }

    public void setTipocoche(tipo_coche tipocoche) {
        this.tipocoche = tipocoche;
    }

    public int getFecha_fabricacion() {
        return fecha_fabricacion;
    }

    public void setFecha_fabricacion(int fecha_fabricacion) {
        this.fecha_fabricacion = fecha_fabricacion;
    }

    public modo_seguro getModoseguro() {
        return modoseguro;
    }

    public void setModoseguro(modo_seguro modoseguro) {
        this.modoseguro = modoseguro;
    }
    
 // Metodo que utilizaremos para imprimir el objeto
    public void imprimecoche(){
        if(modelo!=null && color!=null && !modelo.equals("") && !color.equals("")){
            System.out.println("El modelo de coche es "+modelo+" y de color "+color);
        }else{
            System.out.println("El modelo o el color no han sido definidos");
        }
    }
    
}
