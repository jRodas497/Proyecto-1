package Clases;

import java.io.Serializable;

public class Curso implements Serializable{
    private String nombreCurso;
    private int codigo;
    private int profesor;
    private int creditos;   
    private int acumulado;
    private int alumnos;

    public Curso(String nombreCurso, int codigo, int profesor, int creditos, int acumulado, int alumnos) {
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
        System.out.print("  Acumulado: " + acumulado);
        System.out.print("  Alumnos: " + alumnos + "\n");
    }

    public void cursosDeProf(int profesor){
        if (this.profesor == profesor) {
            System.out.print("Nombre: " + nombreCurso);
            System.out.print("  Codigo : " + codigo);
            System.out.print("  Creditos: " + creditos);
            System.out.print("  Acumulado: " + acumulado);
            System.out.print("  Alumnos: " + alumnos + "\n");
        }
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

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
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

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", codigo=" + codigo + ", profesor=" + profesor + ", creditos=" + creditos + ", acumulado=" + acumulado + ", alumnos=" + alumnos + '}';
    }
}
