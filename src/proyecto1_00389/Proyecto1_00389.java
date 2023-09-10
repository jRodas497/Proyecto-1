package proyecto1_00389;
import Grafico.Login;
import Clases.Listas;
import Grafico.Admin.VistaAdmin;

public class Proyecto1_00389 {

    public static void main(String[] args) {            
        Listas listas = new Listas();
        
        listas.controladorActividad.recibirListas(listas);
        listas.controladorCurso.recibirListas(listas);
        listas.controladorUsuario.recibirListas(listas);
        listas.controladorAlmXAct.recibirListas(listas);
        
        
        listas.controladorUsuario.addAlumno(10203040, "", "Juan Esteban", "", "M", 2);

        listas.controladorUsuario.addAlumno(15954845, "", "María", "", "F", 2);
        listas.controladorUsuario.addAlumno(98768032, "", "Carlos", "", "M", 2);
        listas.controladorUsuario.addAlumno(24681357, "", "Laura", "", "F", 2);
        listas.controladorUsuario.addAlumno(13579246, "", "Javier", "", "M", 2);
        listas.controladorUsuario.addAlumno(36985214, "", "Ana", "", "F", 2);
        listas.controladorUsuario.addAlumno(78945612, "", "Luis", "", "M", 2);
        listas.controladorUsuario.addAlumno(65412398, "", "Isabel", "", "F", 2);
        listas.controladorUsuario.addAlumno(56774212, "", "Roberto", "", "M", 2);
        listas.controladorUsuario.addAlumno(98145634, "", "Sofía", "", "F", 2);
        listas.controladorUsuario.addAlumno(43210987, "", "Diego", "", "M", 2);
        
        listas.controladorUsuario.addProfesor(1545415, "", "José", "", "M", 1);
        listas.controladorUsuario.addProfesor(24681359, "", "Luisa", "", "F", 3);
        listas.controladorUsuario.addProfesor(13579248, "", "Pedro", "", "M", 4);
        listas.controladorUsuario.addProfesor(98765434, "", "Marta", "", "F", 5);
        listas.controladorUsuario.addProfesor(36985216, "", "Andrés", "", "M", 6);
        listas.controladorUsuario.addProfesor(12345670, "", "Elena", "", "F", 7);
        listas.controladorUsuario.addProfesor(78945614, "", "José", "", "M", 8);
        listas.controladorUsuario.addProfesor(65412392, "", "Ana María", "", "F", 9);
        listas.controladorUsuario.addProfesor(56789014, "", "Raúl", "", "M", 10);
        listas.controladorUsuario.addProfesor(98127636, "", "Carolina", "", "F", 11);
        listas.controladorUsuario.addProfesor(43210989, "", "Marcelo", "", "M", 12);
        
        listas.controladorUsuario.addAdmin(1, "", "Juan Rodas", "", "M", 0);
        
        listas.controladorCurso.addCurso("IPC 1", 770, "1545415", 5,0);
        listas.controladorCurso.addCurso("MB1", 123, "12345678", 8,0);
        listas.controladorCurso.addCurso("Logica", 420, "12345678", 8,0);

        listas.controladorActividad.addActividad(1121, "HT #1", "ASDASDASDkjkljlkjkl", 81, 770);
        listas.controladorActividad.addActividad(11421, "HT #2", "asdasdplplpl", 14, 770);
        listas.controladorActividad.addActividad(18, "HT #3", "yhbyhbsadkfgf", 20, 123);
        listas.controladorActividad.addActividad(8488, "HT #4", "ikuj1212jkhkdsf", 80, 123);
        listas.controladorActividad.addActividad(1520, "HT #5", "sdhniunvriuvi", 1, 770);

        Login login = new Login();
        login.recibirListas(listas);
        login.setVisible(true);   
        
        listas.controladorUsuario.cantidadGenero();
        
//        listas.controladorUsuario.cantidadAlumnosF();
//        listas.controladorUsuario.cantidadAlumnosM();
//        listas.controladorUsuario.cantidadProfesoresF();
//        listas.controladorUsuario.cantidadProfesoresM();
        
        listas.controladorUsuario.porcentajeAlumnosM();
        listas.controladorUsuario.porcentajeAlumnosF();
        listas.controladorUsuario.porcentajeProfesoresM();
        listas.controladorUsuario.porcentajeProfesoresF();
        

//        VistaAdmin admin = new VistaAdmin();
//        admin.recibirListas(datosListas);
//        admin.setVisible(true);   
    }    
}
