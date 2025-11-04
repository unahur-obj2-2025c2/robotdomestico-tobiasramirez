package ar.edu.unahur.obj2.command.tareas;

import ar.edu.unahur.obj2.command.robot.Robot;

public class Carge extends Comando {
    private Robot robot;
    private Integer minutos;
    private Double cargaRestante = 0.0;

    @Override
    public Double consumo() {
        return 0.0;
 }
    @Override
    public Double duracion() {
        return Double.min(this.minutos * 60, this.segundosNecesariosParaCargaCompleta());
    }

    @Override
    public void doEjecutar(Robot robot) {
        this.cargaRestante = robot.getBateria();
        robot.cargarBateria(this.cantidadDeBateriaACargar());
    }
    public Carge(Robot robot, Integer minutos) {
        this.robot = robot;
        this.minutos = minutos;
    }
    public Integer cantidadDeBateriaACargar(){
        return this.minutos * 100 / 125;
    }
    private Double segundosNecesariosParaCargaCompleta() {
        Double bateriaFaltante = 100 - this.cargaRestante; 
        Double cargaCompletaEnSegundos = 125.0 * 60; 
        return bateriaFaltante * cargaCompletaEnSegundos / 100; 
    }

}
