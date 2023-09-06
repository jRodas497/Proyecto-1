package Clases;

public class AlumnoXActividad {
    private int codigo;
    private int alumno;

    public AlumnoXActividad(int codigo, int alumno) {
        this.codigo = codigo;
        this.alumno = alumno;
    }
    
    public void mostrarRelacion(){
        System.out.print("Codigo: "+codigo);
        System.out.print("   Alumno: "+alumno);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAlumno() {
        return alumno;
    }

    public void setAlumno(int alumno) {
        this.alumno = alumno;
    }
    
    
}
