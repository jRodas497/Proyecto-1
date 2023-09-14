package Controllers;

import Clases.Actividad;
import Clases.AlumnoXActividad;
import Clases.Arrays;
import Clases.Curso;
import Clases.Listas;
import java.io.Serializable;
import java.util.ArrayList;      

public class ControladorAlumnoXActividad implements Serializable{
    Listas listas;
    ArrayList <AlumnoXActividad> userxact;
    
    public ControladorAlumnoXActividad() {
    }    

    public void recibirListas(Listas listas){
        this.listas = listas;
        userxact = listas.arrays.userxact;
    }
    
    public AlumnoXActividad getElement(int i){
        return this.userxact.get(i);
    }
    
    public void mostrarDatos(){
        int size = size();
        
        for (int i = 0; i < size; i++) {
            System.out.print("Actividad: " + listas.controladorActividad.actividadExist(userxact.get(i).getActividad()).getNombre());
            System.out.print("  Curso: " + listas.controladorCurso.cursoExist(listas.controladorActividad.actividadExist(userxact.get(i).getActividad()).getCurso()).getNombreCurso());
            System.out.print("  Alumno: " + listas.controladorUsuario.usuarioExist(userxact.get(i).getAlumno()).getNombre());
            System.out.println("  Punteo: " + userxact.get(i).getPunteo());
        }
    }
    
    public boolean cambiarNota(int alumno, int actividad, int punteo){
        int size = size();
        
        for (int i = 0; i < size; i++) {
            if (userxact.get(i).getAlumno() == alumno && userxact.get(i).getActividad() == actividad) {
                if (punteo >= 0 && punteo <= 100) {
                    userxact.get(i).setPunteo(punteo);
                    return true;
                }else{
                    mensaje("Punteo incorrecto");
                    return false;
                }
            }
        }
        return false;
    }
    
    public int size(){
        int size = userxact.size();
        return size;
    }
    
    public void añadirAlmActividades(int alumno, int curso){
        int sizeC = listas.controladorCurso.size();
        int sizeA = listas.controladorActividad.size();
        
        for (int i = 0; i < sizeC; i++) {
            Curso c = listas.controladorCurso.getElemento(i);

            for (int j = 0; j < sizeA; j++) {
                Actividad a = listas.controladorActividad.getElement(j);

                if (c.getCodigo() == curso && (a.getCurso() == c.getCodigo() )) {
                    userxact.add(new AlumnoXActividad(a.getCodigo(), alumno, 0));
                }
            }
        }
    }
    
    public void desasignarAlmActividades(int curso, int alumno){
        int sizeC = listas.controladorCurso.size();
        int sizeA = listas.controladorActividad.size();
        int sizeB = size();
        
        for (int i = 0; i < sizeC; i++) {
            Curso c = listas.controladorCurso.getElemento(i);
            
            for (int j = 0; j < sizeA; j++) {
                Actividad a = listas.controladorActividad.getElement(j);
                
                if (c.getCodigo() == a.getCurso() && c.getCodigo() == curso) {
                    for (int k = 0; k < sizeB; k++) {
                        if (userxact.get(k).getActividad() == a.getCodigo() && userxact.get(k).getAlumno() == alumno) {
                            userxact.remove(k);
                        }
                    }
                }
            }
        }
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
