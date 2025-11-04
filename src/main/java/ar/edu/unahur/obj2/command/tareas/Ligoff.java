package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.habitaciones.Habitacion;
import ar.edu.unahur.obj2.command.robot.Robot;

public class Ligoff extends Comando {
    private Habitacion habitacion;

    @Override
    public Double consumo() {
        return habitacion.getLuzEncendida() ? 5.0 : 1.0;
    }
    @Override
    public void doEjecutar(Robot robot) {
        habitacion.apagarLuz();        

        }

    @Override
    public Double duracion() {
        return habitacion.getLuzEncendida() ? 90.0 : 25.0;
    }
    public Ligoff(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
}
