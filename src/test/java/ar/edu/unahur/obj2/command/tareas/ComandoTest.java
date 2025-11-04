package ar.edu.unahur.obj2.command.tareas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.command.habitaciones.Habitacion;
import ar.edu.unahur.obj2.command.invoker.Usuario;
import ar.edu.unahur.obj2.command.robot.Robot;

public class ComandoTest {
    private Robot robot = new Robot(80.0);
    private Usuario user = new Usuario(robot);
    private Habitacion hab = new Habitacion(10, Boolean.FALSE,Boolean.FALSE);
    private Habitacion hab2 = new Habitacion(10, Boolean.TRUE, Boolean.TRUE);
    @Test
    void cargarBateria(){
        Tarea carge = new Carge(robot,125);
        carge.ejecutar(robot);
        assertEquals(100.0, robot.getBateria());
    }
    @Test
    void elRobotRegistraLaTarea(){
         Tarea carge = new Carge(robot,125);
        carge.ejecutar(robot);
        assertTrue(robot.getTareasEjecutadas().contains(carge));
    }
    @Test
    void encenderLuz(){
        Tarea lightOn = new Ligon(hab);
        lightOn.ejecutar(robot);
        assertTrue(hab.getLuzEncendida());
    }
    @Test
    void laTareaLightOnConsumio5DeBateriaDelRobotAlEstarLaLuzApagada(){
         Tarea lightOn = new Ligon(hab);
        lightOn.ejecutar(robot);
        assertEquals(75.0, robot.getBateria());
    }
    @Test
    void laTareaLightOnDuro90SegundosAlEstarLaLuzApagada(){
          Tarea lightOn = new Ligon(hab);
        assertEquals(90.0, lightOn.duracion());
    }
    @Test
    void laTareaLightOnConsumio1DeBateriaDelRobotAlEstarLaLuzEncencida(){
        Tarea lightOn = new Ligon(hab2);
        lightOn.ejecutar(robot);
        assertEquals(79.0, robot.getBateria());
    }
     @Test
    void laTareaLightOnDuro25SegundosAlEstarLaLuzEncendida(){
          Tarea lightOn = new Ligon(hab2);
        assertEquals(25.0, lightOn.duracion());
    }
     @Test
    void apagarLuz(){
        Tarea lightOff = new Ligoff(hab);
        lightOff.ejecutar(robot);
        assertTrue(!hab.getLuzEncendida());
    }
    @Test
    void laTareaLightOffConsumio1DeBateriaDelRobotAlEstarLaLuzApagada(){
         Tarea lightOff = new Ligoff(hab);
        lightOff.ejecutar(robot);
        assertEquals(79.0, robot.getBateria());
    }
    @Test
    void laTareaLightOffDuro25SegundosAlEstarLaLuzApagada(){
          Tarea lightOff = new Ligoff(hab);
        assertEquals(25.0, lightOff.duracion());
    }
    @Test
    void laTareaLightOnConsumio5DeBateriaDelRobotAlEstarLaLuzEncencida(){
        Tarea lightOff = new Ligoff(hab2);
        lightOff.ejecutar(robot);
        assertEquals(75.0, robot.getBateria());
    }
     @Test
    void laTareaLightOffDuro90SegundosAlEstarLaLuzEncendida(){
          Tarea lightOff = new Ligoff(hab2);
        assertEquals(90.0, lightOff.duracion());
    }
    @Test
    void limpiarHabitacionDe10Metros(){
        Tarea clean = new Clean(hab);
        clean.ejecutar(robot);
        assertEquals(30.0, robot.getBateria());
        assertEquals(1800.0, clean.duracion());
    }
    @Test
    void elRobotNoRegistraLaTareaInfo(){
        Tarea info = new Info();
        info.ejecutar(robot);
        assertTrue(!robot.getTareasEjecutadas().contains(info));
    }
    @Test
    void elUsuarioEjecutaElRobotConUnaSerieDeTareas(){
        Tarea info = new Info();
        Tarea clean = new Clean(hab);//180 * 10 = 1800
        Tarea lightOff = new Ligoff(hab);//25
        Tarea lightOn = new Ligon(hab);//90
        List<Tarea> tareas = Arrays.asList(info,clean,lightOff,lightOn);
        user.setTareas(tareas);
        user.ejecutarRobot();
        assertEquals(638.3333333333334, robot.promedioTiempo());
        
        

    }

}
