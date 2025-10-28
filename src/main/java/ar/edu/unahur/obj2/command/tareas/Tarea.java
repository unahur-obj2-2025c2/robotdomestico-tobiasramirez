package ar.edu.unahur.obj2.command.tareas;


import ar.edu.unahur.obj2.command.robot.Robot;

public interface Tarea {
    public Integer consumo();
    public Integer duracion();
    public void ejecutar(Robot robot);
    public void doEjecutar(Robot robot);
}
