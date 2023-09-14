package Controllers;

import Clases.Listas;
import Clases.Curso;
import Clases.UsuarioXCurso;
import Clases.Usuarios;
import java.io.Serializable;
import java.util.ArrayList;

public class ControladorUsuarioXCurso implements Serializable {
    ArrayList <UsuarioXCurso> userxcurso;
    Listas listas;
    
    public ControladorUsuarioXCurso() {
        userxcurso = new ArrayList<>();
    }
    
    public void recibirListas(Listas listas){
        this.listas = listas;
        this.userxcurso = listas.arrays.userxcurso;
    }
    
    public int size(){
        int size = userxcurso.size();
        return size;
    }
    
    public boolean asignarAlumno(int usuario, int curso){
        int size = size();
        int contador = 0;
        
        if (listas.controladorUsuario.usuarioExist(usuario) != null && listas.controladorUsuario.usuarioExist(usuario).getRol() == 2) {
            if (listas.controladorCurso.cursoExist(curso) != null) {
                Usuarios u = listas.controladorUsuario.usuarioExist(usuario);
                Curso c = listas.controladorCurso.cursoExist(curso);

                for (int i = 0; i < size; i++) {
                    if (userxcurso.get(i).getUsuario() == usuario && userxcurso.get(i).getCurso() == curso) {
                        mensaje("El alumno ya se encuentra inscrito a este curso");
                        return false;
                    }
                }
                
                for (int i = 0; i < size; i++) {
                    if (userxcurso.get(i).getCurso() == curso) {
                        contador++;
                        if (contador == 50) {
                            mensaje("Ya se encuentran muchos estudiantes asignados");
                            return false;
                        }
                    }
                }
                
                userxcurso.add(new UsuarioXCurso(usuario, curso));
                listas.controladorAlmXAct.añadirAlmActividades(usuario, curso);
                listas.controladorCurso.inscribir(curso);
                mensaje("Se asigno al alumno " + u.getNombre() + " al curso!");
                
            }else{
                mensaje("No existe un curso con estos datos");
                return false;
            }      
        }else{
            mensaje("Usuario enviado no valido");
            return false;
        }        
        return false;
    }
   
    public void mostrarDatos(){
        int size = size();
        
        for (int i = 0; i < size; i++) {
            System.out.print("Curso: " + listas.controladorCurso.cursoExist(userxcurso.get(i).getCurso()).getNombreCurso());
            System.out.print("  Código: " + listas.controladorUsuario.usuarioExist(userxcurso.get(i).getUsuario()).getCode());
            System.out.print("  Alumno: " + listas.controladorUsuario.usuarioExist(userxcurso.get(i).getUsuario()).getNombre() + "\n");
        }
    }
    
    public boolean desasignar(int usuario, int curso){
        int size = size();
        
        for (int i = 0; i < size; i++) {
            if (userxcurso.get(i).getUsuario() == usuario && userxcurso.get(i).getCurso() == curso) {
                userxcurso.remove(i);
                
                //listas.controladorAlmXAct.desasignarAlmActividades(curso, usuario);
                listas.controladorCurso.desasignar(curso);                
                mensaje("Alumno eliminado del curso " + listas.controladorCurso.cursoExist(curso).getNombreCurso());
                return true;
            }
        }
        return false;
    }
    
    public UsuarioXCurso getElemento(int i){
        return this.userxcurso.get(i);
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
