package Clases;

import java.io.Serializable;

public class AlumnoXActividad implements Serializable{
    private int actividad;
    private int alumno;
    private int punteo;

    public AlumnoXActividad(int actividad, int alumno, int punteo) {
        this.actividad = actividad;
        this.alumno = alumno;
        this.punteo = punteo;
    }
    
    public void mostrarRelacion(){
        System.out.print("Actividad: "+actividad);
        System.out.print("   Alumno: "+alumno);
        System.out.println("  Punteo: "+punteo);
    }

    public int getActividad() {
        return actividad;
    }

    public void setActividad(int actividad) {
        this.actividad = actividad;
    }

    public int getAlumno() {
        return alumno;
    }

    public void setAlumno(int alumno) {
        this.alumno = alumno;
    }

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }

    @Override
    public String toString() {
        return "AlumnoXActividad{" + "actividad=" + actividad + ", alumno=" + alumno + ", punteo=" + punteo + '}';
    }
}
