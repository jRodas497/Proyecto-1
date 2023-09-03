package Controllers;

import Clases.Curso;
import Controllers.ControladorUsuario;
import java.util.ArrayList;

public class ControladorCurso {
    ControladorUsuario controladorUsuario = new ControladorUsuario();
    private ArrayList <Curso> cursos;
    
    public ControladorCurso() {
        cursos = new ArrayList<>();
    }
    
    public Curso cursoExist(String codigo){
        int size = cursos.size();
        
        for (int i = 0; i < size; i++) {
            if(cursos.get(i).getCodigo() == codigo) return cursos.get(i);
        }
        return null;
    }
    
    public void addCurso(String nombreCurso, String codigo, String profesor, int creditos){
        if (creditos > 0 && creditos <= 10) {
            if (cursoExist(codigo) == null) {
                cursos.add(new Curso(nombreCurso, codigo, profesor, creditos));
//                mensaje("Curso añadido: " + nombreCurso + ", " + codigo + ", " + profesor + ", " + creditos);
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
        }else{
        
        }        
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
