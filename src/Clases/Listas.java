package Clases;
import Archivos.Binario;
import Controllers.ControladorActividad;
import Controllers.ControladorAlumnoXActividad;
import Controllers.ControladorCurso;
import Controllers.ControladorUsuario;
import Controllers.ControladorUsuarioXCurso;
import java.io.Serializable;

public class Listas implements Serializable{
    public ControladorCurso controladorCurso;
    public ControladorActividad controladorActividad;
    public ControladorUsuario controladorUsuario;
    public ControladorAlumnoXActividad controladorAlmXAct;
    public ControladorUsuarioXCurso controladorUserXCurso;
    public Arrays arrays;
    Binario binario;
    
    public Listas(){
        this.arrays = new Arrays();
        this.controladorCurso = new ControladorCurso();
        this.controladorActividad = new ControladorActividad();
        this.controladorUsuario = new ControladorUsuario();
        this.controladorAlmXAct = new ControladorAlumnoXActividad();
        this.controladorUserXCurso = new ControladorUsuarioXCurso();        
        this.binario = new Binario();
    }
    
    public boolean almacenarUsuariosBin(){
        return this.binario.guardarUsuarios(this.controladorUsuario);
    }
    
    public void obtenerUsuarios(){
        this.controladorUsuario = this.binario.obtenerUsuarios();
    }
    
    public boolean almacenarCursosBin(){
        return this.binario.guardarCursos(this.controladorCurso);
    }
    
    public void obtenerCursos(){
        this.controladorCurso = this.binario.obtenerCursos();
    }
    
    public boolean almacenarArraysBin(){
        return this.binario.guardarArrays(this.arrays);
    }
    
    public void obtenerArrays(){
        this.arrays = this.binario.obtenerArrays();
    }
}
