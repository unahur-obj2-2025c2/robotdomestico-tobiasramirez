package ar.edu.unahur.obj2.command.robot;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unahur.obj2.command.tareas.*;

public class Robot {
    private Double bateria;
    private List<Tarea> tareasEjecutadas = new ArrayList<>();
    public Double getBateria(){
        return Math.round(this.bateria * 100.0) / 100.0;
    }
    public void cargarBateria(Integer cantidad) {
        this.bateria = Double.min(100, this.bateria + cantidad);
    }
    public void disminuirBateria(Double porcentaje){
        this.bateria = Double.max(0, this.bateria - porcentaje);

    }
    public void añadirTarea(Tarea tarea){
        if (tarea.getClass() != Info.class){
            
            tareasEjecutadas.add(tarea);
        }
    }
    public Double promedioTiempo(){
        return tareasEjecutadas.stream().mapToDouble(t->t.duracion()).sum() / tareasEjecutadas.size();
    }
    public Integer cuantoFaltaParaCargar(){
        return (int) ((100 - this.bateria) / 8);
    }
    public void ejecutar(List<Tarea>tareas){
        tareas.forEach(t->t.ejecutar(this));
    }
    public Robot(Double bateria) {
        this.bateria = bateria;
    }
    public List<Tarea> getTareasEjecutadas() {
        return tareasEjecutadas;
    }
    
}
