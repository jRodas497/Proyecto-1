package Controllers;

import Clases.Actividad;
import Clases.Listas;
import java.util.ArrayList;
import java.io.Serializable;

public class ControladorActividad implements Serializable{
    ArrayList <Actividad> actividades;
    Listas listas;
    
    
    public ControladorActividad() {
        actividades = new ArrayList<>();
    }

    public void recibirListas(Listas listas){
        this.listas = listas;
        actividades = listas.arrays.actividades;
    }

    public Actividad actividadExist(int codigo){
        int size = actividades.size();
        
        for (int i = 0; i < size; i++) {
            if (actividades.get(i).getCodigo() == codigo) return actividades.get(i);
        }
        return null;
    }
    
    public int size(){
        int size = actividades.size();
        return size;
    }
    
    public Actividad getElement(int i){
        return this.actividades.get(i);
    }
    
    public void mostrarActividades(){
        int size = actividades.size();
        
        for (int i = 0; i < size; i++) {
            actividades.get(i).mostrarDatos();
        }
    }
    
    public void mostrarActividadesDeCurso(int curso){
        int size = actividades.size();
        
        for (int i = 0; i < size; i++) {
            actividades.get(i).mostrarDatosDeCurso(curso);
        }        
    }
    
    public boolean addActividad(int codigo, String nombre, String descripcion, int punteo, int curso){
        if (actividadExist(codigo) == null) {
            if (punteo > 0 || punteo < 101) {
                if (punteo100(punteo, curso)) {
                    actividades.add(new Actividad(codigo, nombre, descripcion, punteo, curso));
                    mensaje("Se añadio la actividad: " + nombre);
                    return true;
                }            
            }else{
                mensaje("Punteo no valido");
            }
        }else{
            mensaje("La actividad ya existe");
        }
        return false;
    }
    
    public boolean punteo100(int pts, int curso){
        if(listas.controladorCurso.cursoExist(curso) == null){
            mensaje("El curso no existe");
            return false;
        }else{
            if (pts < 0) {
              mensaje("El puntaje de la actividad no puede ser negativo.");
              return false;
            } else if (listas.controladorCurso.acumulado(curso) + pts > 100) {
                mensaje("El acumulado total no puede exceder 100.");
                
            } else {    
                int acumuladoTotal = listas.controladorCurso.acumulado(curso);
                acumuladoTotal = acumuladoTotal + pts;
                listas.controladorCurso.cambiarAcumulado(curso, acumuladoTotal);      
                return true;
            }
        }
        return false;
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
