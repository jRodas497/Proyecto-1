package Controllers;

import Clases.Curso;
import Clases.Listas;
import java.util.ArrayList;

public class ControladorCurso {
    private ArrayList <Curso> cursos;
    Listas listas;
    
    public ControladorCurso() {
        cursos = new ArrayList<>();
    }
    
    public void recibirListas(Listas listas){
        this.listas = listas;
    }
    
    public int acumulado(int codigo){
        int size = cursos.size();
        for (int i = 0; i < size; i++) {
            if(cursos.get(i).getCodigo() == codigo) return cursos.get(i).getAcumulado();
        }
        return 0;
    }
    
    public int size(){
        int size;
        return size = cursos.size();
    }
    
    public boolean cursoExist(int codigo){
        int size = cursos.size();
        
        for (int i = 0; i < size; i++) {
            if(cursos.get(i).getCodigo() == codigo) return true;
        }
        return false;
    }
    
    public void addCurso(String nombreCurso, int codigo, String profesor, int creditos, int acumulado){
        if (creditos > 0 && creditos <= 10) {
            if (!cursoExist(codigo)) {
                cursos.add(new Curso(nombreCurso, codigo, profesor, creditos, 0));
                mensaje("Curso añadido: " + nombreCurso + ", " + codigo + ", " + profesor + ", " + creditos);
            }else{
                mensaje("Ya existe un curso con este código");
            }
        }else{
            mensaje("La cantidad de creditos debe de ser mayor a 0 y menor a 10");
        }
    }
    
    public void mostrarCursos(){
        int size = cursos.size();
        
        if(size > 0){
            for (int i = 0; i < size; i++) {
                cursos.get(i).mostrarDatos();
            }
        }
    }
    
    public void editarCurso(int codigo, String nombre, int creditos, int acumulado){    
        int size = cursos.size();
        for (int i = 0; i < size; i++) {
            if(cursos.get(i).getCodigo() == codigo){
                if (creditos >= 0 && creditos <= 10) {
                    if (cursoExist(codigo)) {
                        if(nombre != "") cursos.get(i).setNombreCurso(nombre);      
                        if(acumulado != 0) cursos.get(i).setAcumulado(acumulado);
                        mensaje("Curso editado con exito!");
                        i = size;
                    }else{
                        mensaje("Codigo del curso inexistente");
                    }            
                }else{
                    mensaje("La cantidad de creditos debe de ser mayor a 0 y menor a 10");
                }
            }else{
                mensaje("Codigo del curso inexistente");
            }
        }
    }
    
    public void cambiarAcumulado(int codigo, int acumulado){
    int size = cursos.size();
    
        for (int i = 0; i < size; i++) {
            if(cursos.get(i).getCodigo() == codigo){
                if (cursoExist(codigo)) {

                    cursos.get(i).setAcumulado(acumulado);
                    
                    i = size;
                }else{
                    mensaje("Codigo del curso inexistente");
                }
            }
        }
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
