package proyecto1_00389;
import Grafico.Login;
import Clases.Listas;
import Grafico.VistaAdmin;

public class Proyecto1_00389 {

    public static void main(String[] args) {            
        Listas datosListas = new Listas();
        
        datosListas.controladorActividad.recibirListas(datosListas);
        datosListas.controladorCurso.recibirListas(datosListas);
        datosListas.controladorUsuario.recibirListas(datosListas);
        datosListas.controladorAlmXAct.recibirListas(datosListas);
        
        
        datosListas.controladorUsuario.addAlumno(10203040, "", "Juan Esteban", "", "M", 2);
        datosListas.controladorUsuario.addProfesor(1545415, "", "José", "", "M", 1);
        datosListas.controladorUsuario.addAdmin(12345678, "", "Juan Rodas", "", "M", 0);
        
        datosListas.controladorCurso.addCurso("IPC 1", 770, "1545415", 5,0);
        datosListas.controladorCurso.addCurso("MB1", 123, "12345678", 8,0);
        datosListas.controladorCurso.addCurso("Logica", 420, "12345678", 8,0);

        datosListas.controladorActividad.addActividad(1121, "HT #1", "ASDASDASDkjkljlkjkl", 81, 770);
        datosListas.controladorActividad.addActividad(11421, "HT #2", "asdasdplplpl", 14, 770);
        datosListas.controladorActividad.addActividad(18, "HT #3", "yhbyhbsadkfgf", 20, 123);
        datosListas.controladorActividad.addActividad(8488, "HT #4", "ikuj1212jkhkdsf", 80, 123);
        datosListas.controladorActividad.addActividad(1520, "HT #5", "sdhniunvriuvi", 1, 770);

//        Login login = new Login();
//        login.recibirListas(datosListas);
//        login.setVisible(true);   

        VistaAdmin admin = new VistaAdmin();
        admin.recibirListas(datosListas);
        admin.setVisible(true);   
    }    
}
