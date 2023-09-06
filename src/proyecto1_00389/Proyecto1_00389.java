package proyecto1_00389;
import Controllers.ControladorCurso;
import Controllers.ControladorUsuario;
import Controllers.ControladorActividad;
import Grafico.Principal;

public class Proyecto1_00389 {

    public static void main(String[] args) {
        // TODO code application logic here
        ControladorUsuario controladorUsuarios = new ControladorUsuario();
        ControladorCurso controladorCurso = new ControladorCurso();
        ControladorActividad controladorActividad = new ControladorActividad();

        Principal p = new Principal();
        p.setVisible(true);        

        controladorUsuarios.addAlumno(12345678, "", "Juan Esteban", "", "M", 2);
        controladorUsuarios.addProfesor(1545415, "", "José", "", "M", 1);
        controladorUsuarios.addAdmin(10203040, "", "Juan Rodas", "", "M", 0);
//        controladorUsuarios.mostrarUsuarios();  
//        controladorUsuarios.editarUsuario("1545415", "159159", "Juan Esteban", "");

        controladorCurso.addCurso("IPC 1", 770, "1545415", 5,0);
        controladorCurso.addCurso("MB1", 123, "12345678", 8,0);
        controladorCurso.addCurso("Logica", 420, "12345678", 8,0);

//        controladorCurso.editarCurso("0770", "Mate1", 10);
//        controladorUsuarios.mostrarProfesores();
//        controladorUsuarios.mostrarAlumnos();

        controladorActividad.addActividad(1121, "HT #1", "ASDASDASDkjkljlkjkl", 81, 770);
        controladorActividad.addActividad(11421, "HT #2", "asdasdplplpl", 14, 770);
        controladorActividad.addActividad(18, "HT #3", "yhbyhbsadkfgf", 20, 123);
        controladorActividad.addActividad(8488, "HT #4", "ikuj1212jkhkdsf", 90, 123);
        controladorActividad.mostrarActividades();
        
        controladorCurso.cambiarAcumulado(770, 80);
        controladorCurso.mostrarCursos();
        
//        controladorActividad.mostrarActividadesDeCurso(770);
    }    
}
