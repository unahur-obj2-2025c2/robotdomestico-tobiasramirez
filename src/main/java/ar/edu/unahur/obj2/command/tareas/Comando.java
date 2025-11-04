package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.robot.Robot;

public abstract class Comando implements Tarea {

    @Override
    public  abstract Double consumo() ;

    @Override
    public abstract void doEjecutar(Robot robot) ;

    @Override
    public abstract Double duracion();

    @Override
    public void ejecutar(Robot robot) {
        robot.disminuirBateria(this.consumo());
        doEjecutar(robot);
        robot.añadirTarea(this);
        
    }
    
}
