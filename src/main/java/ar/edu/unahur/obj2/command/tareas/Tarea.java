package ar.edu.unahur.obj2.command.tareas;


import ar.edu.unahur.obj2.command.robot.Robot;

public interface Tarea {
    public Double consumo();
    public Double duracion();
    public void ejecutar(Robot robot);
    public void doEjecutar(Robot robot);
}
