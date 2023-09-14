package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Arrays implements Serializable{
    public ArrayList <AlumnoXActividad> userxact;
    public ArrayList <Actividad> actividades;
    public ArrayList <UsuarioXCurso> userxcurso;

    public Arrays() {
        this.userxact = new ArrayList<>();
        this.actividades = new ArrayList<>();
        this.userxcurso = new ArrayList<>();
    }
}
