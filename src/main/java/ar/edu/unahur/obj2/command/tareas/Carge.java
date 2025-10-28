package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.robot.Robot;

public class Carge extends Comando {
    private Robot robot;

    @Override
    public Integer consumo() {
        return 0;
 }
    @Override
    public Integer duracion() {
        return robot.cuantoFaltaParaCargar();
    }

    @Override
    public void doEjecutar(Robot robot) {
        robot.cargarBateria(this.duracion());
    }

}
