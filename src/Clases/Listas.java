package Clases;
import Controllers.ControladorActividad;
import Controllers.ControladorAlumnoXActividad;
import Controllers.ControladorCurso;
import Controllers.ControladorUsuario;
import java.io.Serializable;

public class Listas implements Serializable{
    public ControladorCurso controladorCurso;
    public ControladorActividad controladorActividad;
    public ControladorUsuario controladorUsuario;
    public ControladorAlumnoXActividad controladorAlmXAct;
    
    public Listas(){
        this.controladorCurso = new ControladorCurso();
        this.controladorActividad = new ControladorActividad();
        this.controladorUsuario = new ControladorUsuario();
        this.controladorAlmXAct = new ControladorAlumnoXActividad();
    }
}
