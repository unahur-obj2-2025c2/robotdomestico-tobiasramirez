package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.habitaciones.Habitacion;
import ar.edu.unahur.obj2.command.robot.Robot;

public class Clean extends Comando {
    private Habitacion habitacion;

    @Override
    public Double consumo() {
        return 5.0 * habitacion.getTamaño();
    }

    @Override
    public void doEjecutar(Robot robot) {
        habitacion.limpiar();
 }
    @Override
    public Double duracion() {
        return 180.0 * habitacion.getTamaño();
    }

    public Clean(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
}
