package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.robot.Robot;

public class Info extends Comando {

    @Override
    public Integer consumo() {
        return 0;
 }
    @Override
    public void doEjecutar(Robot robot) {
        System.out.println(robot.promedioTiempo());
 }
    @Override
    public Integer duracion() {
       return 0;
    }

}
