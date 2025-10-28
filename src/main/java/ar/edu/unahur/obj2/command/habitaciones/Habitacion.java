package ar.edu.unahur.obj2.command.habitaciones;

public class Habitacion {
    private Boolean luzEncendida;
    private Integer tamaño;

    public Boolean getLuzEncendida() {
        return luzEncendida;
    }
    public Integer getTamaño() {
        return tamaño;
    }
    public void encenderLuz() {
        this.luzEncendida = Boolean.TRUE;
    }
    public void apagarLuz() {
        this.luzEncendida = Boolean.FALSE;
    }
    
}
