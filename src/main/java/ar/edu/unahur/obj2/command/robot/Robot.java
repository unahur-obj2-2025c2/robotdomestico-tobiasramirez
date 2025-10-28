package ar.edu.unahur.obj2.command.robot;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unahur.obj2.command.tareas.*;

public class Robot {
    private Double bateria;
    private List<Tarea> tareasEjecutadas = new ArrayList<>();
    public Double getBateria(){
        return this.bateria;
    }
    public void cargarBateria(Integer minutos) {
        this.bateria = Double.min(125, minutos * 0.8);
    }
    public void disminuirBateria(Integer porcentaje){
        this.bateria = Double.max(0, this.bateria - porcentaje);

    }
    public void añadirTarea(Tarea tarea){
        if (tarea != new Info()){
            
            tareasEjecutadas.add(tarea);
        }
    }
    public tiempoDeEjecucionRestante(){

    }
    public Integer promedioTiempo(){
        return tareasEjecutadas.stream().mapToInt(t->t.duracion()).sum() / tareasEjecutadas.size();
    }
    public Integer cuantoFaltaParaCargar(){
        return (int) ((100 - this.bateria) / 8);
    }
}
