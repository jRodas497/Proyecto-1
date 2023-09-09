package Clases;

import java.io.Serializable;

public class Curso implements Serializable{
    private String nombreCurso;
    private int codigo;
    private String profesor;
    private int creditos;   
    private int acumulado;

    public Curso(String nombreCurso, int codigo, String profesor, int creditos, int acumulado) {
        this.nombreCurso = nombreCurso;   
        this.codigo = codigo;             //El código del curso sera único
        this.profesor = profesor;         //Tendra +unicamente un profesor
        this.creditos = creditos;         //Creditos > 1
        this.acumulado = acumulado;
    }
    
    public void mostrarDatos(){
        System.out.print("Nombre: " + nombreCurso);
        System.out.print("  Codigo : " + codigo);
        System.out.print("  Profesor: " + profesor);
        System.out.print("  Creditos: " + creditos);
        System.out.print("  Acumulado: " + acumulado + "\n");
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", codigo=" + codigo + ", profesor=" + profesor + ", creditos=" + creditos + ", acumulado=" + acumulado + '}';
    }

    
}
