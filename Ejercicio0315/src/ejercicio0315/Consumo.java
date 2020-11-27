package ejercicio0315;

public class Consumo {
    private int bombilla=0;
    private int radiador=0;
    private int plancha=0;

    public void encender(String aparato){
        if(aparato.equals("bombilla")){
            bombilla=100;
        }else if(aparato.equals("radiador")){
            radiador=2000;
        }else{
            plancha=1200;
        }
    }

    public void apagar(String aparato){
        if(aparato.equals("bombilla")){
            bombilla=0;
        }else if(aparato.equals("radiador")){
            radiador=0;
        }else{
            plancha=0;
        }
    }

    public int consumo(){
        int consumo=0;
        consumo=bombilla+radiador+plancha;
        return consumo;
    }    
}
