package Controllers;

import Clases.AlumnoXActividad;
import java.util.ArrayList;      

public class ControladorAlumnoXActividad {
    ControladorUsuario controladorUsuario = new ControladorUsuario();
    ControladorActividad controladorActividad = new ControladorActividad();
    private ArrayList <AlumnoXActividad> almxact;
    
    public ControladorAlumnoXActividad() {
        almxact = new ArrayList();
    }
    
    public void actividadExist(int codigo){
        if(controladorActividad.actividadExist(codigo)){
               
        }
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
