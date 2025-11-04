package ar.edu.unahur.obj2.command.invoker;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.command.robot.Robot;
import ar.edu.unahur.obj2.command.tareas.*;

public class Usuario {
    private List<Tarea> tareas = new ArrayList<>();
    private Robot robot;

    public Usuario(Robot robot) {
        this.robot = robot;
    }

    public Usuario(List<Tarea> tareas, Robot robot) {
        this.tareas = tareas;
        this.robot = robot;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
    public void ejecutarRobot(){
        this.robot.ejecutar(this.tareas);
    }
    public void agregarTareaAlRobot(Tarea tarea){
        tareas.add(tarea);
    }
    public void limpiarListaDeTareas(){
        this.tareas.clear();
    }
    public void setTareas(List<Tarea> tareas){
        this.tareas = tareas;
    }
}
