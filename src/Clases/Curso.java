package Clases;

public class Curso {
    private String nombreCurso;
    private String codigo;
    private String profesor;
    private int creditos;   

    public Curso(String nombreCurso, String codigo, String profesor, int creditos) {
        this.nombreCurso = nombreCurso;   
        this.codigo = codigo;             //El código del curso sera único
        this.profesor = profesor;         //Tendra +unicamente un profesor
        this.creditos = creditos;         //Creditos > 1
    }
    
    public void mostrarDatos(){
        System.out.print("Nombre: " + nombreCurso);
        System.out.print("  Codigo : " + codigo);
        System.out.print("  Profesor: " + profesor);
        System.out.print("  Creditos: " + creditos +"\n");
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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
    
    
}
