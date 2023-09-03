package Controllers;

import Clases.Usuarios;
import java.util.ArrayList;

public class ControladorUsuario {
    private ArrayList <Usuarios> usuarios;

    public ControladorUsuario() {
        usuarios = new ArrayList<>();
    }
    
    public Usuarios usuarioExist(String code){
        int size = usuarios.size();
        
        for (int i = 0; i < size; i++) {
            if(usuarios.get(i).getCode() == code) return usuarios.get(i);
        }
        return null;
    }
    
        
    public void mostrarUsuarios(){
        int size = usuarios.size();
        
        for (int i = 0; i < size; i++) {
            usuarios.get(i).mostrarDatos();
        }        
    }
    
    public void mostrarProfesores(){
        int size = usuarios.size();
        
        for (int i = 0; i < size; i++) {
            usuarios.get(i).mostrarProfesores();
        }        
    }
    
    public void mostrarAlumnos(){
        int size = usuarios.size();
        
        for (int i = 0; i < size; i++) {
            usuarios.get(i).mostrarAlumnos();
        }        
    }
    
    public void addProfesor(String code, String password, String nombre, String correo, String genero, int rol){
        //rol == 1
        String c1 = nombre.toLowerCase();
        c1 = c1.replaceAll("\\s","");
        
        if (usuarioExist(code) == null) {
            usuarios.add(new Usuarios(code, "1234", nombre, c1 + "@gmail.com", genero, 1));
//            mensaje("Se registro el usuario (Profesor): "  + code + ", " + nombre + ", " + correo + ", " + genero);
        }else{
            mensaje("El usuario ya existe");
        }
    }
    
    public void addAlumno(String code, String password, String nombre, String correo, String genero, int rol){
        //rol == 2
        String c1 = nombre.toLowerCase();
        c1 = c1.replaceAll("\\s","");
        
        if (usuarioExist(code) == null) {
            usuarios.add(new Usuarios(code, "1234", nombre, c1 + "@gmail.com", genero, 2));
//            mensaje("Se registro el usuario (Alumno): " + code + ", " + nombre + ", " + correo + ", " + genero);
        }else{
            mensaje("El usuario ya existe");
        }
    }
    
    public void addAdmin(String code, String password, String nombre, String correo, String genero, int rol){
        //rol == 0
        
        if (usuarioExist(code) == null) {
            usuarios.add(new Usuarios(code, "admin", nombre,"admin@admin.com", genero, 0));
//            mensaje("Se registro el usuario (Alumno): " + code + ", " + nombre + ", " + correo + ", " + genero);
        }else{
            mensaje("El usuario ya existe");
        }
    }
    
    public boolean login(String code, String password){
        if (usuarioExist(code) != null) {
            return true;
        }else{
            mensaje("No existe un usuario con el código: " + code);
            return false;
        }
    }

    private void mensaje(String msj){
        System.out.println(msj);
    }
}
