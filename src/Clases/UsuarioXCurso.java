package Clases;

import java.io.Serializable;

public class UsuarioXCurso implements Serializable{
    private int usuario;
    private int curso;

    public UsuarioXCurso(int usuario, int curso) {
        this.usuario = usuario;
        this.curso = curso;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "AlumnoXCurso{" + "usuario=" + usuario + ", curso=" + curso + '}';
    }
}
