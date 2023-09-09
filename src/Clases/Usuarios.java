package Clases;

import java.io.Serializable;

/*
    ROLES---->
    
    0 = Admin
    1 = Profesor
    2 = Alumno
*/

public class Usuarios implements Serializable{
    private int code;         //Parecido al NIT
    private String password;  //1234 por default, luego al editar el usuario se podra cambiar
    private String nombre;    
    private String correo;
    private String genero;    //M ó F
    private int rol;

    public Usuarios(int code, String password, String nombre, String correo, String genero, int rol) {
        this.code = code;
        this.password = password;
        this.nombre = nombre;
        this.correo = correo;
        this.genero = genero;
        this.rol = rol;
    }
    
    public void mostrarDatos(){
        System.out.print("Código: " + code);
        System.out.print("  Nombre: " + nombre);
        System.out.print("  Contraseña: " + password);
        System.out.print("  Correo: " + correo);
        System.out.print("  Genero: " + genero);
        if (rol == 0) System.out.print("  Administrador\n");
        if (rol == 1) System.out.print("  Profesor\n");
        if (rol == 2) System.out.print("  Alumno\n");
    }
    
    public void mostrarProfesores(){
        if (rol == 1){
            System.out.print("Código: " + code);
            System.out.print("  Nombre: " + nombre);
//            System.out.print("  Contraseña: " + password);
            System.out.print("  Correo: " + correo);
            System.out.print("  Genero: " + genero + "\n");
        }
    }
    
    public void mostrarAlumnos(){
        if (rol == 2){
            System.out.print("Código: " + code);
            System.out.print("  Nombre: " + nombre);
//            System.out.print("  Contraseña: " + password);
            System.out.print("  Correo: " + correo);
            System.out.print("  Genero: " + genero + "\n");
        }
    }
    
    public void datosUsuario(int codigo){
        if (code == codigo){
            System.out.print("Código: " + code);
            System.out.print("  Nombre: " + nombre);
            System.out.print("  Contraseña: " + password);
            System.out.print("  Correo: " + correo);
            System.out.print("  Genero: " + genero + "\n");
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }  

    @Override
    public String toString() {
        return "Usuarios{" + "code=" + code + ", password=" + password + ", nombre=" + nombre + ", correo=" + correo + ", genero=" + genero + ", rol=" + rol + '}';
    }
}
