package ar.edu.unahur.obj2.command.habitaciones;

public class Habitacion {
    private Boolean luzEncendida;;
    private Integer tamaño;
    private Boolean estaLimpia;

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
    public Habitacion(Integer tamaño, Boolean estaLimpia, Boolean luzEncendida) {
        this.tamaño = tamaño;
        this.estaLimpia = estaLimpia;
        this.luzEncendida = luzEncendida;
    }
    public Boolean getEstaLimpia() {
        return estaLimpia;
    }
    public void limpiar(){
        this.estaLimpia = Boolean.TRUE;
    }
}
