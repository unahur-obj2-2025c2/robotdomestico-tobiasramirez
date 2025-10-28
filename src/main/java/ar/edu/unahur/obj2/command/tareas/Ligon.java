package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.habitaciones.Habitacion;
import ar.edu.unahur.obj2.command.robot.Robot;

public class Ligon extends Comando {
    private Habitacion habitacion;

    @Override
    public Integer consumo() {
        return habitacion.getLuzEncendida() ? 1 : 5;
    }

    @Override
    public void doEjecutar(Robot robot) {
       habitacion.encenderLuz();
    }

    @Override
    public Integer duracion() {
         return habitacion.getLuzEncendida() ? 25 : 90;
    }

}
