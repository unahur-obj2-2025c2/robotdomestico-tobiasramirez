package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.robot.Robot;

public abstract class Comando implements Tarea {

    @Override
    public  abstract Integer consumo() ;

    @Override
    public abstract void doEjecutar(Robot robot) ;

    @Override
    public abstract Integer duracion();

    @Override
    public void ejecutar(Robot robot) {
        robot.añadirTarea(this);
        doEjecutar(robot);
        robot.disminuirBateria(this.consumo());
        
    }
    
}
