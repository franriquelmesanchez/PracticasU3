package ejercicio0317;

public class Bombilla {
    private boolean estado_bombilla=false;
    private boolean estado_general=false;

    public void encender_bombilla(){
        estado_bombilla=true;
    }

    public void encender_general(){
        estado_general=true;
    }
    
    public void apagar_bombilla(){
        estado_bombilla=false;
    }

    public void apagar_general(){
        estado_general=false;
    }
    
    public void comprobar_bombilla(){
        if(estado_general){
            if(estado_bombilla){
                System.out.println("La bombilla está encendida");
            }else{
                System.out.println("La bombilla está apagada");
            }
        }else{
            System.out.println("La bombilla está apagada");
        }
    }    
}
