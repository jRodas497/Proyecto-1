package Controllers;

import Clases.Curso;
import Clases.Listas;
import java.io.Serializable;
import java.util.ArrayList;

public class ControladorCurso implements Serializable {
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
    
    public Curso cursoExist(int codigo){
        int size = cursos.size();
        
        for (int i = 0; i < size; i++) {
            if(cursos.get(i).getCodigo() == codigo) return cursos.get(i);
        }
        return null;
    }
    
    public Curso getElemento(int i){
        return this.cursos.get(i);
    }
    
    public boolean addCurso(String nombreCurso, int codigo, int profesor, int creditos, int acumulado, int i){
        if (creditos > 0 && creditos <= 10) {
            if (cursoExist(codigo) == null) {
                cursos.add(new Curso(nombreCurso, codigo, profesor, creditos, 0, 0));
                mensaje("Curso añadido: " + nombreCurso + ", " + codigo + ", " + profesor + ", " + creditos);
                return true;
            }else{
                mensaje("Ya existe un curso con este código");
            }
        }else{
            mensaje("La cantidad de creditos debe de ser mayor a 0 y menor a 10");
        }
        return false;
    }
    
    public void mostrarCursos(){
        int size = cursos.size();
        
        if(size > 0){
            for (int i = 0; i < size; i++) {
                cursos.get(i).mostrarDatos();
            }
        }
    }
    
    public void mostrarCursosProf(int prof){
        int size = size();
        
        for (int i = 0; i < size; i++) {
            cursos.get(i).cursosDeProf(prof);
        }
    }
    
    public boolean editarCurso(int codigo, String nombre, int creditos){    
        int size = cursos.size();
        for (int i = 0; i < size; i++) {
            if(cursos.get(i).getCodigo() == codigo){
                if (creditos >= 0 && creditos <= 10) {
                    if (cursoExist(codigo) != null) {
                        if(nombre != "") cursos.get(i).setNombreCurso(nombre);      
                        if(creditos != 0) cursos.get(i).setCreditos(creditos);
                        mensaje("Curso editado con exito!");
                        return true;
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
        return false;
    }
    
    public boolean eliminarCurso(int codigo){
        int size = size();
        
        for (int i = 0; i < size; i++) {
            if (cursos.get(i).getCodigo() == codigo) {
                cursos.remove(i);
                mensaje("Curso aliminado con exito!");
                return true;
            }
        }
        return false;
    }
    
    public void cambiarAcumulado(int codigo, int acumulado){
    int size = cursos.size();
    
        for (int i = 0; i < size; i++) {
            if(cursos.get(i).getCodigo() == codigo){
                if (cursoExist(codigo) != null) {

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
