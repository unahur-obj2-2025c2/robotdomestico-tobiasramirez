package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.habitaciones.Habitacion;
import ar.edu.unahur.obj2.command.robot.Robot;

public class Ligoff extends Comando {
    private Habitacion habitacion;

    @Override
    public Integer consumo() {
        return habitacion.getLuzEncendida() ? 5 : 1;
    }
    @Override
    public void doEjecutar(Robot robot) {
        habitacion.apagarLuz();        

        }

    @Override
    public Integer duracion() {
        return habitacion.getLuzEncendida() ? 90 : 25;
    }

}
