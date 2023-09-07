package Clases;

public class Actividad {
    private int codigo;             //Únicamente datos númericos
    private String nombre;
    private String descripcion;
    private int punteo;             //Mayor a 1 y menor a 100
    private int curso;              //Curso al que la actividad esta asignada

    public Actividad(int codigo, String nombre, String descripcion, int punteo, int curso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.punteo = punteo;
        this.curso = curso;
    }
           
    public void mostrarDatos(){
        System.out.print("Nombre: " + nombre);
        System.out.print("   Codigo: " + codigo);        
        System.out.print("   Descripción: " + descripcion);
        System.out.print("   Punteo: " + punteo);
        System.out.print("   Curso: " + curso + "\n");
    }
    
    public void mostrarDatosDeCurso(int ID){
        if (ID == curso) {
            System.out.print("Nombre: " + nombre);
            System.out.print("   Descripción: " + descripcion);
            System.out.print("   Punteo: " + punteo);
            System.out.print("   Curso: " + curso + "\n");
        }
    }

    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
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

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Actividad{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", punteo=" + punteo + ", curso=" + curso + '}';
    } 
}
