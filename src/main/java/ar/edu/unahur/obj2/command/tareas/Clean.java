package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.habitaciones.Habitacion;
import ar.edu.unahur.obj2.command.robot.Robot;

public class Clean extends Comando {
    private Habitacion habitacion;

    @Override
    public Integer consumo() {
        return 5 * habitacion.getTamaño();
    }

    @Override
    public void doEjecutar(Robot robot) {
        
 }
    @Override
    public Integer duracion() {
        return 180 * habitacion.getTamaño();
    }

}
