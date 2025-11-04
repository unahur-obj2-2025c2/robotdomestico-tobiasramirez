package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.habitaciones.Habitacion;
import ar.edu.unahur.obj2.command.robot.Robot;

public class Ligon extends Comando {
    private Habitacion habitacion;

    @Override
    public Double consumo() {
        return habitacion.getLuzEncendida() ? 1.0 : 5.0;
    }

    @Override
    public void doEjecutar(Robot robot) {
       habitacion.encenderLuz();
    }

    @Override
    public Double duracion() {
         return habitacion.getLuzEncendida() ? 25.0 : 90.0;
    }

    public Ligon(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
}
