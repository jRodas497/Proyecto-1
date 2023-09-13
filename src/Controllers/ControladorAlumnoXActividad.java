package Controllers;

import Clases.AlumnoXActividad;
import Clases.Listas;
import java.io.Serializable;
import java.util.ArrayList;      

public class ControladorAlumnoXActividad implements Serializable{
    private ArrayList <AlumnoXActividad> userxact;
        Listas listas;

    public void recibirListas(Listas listas){
        this.listas = listas;
    }
    
    public ControladorAlumnoXActividad() {
        userxact = new ArrayList();
    }
    
    public void actividadExist(int codigo){
        
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
