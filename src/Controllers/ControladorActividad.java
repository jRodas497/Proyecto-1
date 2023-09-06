package Controllers;

import Clases.Actividad;
import Controllers.ControladorCurso;
import java.util.ArrayList;

public class ControladorActividad {
    private ArrayList <Actividad> actividades;
    ControladorCurso controladorCurso = new ControladorCurso(); 
    
    public ControladorActividad() {
        actividades = new ArrayList<>();
    }
    
    public boolean actividadExist(int codigo){
        int size = actividades.size();
        
        for (int i = 0; i < size; i++) {
            if (actividades.get(i).getCodigo() == codigo) return true;
        }
        return false;
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
    
    public void addActividad(int codigo, String nombre, String descripcion, int punteo, int curso){
        if (!actividadExist(codigo)) {
            if (punteo100(punteo, curso)) {
                
                    actividades.add(new Actividad(codigo, nombre, descripcion, punteo, curso));
//                    mensaje("Se añadio la actividad");
                
            }else{
                mensaje("Actividad no valida");
            }
        }else{
            mensaje("la actividad ya existe");
        }
    }
    
    public boolean punteo100(int pts, int curso){
        if(controladorCurso.cursoExist(curso)){
            mensaje("El curso no existe");
            return false;
        }else{
            if (pts < 0) {
              mensaje("El puntaje de la actividad no puede ser negativo.");
            } else if (controladorCurso.acumulado(curso) + pts > 100) {
                mensaje("El acumulado total no puede exceder 100.");
            } else {
                int acumuladoTotal = controladorCurso.acumulado(curso);
                acumuladoTotal = acumuladoTotal + pts;
                acumulado(curso,acumuladoTotal);
                
            }
        }   
        return true;
    }
    
    public void acumulado(int curso, int pts){
        controladorCurso.cambiarAcumulado(curso, pts);
        System.out.println(curso + ", "+ pts);
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
