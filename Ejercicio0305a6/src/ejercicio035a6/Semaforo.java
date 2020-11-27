package ejercicio035a6;

enum color_semaforo{rojo,ambar,verde};

public class Semaforo {
    
    private color_semaforo color = color_semaforo.rojo;
    private boolean parpadea = false;

    public void setColor(color_semaforo color) {
        this.color = color;
    }

    public color_semaforo getColor() {
        return color;
    }

    public boolean isParpadea() {
        return parpadea;
    }

    public void setParpadea(boolean parpadea) {
        this.parpadea = parpadea;
    }
    
}
