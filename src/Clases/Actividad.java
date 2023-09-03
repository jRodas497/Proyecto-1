package Clases;

public class Actividad {
    private String nombre;
    private String descripcion;
    private int punteo;             //Mayor a 1 y menor a 100
    private String curso;           //Curso al que la actividad esta asignada

    public Actividad(String nombre, String descripcion, int punteo, String curso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.punteo = punteo;
        this.curso = curso;
    }
           
    public void mostrarDatos(){
        System.out.print("Nombre: " + nombre);
        System.out.print("Descripción: " + descripcion);
        System.out.print("Punteo: " + punteo);
        System.out.print("Curso: " + curso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
