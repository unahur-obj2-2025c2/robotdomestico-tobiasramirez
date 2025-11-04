package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.robot.Robot;

public class Info extends Comando {

    @Override
    public Double consumo() {
        return 0.0;
 }
    @Override
    public void doEjecutar(Robot robot) {
        System.out.println(robot.promedioTiempo());
 }
    @Override
    public Double duracion() {
       return 0.0;
    }

}
