package proyecto1_00389;
import Controllers.ControladorCurso;
import Controllers.ControladorUsuario;
import Grafico.Principal;

public class Proyecto1_00389 {

    public static void main(String[] args) {
        // TODO code application logic here
        ControladorUsuario controladorUsuarios = new ControladorUsuario();
        ControladorCurso controladorCurso = new ControladorCurso();

        Principal p = new Principal();
        p.setVisible(true);        

        controladorUsuarios.addAlumno("12345678", "", "Juan Esteban", "", "M", 2);
        controladorUsuarios.addProfesor("1545415", "", "José", "", "M", 1);
        controladorUsuarios.mostrarUsuarios();  

        controladorCurso.addCurso("IPC 1", "0770", "1545415", 5);
        controladorCurso.addCurso("MB1", "0123", "12345678", 8);
        controladorCurso.mostrarCursos();

//        controladorUsuarios.mostrarProfesores();
//        controladorUsuarios.mostrarAlumnos();
    }    
}
