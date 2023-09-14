package proyecto1_00389;
import Grafico.Login;
import Clases.Listas;

public class Proyecto1_00389 {

    public static void main(String[] args) {            
        Listas listas = new Listas();
        
        listas.controladorActividad.recibirListas(listas);
        listas.controladorCurso.recibirListas(listas);
        listas.controladorUsuario.recibirListas(listas);
        listas.controladorAlmXAct.recibirListas(listas);
        listas.controladorUserXCurso.recibirListas(listas);        
        
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
        
        listas.controladorUsuario.addProfesor(15151515, "", "José", "", "M", 1);
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
        
        listas.controladorCurso.addCurso("IPC 1", 770, 15151515, 5,0,0);
        listas.controladorCurso.addCurso("MB1", 123, 15151515, 8,0,0);
        listas.controladorCurso.addCurso("Logica", 420, 43210989, 5,0,0);
        listas.controladorCurso.addCurso("Ética", 522, 43210989, 2,0,0);
        listas.controladorCurso.addCurso("Investigación", 335, 15151515, 3,0,0);
        listas.controladorCurso.addCurso("LDS", 240, 98127636,6,0,0);

        listas.controladorActividad.addActividad(20199, "HT #1", "Problema 10", 5, 770);
        listas.controladorActividad.addActividad(20200, "HT #2", "Problema 23", 5, 770);
        listas.controladorActividad.addActividad(20201, "EP1", "Parcial 1", 17, 770);
        listas.controladorActividad.addActividad(20202, "EP2", "Parcial 2", 17, 770);
        listas.controladorActividad.addActividad(20203, "EP3", "Parcial 3", 16, 770);
        listas.controladorActividad.addActividad(20204, "EF", "Examen Final", 25, 770);
        listas.controladorActividad.addActividad(1520, "HT #5", "Problema 6", 10, 420);
        listas.controladorActividad.addActividad(18, "HT #3", "Problema 11 - 22", 20, 123);
        listas.controladorActividad.addActividad(8488, "HT #4", "Examen P1", 20, 123);
                
        listas.controladorUserXCurso.asignarAlumno(10203040, 770);
        listas.controladorUserXCurso.asignarAlumno(10203040, 123);
        listas.controladorUserXCurso.asignarAlumno(10203040, 420);
        
        listas.controladorUserXCurso.asignarAlumno(65412398, 770);
        listas.controladorUserXCurso.asignarAlumno(65412398, 123);
        
        listas.controladorUserXCurso.asignarAlumno(78945612, 770);
        listas.controladorUserXCurso.asignarAlumno(36985214, 770);
        listas.controladorUserXCurso.asignarAlumno(13579246, 770);
        
        listas.controladorAlmXAct.mostrarDatos();
        
        System.out.println(listas.controladorAlmXAct.size());
        
        Login login = new Login();
        login.recibirListas(listas);
        login.setVisible(true);
        
//        listas.controladorUsuario.cantidadGenero();
        
//        listas.controladorUsuario.cantidadAlumnosF();
//        listas.controladorUsuario.cantidadAlumnosM();
//        listas.controladorUsuario.cantidadProfesoresF();
//        listas.controladorUsuario.cantidadProfesoresM();
        
//        listas.controladorUsuario.porcentajeAlumnosM();
//        listas.controladorUsuario.porcentajeAlumnosF();
//        listas.controladorUsuario.porcentajeProfesoresM();
//        listas.controladorUsuario.porcentajeProfesoresF();
    }    
}
