package Clases;
import Archivos.Binario;
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
    Binario binario;
    
    public Listas(){
        this.controladorCurso = new ControladorCurso();
        this.controladorActividad = new ControladorActividad();
        this.controladorUsuario = new ControladorUsuario();
        this.controladorAlmXAct = new ControladorAlumnoXActividad();
        this.binario = new Binario();
    }
    public Usuarios getUsuarios(int i){
        return this.controladorUsuario.mostrarUsuarios();
    }
    
    public int cantidadUsuarios(){
        return this.controladorUsuario.size();
    }
    
    public boolean almacenarUsuariosBin(){
        return this.binario.guardarUsuarios(this.controladorUsuario);
    }
    
    public void obtenerUsuarios(){
        this.controladorUsuario = this.binario.obtenerUsuarios();
    }
}
